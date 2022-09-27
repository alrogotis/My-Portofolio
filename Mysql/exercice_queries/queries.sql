/* ΕΡΩΤΗΜΑ 1 */
select * from flights
where toCity = 'Τορόντο' and depDate = '2018-05-01'

/* ΕΡΩΤΗΜΑ 2 */
select * from flights
where distance between 900 and 1500

/* ΕΡΩΤΗΜΑ 3 */
select toCity,count(*)
from flights
where depDate between '2018-05-01' and '2018-05-30'
group by toCity

/* ΕΡΩΤΗΜΑ 4 */
select toCity,count(*)
from flights
group by toCity
having count(toCity)>=3

/* ΕΡΩΤΗΜΑ 5 */
select lastname,firstname
from employees,certified
where employees.empid=certified.empid
group by lastname,firstname
having count(aid)>=3

/* ΕΡΩΤΗΜΑ 6 */
select sum(salary)
from employees

/* ΕΡΩΤΗΜΑ 7 */
select sum(salary)
from employees
where exists (select* from certified where employees.empid = certified.empid)

/* ΕΡΩΤΗΜΑ 8 */
select sum(salary)
from employees
where not exists (select* from certified where employees.empid = certified.empid)

/* ΕΡΩΤΗΜΑ 9 */
select aname
from aircrafts,flights
where crange>=distance and fromCity='Αθήνα' and toCity='Μελβούρνη'

/* ΕΡΩΤΗΜΑ 10 */
select distinct firstname,lastname
from employees,certified,aircrafts
where employees.empid=certified.empid and aircrafts.aid=certified.aid and aname like 'Boeing%'

/* ΕΡΩΤΗΜΑ 11 */
select distinct lastname,firstname
from employees,certified,aircrafts
where employees.empid=certified.empid and certified.aid = aircrafts.aid and crange>3000
except
select distinct lastname,firstname
from employees,certified,aircrafts
where employees.empid=certified.empid and certified.aid = aircrafts.aid and aname like 'Boeing%'

/* ΕΡΩΤΗΜΑ 12 */
select firstname,lastname
from employees
group by firstname,lastname,salary
having salary=(select max(salary) from employees)

/* ΕΡΩΤΗΜΑ 14 */
select distinct aname
from aircrafts,certified,employees
where employees.empid=certified.empid and aircrafts.aid=certified.aid and salary >= 6000


/* ΕΡΩΤΗΜΑ 16 */
select firstname,lastname
from employees,flights
where toCity = 'Μελβούρνη'
group by firstname,lastname,salary
having salary<min(price)

/* ΕΡΩΤΗΜΑ 17 */
select firstname,lastname,salary
from employees
where not exists (select* from certified where employees.empid = certified.empid)
group by salary,firstname,lastname
having salary>(select avg(salary) from employees where exists (select* from certified where employees.empid = certified.empid))

/* ΕΡΩΤΗΜΑ 18 */
create view pilots as
select * from employees
where exists (select* from certified where employees.empid = certified.empid)

create view others as
select * from employees
where not exists (select* from certified where employees.empid = certified.empid)

/* ΕΡΩΤΗΜΑ 20 */

create procedure priceFlightsDemo as

declare @characterism varchar(10)
declare @minCodeFlight varchar(4)
declare @priceFlight int
declare @codeFlight varchar(4)

select @minCodeFlight=min(fno) from flights

while @minCodeFlight is not null
	begin
		set @codeFlight = (select fno from flights where flights.fno = @minCodeFlight)
		set @priceFlight = (select price from flights where flights.fno = @minCodeFlight)
		if (@priceFlight <= 500) set @characterism = 'Φθηνή'
		if (@priceFlight > 500 and @priceFlight<=1500) set @characterism = 'Κανονική'
		if (@priceFlight > 1500) set @characterism = 'Ακριβή'
		select @codeFlight , @characterism
		select @minCodeFlight = min(fno) from flights where @minCodeFlight < fno
	end

execute priceFlightsDemo








