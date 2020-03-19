/*1*/

DROP DATABASE IF EXISTS BULDING;
CREATE DATABASE IF NOT EXISTS BULDING;

USE BULDING;

DROP TABLE IF EXISTS DEPARTMENTS;
CREATE TABLE IF NOT EXISTS DEPARTMENTS
(
      DEPARTMENT_ID    TINYINT     NOT NULL,
      DEPARTMENT_NAME  VARCHAR(20) NOT NULL,
      PRIMARY KEY (DEPARTMENT_ID)
);

DROP TABLE IF EXISTS EMPLOYEES;
CREATE TABLE IF NOT EXISTS EMPLOYEES
(
     EMPLOYEE_ID    TINYINT      NOT NULL,
     EMPLOYEE_NAME  NVARCHAR(30) NOT NULL,
     DEPARTMENT_ID  TINYINT      NOT NULL,
     PRIMARY KEY (EMPLOYEE_ID),
     FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID)
);

DROP TABLE IF EXISTS EMPLOYEE_SKILLS;
CREATE TABLE IF NOT EXISTS EMPLOYEE_SKILLS
( 
     EMPLOYEE_ID            TINYINT     NOT NULL,
     EMPLOYEE_SKILL_CODE    VARCHAR(30) NOT NULL,
     DATE_REGISTERED        DATETIME    NOT NULL,
     PRIMARY KEY(EMPLOYEE_SKILL_CODE),
     FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEES(EMPLOYEE_ID)
);

/*2*/

INSERT INTO DEPARTMENTS(DEPARTMENT_ID, DEPARTMENT_NAME)

VALUES                 (            1,         'NORTH'),
					   (            2,		   'SOUTH'),
                       (			3,			'WEST'),
                       (			4,			'EAST'),
                       (			5,	  'NORTH-WEST'),
                       (			6,	  'NORTH-EAST'),
                       (			7,	  'SOUTH-WEST'),
                       (			8,	  'SOUTH-EAST'),
                       (			9,		 'CENTRAL'),
                       (		   10,		 'NOWHERE');
                       
INSERT INTO EMPLOYEES(EMPLOYEE_ID, EMPLOYEE_NAME, DEPARTMENT_ID)

VALUES               (          1,         'HUH',             1),
					 (			2,         'BAE',			  2),
                     (			3,		   'NAH',			  3),
                     (			4,		   'HAH',			  3),
                     (			5,		   'ZAO',			  5),
                     (			6,	 'CHACHACHA', 			  6),
                     (			7,        'BOOM',			  7),
                     (			8,         'BAM',			  8),
                     (			9,  'CHUCKCHUCK',			  9),
                     (		   10,     'BLAHHHH', 			 10);

INSERT INTO EMPLOYEE_SKILLS(EMPLOYEE_ID, EMPLOYEE_SKILL_CODE, DATE_REGISTERED)

VALUES                     (          1,             'DANCE',      '1999-5-4'),
						   (		  2,           'NAUGHTY',      '1999-6-3'),
                           (		  3,         'BLIND-MAP',      '1999-2-3'),
                           (		  4, 		  'QUILLING',      '1999-4-5'),
                           (		  5,              'JAVA',	   '1999-7-5'),
                           (		  6,'CHALLENGE_EXCEPTED',      '2000-4-6'),
                           (		  7,          'COOK-POO',      '1321-5-6'),
                           (		  8,         'SHEILD-UP',      '1800-4-5'),
                           (          9,             'POKER',      '1000-4-1'),
                           (         10,      'KING-COMMAND',      '1212-4-4');

/*3*/
                           
SELECT     E.EMPLOYEE_NAME, E.EMPLOYEE_ID, S.EMPLOYEE_SKILL_CODE
FROM       EMPLOYEES E
JOIN       EMPLOYEE_SKILLS S ON E.EMPLOYEE_ID=S.EMPLOYEE_ID
WHERE      S.EMPLOYEE_SKILL_CODE='JAVA';

/*4*/

SELECT     D.DEPARTMENT_NAME, E.DEPARTMENT_ID, COUNT(*) 
FROM       EMPLOYEES E
JOIN       DEPARTMENTS D ON D.DEPARTMENT_ID=E.DEPARTMENT_ID
GROUP BY   E.DEPARTMENT_ID
HAVING     COUNT(*)>=3;

/*5*/
     
SELECT D.DEPARTMENT_ID, D.DEPARTMENT_NAME, GROUP_CONCAT(E.EMPLOYEE_NAME SEPARATOR ', ') AS T
FROM   EMPLOYEES E
LEFT JOIN       DEPARTMENTS D ON D.DEPARTMENT_ID=E.DEPARTMENT_ID
GROUP BY   D.DEPARTMENT_NAME;

/*6*/

SELECT     E.EMPLOYEE_NAME, S.EMPLOYEE_ID, S.EMPLOYEE_SKILL_CODE, COUNT(*)
FROM       EMPLOYEE_SKILLS S
JOIN       EMPLOYEES E ON E.EMPLOYEE_ID=S.EMPLOYEE_ID
GROUP BY   S.EMPLOYEE_SKILL_CODE
HAVING     COUNT(*)>=2;







                           
                           
                           
                           

