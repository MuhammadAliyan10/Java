create database if not exists OOP;
 
use OOP;
 
create table Information (
   id int,
   name varchar(200),
   rollNumber varchar(200),
   Section varchar(10),
   primary key (id));
 
insert into Information values (1, 'Muhammad Aliyan', 'BCS07223017', 'A');
insert into Information values (2, 'Muhammad Noor', 'BCS07223018', 'A');
insert into Information values (3, 'Rana Usama', 'BCS07223019', 'A');
insert into Information values (4, 'Noman Aslam', 'BCS07223010', 'A');
insert into Information values (5, 'Rana Zubair', 'BCS07223011', 'A');
 
select * from Information;