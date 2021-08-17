CREATE TABLE `user` (  `us_id` int(11) NOT NULL AUTO_INCREMENT,  `us_username` varchar(45) DEFAULT NULL,  `us_password` varchar(200) DEFAULT NULL,  PRIMARY KEY (`us_id`),  UNIQUE KEY `us_username_UNIQUE` (`us_username`));

insert into user values(2,"manisha","asha");

create table role(ro_id int,ro_name varchar(10));

insert into role values(1,"dev");

create table user_role(ur_ro_id int);

insert into user_role values(1);

