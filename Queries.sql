drop table BusSchedule cascade constraint;

create table BusSchedule (
BusId number(5), 
Name varchar2(20) not null, 
StartLocation varchar2(20) not null, 
EndLocation varchar2(20) not null, 
Timing varchar2(20) not null, 
AvailableSeats number(3) not null,
primary key (BusId));

insert into BusSchedule values(3242,'Ac Shivneri' ,'Mumbai','Pune','10/10/17',12);
insert into BusSchedule values(2562,'Ac Shivneri','Pune','Mumbai','11/10/17',30);
insert into BusSchedule values(3373,'Ac Volvo','Mumbai','Banglore','11/10/17',15);
insert into BusSchedule values(4183,'407 MiniBus','Mumbai','Nashik','12/10/17',15);	
insert into BusSchedule values(2534,'NonAc RedBus','Mumbai','Hydrabad','13/10/17',35);

select * from busschedule;

drop table BookingDetails cascade constraint;

create table BookingDetails (
BookingId number(8),
CustomerName varchar2(20) not null,
NoOfSeats number(3) not null,
BusId number(5) references BusSchedule(BusId),
primary key (BookingId)
);

select * from BookingDetails;
drop sequence bus_id_seq;

create sequence bus_id_seq start with 875000;