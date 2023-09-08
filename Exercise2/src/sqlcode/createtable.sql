create table ingredients(
ingredient varchar(255) not null,
contains_lactose boolean,
vegetarian boolean,
vegan boolean,
gluten_free boolean,
calories int,
primary key (ingredient)
);