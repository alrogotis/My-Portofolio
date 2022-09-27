CREATE TABLE actors(
	actid int NOT NULL,
	lname varchar(30) NOT NULL,
	fname varchar(30) NOT NULL,
		PRIMARY KEY (actid)
	);

CREATE TABLE directors(
	did int NOT NULL,
	lname varchar(30) NOT NULL,
	fname varchar(30) NOT NULL,
		PRIMARY KEY (did)
	);

CREATE TABLE categories(
	catid int NOT NULL,
	category varchar(20) NOT NULL,
		PRIMARY KEY (catid)
	);

CREATE TABLE movies(
	mid int NOT NULL,
	title varchar(50) NOT NULL,
	pyear int NOT NULL,
	production char(3) NOT NULL,
	duration int NOT NULL,
	did int NOT NULL,
		PRIMARY KEY (mid),
		CONSTRAINT fk_movies FOREIGN KEY (did) REFERENCES directors (did)
	);

CREATE TABLE copies(
	barcode int NOT NULL,
	mid int NOT NULL,
	medium varchar(10) NOT NULL,
	price numeric(5,2) NOT NULL,
		PRIMARY KEY (barcode),
		CONSTRAINT fk_copies FOREIGN KEY (mid) REFERENCES movies (mid)
	);

CREATE TABLE movie_actor (
	mid int NOT NULL,
	actid int NOT NULL,
		PRIMARY KEY (mid, actid),
		CONSTRAINT fk1_movie_actor FOREIGN KEY (mid) REFERENCES movies (mid),
		CONSTRAINT fk2_movie_actor FOREIGN KEY (actid) REFERENCES actors (actid)
		
	);

CREATE TABLE movie_cat(
	mid int NOT NULL,
	catid int NOT NULL,
		PRIMARY KEY (mid, catid),
		CONSTRAINT fk1_movie_cat FOREIGN KEY (mid) REFERENCES movies (mid),
		CONSTRAINT fk2_movie_cat FOREIGN KEY (catid) REFERENCES categories (catid)

	);


