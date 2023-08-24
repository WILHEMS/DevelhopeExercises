CREATE TABLE ingredients(
ingredient varchar(255) not null,
contains_lactose varchar(20) not null,
vegetarian varchar(20) not null,
vegan varchar(20) not null,
gluten_free varchar(20) not null,
primary key (ingredient)
);