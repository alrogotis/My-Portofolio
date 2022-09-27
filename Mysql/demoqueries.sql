/* ΕΡΩΤΗΜΑ 1 */
select lname,fname 
	from actors
	where lname like 'K%'
	order by lname

/* ΕΡΩΤΗΜΑ 2 */
select title,pyear
	from movies
	where pyear between 1990 and 2007
	order by pyear desc

/* ΕΡΩΤΗΜΑ 3 */
select title,lname,fname
	from movies,directors
	where movies.did = directors.did and production like 'GRC'
	order by lname

/* ΕΡΩΤΗΜΑ 4 */
select title,pyear
	from movies,directors
	where directors.did = movies.did and lname = 'Σακελλάριος'

/* ΕΡΩΤΗΜΑ 5 */
select title,pyear
	from movies,actors,movie_actor
	where movies.mid = movie_actor.mid and actors.actid = movie_actor.actid and actors.lname like 'Eastwood'

/* ΕΡΩΤΗΜΑ 6 */
select lname,fname
	from actors,movies,movie_actor
	where movies.mid = movie_actor.mid and actors.actid = movie_actor.actid and movies.title like 'Amelie'

/* ΕΡΩΤΗΜΑ 7 */
select count(distinct mid)
	from copies
	where medium like 'DVD'


/* ΕΡΩΤΗΜΑ 8 */
select count(medium)
	from copies
	where medium like 'DVD'

/* ΕΡΩΤΗΜΑ 9 */
select max(price)
	from copies
	where medium like 'DVD'

/* ΕΡΩΤΗΜΑ 10 */
select sum(price)
 from copies
 where medium like 'BLU RAY'

/* ΕΡΩΤΗΜΑ 11 */
select fname,lname,count(mid)
	from movies right join directors on movies.did = directors.did
	group by directors.lname, directors.fname
	order by directors.lname

/* ΕΡΩΤΗΜΑ 12 */
select count(mid)
	from actors,movie_actor
	where actors.actid=movie_actor.actid and lname like 'Παπαγιαννόπουλος'

/* ΕΡΩΤΗΜΑ 13 */
select distinct lname,fname
	from actors,movies,movie_actor
	where actors.actid=movie_actor.actid and movies.mid=movie_actor.mid and movies.production != 'GRC'

/* ΕΡΩΤΗΜΑ 14 */
select title
	from movies,actors,movie_actor
	where movie_actor.actid=actors.actid and movies.mid=movie_actor.mid and lname like 'Κούρκουλος'
INTERSECT
select title
	from movies,actors,movie_actor
	where movie_actor.actid=actors.actid and movies.mid=movie_actor.mid and lname like 'Καρέζη'

/* ΕΡΩΤΗΜΑ 15 */
select title
	from movies,actors,movie_actor
	where movie_actor.actid=actors.actid and movies.mid=movie_actor.mid and lname like 'Καρέζη'
EXCEPT
select title
	from movies,actors,movie_actor
	where movie_actor.actid=actors.actid and movies.mid=movie_actor.mid and lname like 'Κούρκουλος'
	
/* ΕΡΩΤΗΜΑ 16 */
select title
	from movies,categories,movie_cat
	where categories.catid=movie_cat.catid and movies.mid=movie_cat.mid and categories.category like 'Κωμωδία'
INTERSECT
select title
	from movies,categories,movie_cat
	where categories.catid=movie_cat.catid and movies.mid=movie_cat.mid and categories.category like 'Αισθηματική'

/* ΕΡΩΤΗΜΑ 17 */
select category,count(mid)
	from categories,movie_cat
	where categories.catid = movie_cat.catid
	group by category
	having count(mid)>=5

/* ΕΡΩΤΗΜΑ 18 */
select lname,fname,count(mid)
from movies right join directors on movies.did = directors.did
group by lname,fname

/* ΕΡΩΤΗΜΑ 19 */
delete from categories
	where categories.category like 'Βιογραφία'

/* ΕΡΩΤΗΜΑ 20 */
update copies
set copies.price=70.00
from movies inner join copies on movies.mid = copies.mid
where title = 'Amelie' and medium = 'DVD'








