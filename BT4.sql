DROP DATABASE IF EXISTS WORKS;
CREATE DATABASE IF NOT EXISTS WORKS;

USE WORKS;

DROP TABLE IF EXISTS EMPLOYEES;
CREATE TABLE IF NOT EXISTS EMPLOYEES
(
	EMPLOYEEID				TINYINT 		NOT NULL,
    EMPLOYEELASTNAME		VARCHAR(30)		NOT NULL,
    EMPLOYEEFIRSTNAME		VARCHAR(30)		NOT NULL,
    EMPLOYEEHIREDATE		DATETIME		NOT NULL,
    EMPLOYEESTATUS			VARCHAR(100)			,
    SUPERVISORID			TINYINT					,
    SOCIALSECURITYNUMBER	CHAR(9)			NOT NULL,
    PRIMARY KEY(EMPLOYEEID)
);


DROP TABLE IF EXISTS PROJECTS;
CREATE TABLE IF NOT EXISTS PROJECTS
(
	PROJECTID				TINYINT			NOT NULL,
    EMPLOYEEID				TINYINT 		NOT NULL,
	PROJECTNAME				VARCHAR(10)		NOT NULL,
    PROJECTSTARTDATE		DATETIME		NOT NULL,
    PROJECTDESCRIPTION		VARCHAR(100)	NOT NULL,
    PROJECTDETAIL			VARCHAR(100)	NOT NULL,
    PROJECTCOMPLETEDON		DATETIME 		NOT NULL,
    PRIMARY KEY(PROJECTID),
   	FOREIGN KEY(EMPLOYEEID) 	REFERENCES EMPLOYEES(EMPLOYEEID)
);

 DROP TABLE IF EXISTS MODULES;
 CREATE TABLE IF NOT EXISTS MODULES
 (
	MODULEID					REAL			NOT NULL,
    PROJECTID					TINYINT			NOT NULL,
    EMPLOYEEID					TINYINT 		NOT NULL,
    PROJECTMODULESDATE			DATETIME 		NOT NULL,
    PROJECTMODULECOMPLETEDON	DATETIME 		NOT NULL,
    PROJECTMODULEDESCRIPTION	VARCHAR(100)	NOT NULL,
    PRIMARY KEY(MODULEID),
     FOREIGN KEY(PROJECTID) 	REFERENCES PROJECTS(PROJECTID),
     FOREIGN KEY(EMPLOYEEID) 	REFERENCES EMPLOYEES(EMPLOYEEID)
);

DROP TABLE IF EXISTS	WORKDONES;
CREATE TABLE IF NOT EXISTS	WORKDONES
(
	WORKDONEID				TINYINT			NOT NULL,
    EMPLOYEEID				TINYINT			NOT NULL,
    MODULEID				REAL			NOT NULL,
    WORKDONEDATE			DATETIME		NOT NULL,
    WORKDONEDESCRIPTION		VARCHAR(100)	NOT NULL,
    WORKDONESTATUS			VARCHAR(100)			,
    PRIMARY KEY(WORKDONEID),
	FOREIGN KEY(EMPLOYEEID) 	REFERENCES EMPLOYEES(EMPLOYEEID),
   	FOREIGN KEY(MODULEID) 		REFERENCES	MODULES(MODULEID)
);

INSERT INTO EMPLOYEES(EMPLOYEEID,EMPLOYEELASTNAME,EMPLOYEEFIRSTNAME,EMPLOYEEHIREDATE,EMPLOYEESTATUS,SUPERVISORID,SOCIALSECURITYNUMBER)
VALUES				 (		   1,		   'HARD',			  'BAM',    '2018-12-12',          NULL,		   4,         '999999999'),
					 (		   2, 		   'WEST',			   'HE',    '2018-12-12',        'COOL',  		   4,         '123456789'),
                     (		   3,		   'EAST',			   'HO',    '2018-12-12',         'NAH',		   4,         '987654321'),
                     (		   4,		   'LOWW',			   'FK',    '2018-12-12',          NULL,	    NULL,         '000000000');
                     
INSERT INTO PROJECTS(PROJECTID,EMPLOYEEID,PROJECTNAME,PROJECTSTARTDATE,PROJECTDESCRIPTION,PROJECTDETAIL,PROJECTCOMPLETEDON)
VALUES				(		 1,         2,     'YEAH',    '2019-01-03',        'HEYYYYYY',       'TALA',      '2019-01-30'),
					(		 2,			3,		'DWD',    '2019-01-04',         'WHAAAAA',        'AFD',      '2019-02-01'),
                    (		 3,			1,		'WEW',    '2019-01-05',         'WOEEEEE',       'ADSA',      '2019-02-02');
				
INSERT INTO MODULES(MODULEID,PROJECTID,EMPLOYEEID,PROJECTMODULESDATE,PROJECTMODULECOMPLETEDON,PROJECTMODULEDESCRIPTION)
VALUES			   (	1.1,		1,			2,      '2019-01-03',            '2019-01-04',                'EREWRE'),
				   (	1.2,		1,			2,      '2019-01-04',            '2019-01-30',                  'EWQR'),
                   (	2.1,		2,			3,      '2019-01-04',            '2019-02-01',                  'ADSD'),
                   (	3.1,		3,			1,      '2019-01-05',            '2019-02-02',                  'XZCZ');
				
INSERT INTO WORKDONES(WORKDONEID,EMPLOYEEID,MODULEID,WORKDONEDATE,WORKDONEDESCRIPTION,WORKDONESTATUS)
VALUES				 (		   1,		  2,	 1.1,'2019-01-04',           'ERDFSD',          NULL),
					 (		   2,         2,     1.2,'2019-01-30',            'SAFAD',          NULL),
                     (		   3,		  3,	 2.1,'2019-12-31',            'ADFSF',          NULL);
                     


/*2*/

DELIMITER $$
CREATE PROCEDURE WORKDONE_PROJECT()
BEGIN

	SELECT PROJECTID, PROJECTNAME
    FROM   PROJECTS
    WHERE  PROJECTCOMPLETEDON - PROJECTSTARTDATE <120;
    
END $$
DELIMITER ;

CALL WORKDONE_PROJECT();

SELECT PROJECTID, PROJECTNAME
FROM   PROJECTS
WHERE  PROJECTCOMPLETEDON-PROJECTSTARTDATE <90;
    
/*3*/



DELIMITER $$
CREATE PROCEDURE WORKING(OUT MODULE_STILL_ON_WORK REAL)
BEGIN
    SET  	@CURDATE = SYSDATE();
	SELECT 	M.MODULEID INTO MODULE_STILL_ON_WORK
    FROM 	MODULES M
    JOIN 	WORKDONES W ON M.MODULEID=W.MODULEID
    WHERE 	@CURDATE - M.PROJECTMODULESDATE < W.WORKDONEDATE-M.PROJECTMODULESDATE	;
END $$

DELIMITER ;

CALL WORKING();

/*4*/

SET GLOBAL log_bin_trust_function_creators = 1;

DELIMITER $$
CREATE FUNCTION WHATSHISFACE(NOBODY TINYINT)
RETURNS TINYINT
BEGIN

	DECLARE WHATSHISFACE TINYINT;
	SELECT	EMPLOYEEID INTO WHATSHISFACE
	FROM 	EMPLOYEES 
    WHERE 	NOBODY NOT IN (SELECT EMPLOYEEID
						   FROM   MODULES     );
    RETURN 	WHATSHISFACE;
    
    
END $$
DELIMITER ;

SELECT WHATSHISFACE();




 
                   