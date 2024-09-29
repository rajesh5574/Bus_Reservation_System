create database busreservation;
use busreservation;
create table bus(
id int primary key,
ac boolean,
capacity int
) ;
insert into bus values(1,1,2);
 insert into bus values(2,1,30);
 insert into bus values(3,0,20);
 
 select*from bus;
 
 create table booking (
 passenger_name varchar(30),
 bus_no int,
 travel_date date
 );
 
 select*from booking;
 alter table booking drop column serial_no;
 alter table booking add serial_no int auto_increment primary key first;
 
                      
                      
                      