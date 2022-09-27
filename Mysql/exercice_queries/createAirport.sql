CREATE TABLE flights 
( fno VARCHAR(4) primary key, 
  fromCity varchar(30) not null, 
  toCity varchar(30) not null, 
  distance int not null check (distance > 0), 
  depDate date not null,
  depTime time not null,
  arrDate date not null,
  arrTime time not null,
  price int check (price >0), 
 );

  CREATE TABLE aircrafts 
( aid int primary key, 
  aname varchar(50), 
  crange integer
 );

CREATE TABLE employees
(empid int primary key,
 lastname varchar(30) not null,
 firstname varchar(30) not null, 
 salary integer check (salary > 0)
 );

CREATE TABLE certified
(empid int, 
 aid   int, 
 primary key (empid, aid), 
 foreign key (empid) references employees (empid),
 foreign key (aid) references aircrafts (aid)
 ); 


insert into flights values ('A300', '�����', '�������', 1000, '2018-05-01', '09:00', '2018-05-01', '18:00', 800);
insert into flights values ('A301', '�����', '��� �����', 1200, '2018-05-01', '09:00', '2018-05-01', '17:00', 1000);
insert into flights values ('A302', '�����', '�������', 500, '2018-05-02', '18:00', '2018-05-02', '21:00', 500);
insert into flights values ('A303', '�����', '�������', 600, '2018-05-02', '19:00', '2018-05-02', '22:00', 600);
insert into flights values ('A400', '�����', '���������', 3000, '2018-05-03', '19:00', '2018-05-04', '05:00', 2500);
insert into flights values ('A401', '�������', '���������', 2500, '2018-05-03', '09:00', '2018-05-03', '20:00', 3000);
insert into flights values ('A305', '�������', '�����', 500, '2018-05-03', '10:00', '2018-05-03', '12:00', 400);
insert into flights values ('A306', '������', '�����', 700, '2018-05-04', '11:00', '2018-05-04', '13:00', 600);
insert into flights values ('A307', '����', '��� �����', 1500, '2018-05-04', '12:00', '2018-05-04', '23:00', 1700);
insert into flights values ('A308', '�������', '��� �����', 1700, '2018-05-05', '13:00', '2018-05-05', '21:00', 2000);
insert   aircrafts values (1, 'Boeing 787', 10000);
insert   aircrafts values (2, 'Boeing 777', 8000);
insert   aircrafts values(3, 'Boeing B29', 2000);
insert   aircrafts values(4, 'Boeing 747', 3000);
insert   aircrafts values(5, 'Airbus A320', 5000);
insert   aircrafts values(6, 'Airbus A380', 2000);
insert   aircrafts values(7, 'Learjet 23', 1000);
insert   aircrafts values(8, 'Douglas DC3', 7000);
insert   aircrafts values(9, 'Super Jumbo', 15000);
insert   aircrafts values(10, 'Ilyushin', 1500);



INSERT   employees  VALUES (10, '���������','������',  6000);
INSERT   employees   VALUES (14, '���������','�����',  5000);
INSERT   employees    VALUES (15, '������������','�����',  2000);
INSERT   employees    VALUES (11, '�����������','�������',  7000);
INSERT   employees    VALUES (16, '���������� ','����',  6000);
INSERT   employees    VALUES (17, '�������','����',  2000);
INSERT   employees   VALUES (12, '�����������','�������',  1500);
INSERT   employees    VALUES (13, '���������','��������',  3000);
INSERT   employees    VALUES (18, '������','������',  1000);
INSERT   employees   VALUES (19, '��������','��������',  2000);

INSERT   certified  VALUES (10,1);
INSERT   certified  VALUES (10,2);
INSERT   certified  VALUES (10,3);
INSERT   certified  VALUES (10,4);
INSERT   certified  VALUES (11,2);
INSERT   certified  VALUES (11,3);
INSERT   certified  VALUES (12,1);
INSERT   certified  VALUES (12,2);
INSERT   certified  VALUES (12,5);
INSERT   certified  VALUES (12,6);
INSERT   certified  VALUES (13,7);
INSERT   certified  VALUES (13,8);
INSERT   certified  VALUES (13,9);
INSERT   certified  VALUES (14,10);
INSERT   certified  VALUES (14,1);
INSERT   certified  VALUES (14,9);
INSERT   certified  VALUES (15,10);
INSERT   certified  VALUES (16,8);
INSERT   certified  VALUES (16,9);

