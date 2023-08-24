create table ingredients(
ingredient varchar(255) not null,
contains_lactose boolean,
vegetarian boolean,
vegan boolean,
gluten_free boolean,
primary key (ingredient)
);