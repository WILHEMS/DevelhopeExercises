1
select * from meals where price<15;

2
select * from ingredients where vegeterian=true;

3
select * from meals where calories>500;

4
select * from meals where price>=15 and price<=16;

5
select * from ingredients where contains_lactose=false and gluten_free=true;

6
select * from meals where price<15 or calories>600;

7
select * from ingredients where vegan=true or gluten_free=true;

8
select * from meals where name='Pesto Pasta';

9
select * from ingredients where contains_lactose=false;

10
select * from meals where price>20 and calories<800;