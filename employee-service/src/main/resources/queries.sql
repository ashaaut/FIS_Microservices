create table employee(
     em_id int,
     em_name varchar(25),
     em_salary double,
     em_permanent boolean,
	em_date_of_birth date,
     em_dp_id int
     );
     
 create table department
     (
     dp_id int,
     dp_name varchar(25)
     );
     
 create table skill(
     sk_id int,
     sk_name varchar(45)
     );
insert into employee values(2,"manisha",70000.0,true,'2021-09-27',3);