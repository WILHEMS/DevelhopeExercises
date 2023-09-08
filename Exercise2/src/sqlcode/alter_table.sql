/* Add constraints to every column of the INGREDIENTS table,you should use NOT NULL for some columns and unique for other(s)*/

/* ingredient column was already not null so I just added unique constraint */

alter table ingredients add constraint unique (ingredient);

/* setting the other columns to not null */
alter table ingredients
modify contains_lactose boolean not null;

alter table ingredients
modify vegeterian boolean not null ;

alter table ingredients
modify vegan boolean not null ;

alter table ingredients
modify gluten_free boolean not null ;

alter table ingredients
modify calories int not null ;