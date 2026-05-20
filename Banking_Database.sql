use sakila
show tables
Create table Employee (Id varchar(20),Password varchar(7),Post varchar(20));
desc employee
insert into employee values("Ram","Ram@","Casher");
select * from employee;
create table Bank_Customer (Acc_no varchar(10) primary key, Holder_Name varchar(100) , Balance numeric);
insert into Bank_Customer values("1234567892","Satej More",25870);
update Bank_Customer set Balance=Balance+1000 where Acc_no='1234567892';
select * from Bank_Customer;
create table Casher (Tran_Id varchar(10) primary key ,Acc_no varchar(10),Amount numeric,AC_Status varchar(8),Tran_date date,Tran_Time time, Paymet_mode varchar(8), Foreign key(Acc_no) references Bank_Customer (Acc_no));
insert into casher values("2134569783","1234567892",1000,"Deposit",'2025-08-03',"16:50:40","Cash");
desc casher
create table Bank_Acc(Tran_Id varchar(10),Ac_status varchar(8),Tran_date date ,Tran_Time time,Amount numeric , foreign key (Tran_Id) references Casher (Tran_Id));
select * from casher 
insert into Bank_Acc values("2134569783","Deposit",'2025-08-03',"16:50:40",10207000);
select * from Bank_Acc order by tran_time desc limit 1;
update Bank_Customer set Balance=Balance+1000 where Acc_no='1234567890' 
desc Bank_Acc
desc databases;
Create table Bank_AC (Transation_id varchar(10),Amount numeric,AC_Status varchar(8)
desc Bank_Acc
select *  from Bank_Acc;
select sum(Amount) from Bank_Acc;