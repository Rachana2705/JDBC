use jdbc;

create table company(
cio int,
company_name varchar(30),
company_location varchar(30),
isprivate boolean,
noOfEmployees int,
grade varchar(2)
);

insert into company values(1,'IBM','Bangalore','true',67668,'B');
select * from company;

DELETE FROM company WHERE cio=1;





