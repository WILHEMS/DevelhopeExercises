/*concatenates two or more columns and gives the concatenated columns a single name as specified*/
select concat(meal_name, ' = ', calories) as meal_and_calories from meals;

/* lower(column) converts all characters in the selected column to lower cases*/
select lower(meal_name) from meals;

/* upper(column) converts all characters in the selected column to an upper case*/
select upper(meal_name) from meals;

/*trim(column) removes suffixes and prefixes or both or string from the selected column*/
select trim(trailing 'stir fried' from name) from meals;

/* length(column) selects the length of characters in each row of the selected column*/
select length(meal_name) from meals;

/*substring(column,start,length) selects a slice from the specified start and end of the strings of the rows from the selected column*/
select substr(meal_name, 2, length(meal_name)) from meals;

/* round(column) rounds of the selected column to the specified decimal places*/
select round(meal_price, 2) from meals;

/* used to performs date arithmetic*/
select date_add(now(), interval 30 day );

/* used to performs date arithmetic.*/
select date_sub(now(), interval 2 year );

/* formats the specified column or number to the string format expression and returns it as a string.*/
select format(meal_price, 2) from meals;

/* Using DATE_ADD or DATE_SUB and the following SQL; SELECT NOW();, Select your birthday by passing the result into the next item*/
select date_sub((date_add(now(), interval 20 day)), interval 12 hour );