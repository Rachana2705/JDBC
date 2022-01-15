create database jdbc;

use jdbc;

create table newspaper(
id int,
newspaper_language varchar(30),
newspaper_name varchar(30),
newspaper_price int);

insert into newspaper values(1,'Kannada','vijaya karnataka',5);

select * from newspaper;

