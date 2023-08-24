Insert into ingredients
values("spaghetti","No","Yes","Yes","No");
Insert into ingredients
values("Beef Patty","No","No","No","Yes");
Insert into ingredients
values("Eggs","No","No","No","Yes");
Insert into ingredients
values("Bread","Yes","Yes","Yes","No");
Insert into ingredients
values("Lettuce","No","Yes","Yes","Yes");
Insert into ingredients
values("Yoghurt","No","Yes","Yes","Yes");

/*To select column name of all ingredients*/

select ingredient from ingredients;

/*To select ingredients and price*/
select ingredient, price from ingredients;

/*Select all the columns ordered by name*/
select * from ingredients order by ingredient;

/*select all columns and order by gluten free with true at the top*/
select * from ingredients order by gluten_free desc ;
