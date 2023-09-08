/* Using the INGREDIENT and MEAL tables, write a query to return the name of all meals that contain garlic.*/
select * from meals where ingredient='garlic';

/* Using the INGREDIENT and MEAL tables, write a query to return the number of meals with vegetarian ingredients.*/
select count(meals.name) from meals, ingredients where ingredients.vegeterian=true;

/* Using the INGREDIENT and MEAL tables, write a query to return the names of meals that have at least 1 gluten free ingredient and at least 1 vegan ingredient.*/
select name from meals where not ingredient.gluten and ingredient.vegan;

/* Using the INGREDIENT and MEAL tables, write a query to return the average number of ingredients per meal.*/
select avg(ingredient) from meals;

/* Using the INGREDIENT and MEAL tables, write a query to return the names of meals that have more than 3 ingredients.*/
select name, count(*) from meals where ingredient > 3;

/* Using the following table definitions, write an inner join for the two tables*/
CREATE TABLE CUSTOMER (
    CUSTOMER_ID INT,
    NAME VARCHAR(255),
    ADDRESS VARCHAR(255)
);

CREATE TABLE ORDER (
    ORDER_ID INT,
    CUSTOMER_ID INT,
    ORDER_DATE DATE,
    TOTAL_COST DECIMAL(10,2)
);

insert into customer(customer_id, name, address) values (1, 'Bolton', 'Nairobi'), (2, 'Jesse', 'Kisumu'), (3, 'Derick', 'Hurlingham'),(4, 'Joy', 'Canada');
insert into order values (1, 1, now(), 20000.00), (2, 4, now(), 50000.0), (3, 2, now(), 750000.00);

select * from customer inner join order on order.CUSTOMER_ID=CUSTOMER.CUSTOMER_ID;

/* Using the following table definitions, write an inner join for the two tables*/

CREATE TABLE PRODUCT (
    PRODUCT_ID INT,
    NAME VARCHAR(255),
    PRICE DECIMAL(10,2)
);
CREATE TABLE INVENTORY (
    PRODUCT_ID INT,
    STORE_ID INT,
    QUANTITY INT
);

insert into PRODUCT(product_id, name, price) values (1, 'Bike', 15000.0), (2, 'Bmw', 45000.0), (3, 'Jeep', 25.0), (4, 'TrackHawk', 50000.0);
insert into INVENTORY(product_id, store_id, quantity) values (1, 4, 5), (2, 2, 10), (3, 1, 24), (4, 5, 6);

select NAME, PRICE, QUANTITY from INVENTORY inner join product on PRODUCT.PRODUCT_ID=INVENTORY.PRODUCT_ID;