create table airport(
ID int,
Airport_name varchar(30),
startPoint varchar(30),
destPoint varchar(30),
noOfTerminals int,
location varchar(30),
isInternational boolean
);

insert into airport values(1,'bangalore airport','bangalore','delhi',2,'bangalore',false);
insert into airport values(2,'bangalore airport','bangalore','new york',5,'bangalore',true);
insert into airport values(3,'mumbai airport','mumbai','kolkata',3,'mumbai',false);

select * from airport;
