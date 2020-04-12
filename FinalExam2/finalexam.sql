drop database if exists WORKSSS;
create database if not exists WORKSSS;

use WORKSSS;
 
drop table if exists IT;
create table if not exists IT(
FIRSTNAME nvarchar(30) not null,
LASTNAME nvarchar(30) not null,
PHONE nchar(9) not null,
EMAIL nvarchar(255) not null,
`PASSWORD` nvarchar(30) not null, 
EXPINYEAR int not null,
primary key(FIRSTNAME)
);

INSERT INTO IT( FIRSTNAME, LASTNAME, PHONE, EMAIL,`PASSWORD`, EXPINYEAR)
VALUES( 'north', 'NORTH', 'MEN', 'north@gmail.com','qwer', 8);

drop table if exists ITS;
create table if not exists ITS(
FIRSTNAME nvarchar(30) not null,
LASTNAME nvarchar(30) not null,
PHONE nchar(9) not null,
EMAIL nvarchar(255) not null,
`PASSWORD` nvarchar(30) not null,
PROJECTNAME nvarchar(30) not null,
PROSKILL nvarchar(30) not null,
primary key(FIRSTNAME)
);

INSERT INTO ITS( FIRSTNAME, LASTNAME, PHONE, EMAIL,`PASSWORD`, PROJECTNAME, PROSKILL)
VALUES( 'north', 'NORTH', 'MEN', 'north@gmail.com','asdf', 'flash','speech force');

select *
from IT;

select *
from ITS;