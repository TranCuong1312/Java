USE ADVENTUREWORKS;

/*E1*/

/*1*/

SELECT  p.`Name`
FROM   product p
join   productsubcategory ps on p.ProductSubcategoryID=ps.ProductSubcategoryID
WHERE  ps.`Name` = 'Saddles';

/*2*/

SELECT p.ProductID, p.`Name`, p.ProductSubcategoryID, ps.`Name`
FROM   product p
join   productsubcategory ps on p.ProductSubcategoryID=ps.ProductSubcategoryID
WHERE  ps.`Name` like 'BO%';

SELECT p.ProductID, p.`Name`
FROM   product p
where p.ProductSubcategoryID in (select ProductSubcategoryID
                               from productsubcategory
                               where `Name` = 'Saddles');

/*3*/

select `Name`
from product
where ProductSubcategoryID = 3 and ListPrice= (select min(ListPrice)
											   from product
											   where ProductSubcategoryID = 3);
                  
/*E2*/

/*1*/

select cr.`Name`, sp.`Name`
from stateprovince sp
join countryregion cr on cr.CountryRegionCode = sp.CountryRegionCode
group by sp.`Name`;

/*2*/

select cr.`Name`, sp.`Name`
from stateprovince sp
join countryregion cr on cr.CountryRegionCode = sp.CountryRegionCode
group by sp.`Name`
having cr.`Name` like 'Canada%' or cr.`Name` like'Germany%' ;





       





