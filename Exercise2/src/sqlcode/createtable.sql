CREATE TABLE meal(
meal_name varchar(20) not null ,
price double not null,
calories int null,
ingredients varchar(255),
primary key (meal_name)
);