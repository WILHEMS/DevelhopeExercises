/*Create table for cheap meals*/
create table CHEAP_MEALS as
select * from meals where price<15;

/* create table from clone */
create table vegan_ingredient as select * from ingredients where false;

/*insert all vegan ingredients */
insert into vegan_ingredient(ingredient, contains_lactose, vegeterian, vegan, gluten_free, price)
select * from ingredients where vegan;

/*create a view for expensive meals*/
create view EXPENSIVE_MEAL as select * from meals where price>15;

/*Create a view for lactose free ingredients called LACTOSE_FREE_INGREDIENT*/
create view LACTOSE_FREE_INGREDIENT as select * from ingredients where !contains_lactose;


/*create a table for meals with over 650 calories*/
create table HIGH_CALORIE_MEAL as select * from meals where calories>650;