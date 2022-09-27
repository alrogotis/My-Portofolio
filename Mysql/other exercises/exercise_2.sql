/* ΠΙΝΑΚΑΣ ΥΠΑΛΛΗΛΟΣ */

create table employees(
	id_employee int,
	amka int,
	name varchar(20),
	lastname varchar(20),
	address varchar(30),
	phone int,
	specialization varchar(20),
	salary int,
	primary key(id_employee)
	);

/* ΠΙΝΑΚΑΣ ΜΗΧΑΝΙΚΟΙ */

create table engineers(
	id_engineer int,
	id_employee int,
	grade char(1),
	primary key(id_engineer),
	constraint fk1 foreign key (id_employee) references employees (id_employee) 
	);

/* ΠΙΝΑΚΑΣ ΚΥΒΕΡΝΗΤΕΣ */

create table captains(
	id_captain int,
	id_employee int,
	primary key(id_captain),
	constraint fk1_captains foreign key (id_employee) references employees (id_employee) 
	);

/* ΠΙΝΑΚΑΣ ΕΞΕΤΑΣΕΩΝ */

create table tests(
	id_test int,
	id_captain int,
	calendar_day date,
	primary key(id_test),
	constraint fk1_test foreign key (id_captain) references captains (id_captain) 
	);

/* ΠΙΝΑΚΑΣ ΚΑΤΗΓΟΡΙΑΣ ΠΛΟΙΟΥ */

create table ship_cat(
	id_cat int,
	name_cat varchar(20),
	primary key(id_cat) 
	);

/* ΠΙΝΑΚΑΣ ΕΞΕΙΔΙΚΕΥΣΗΣ */

create table specializations(
	id_specialization int,
	id_engineer int,
	id_cat int,
	primary key(id_specialization),
	constraint fk1_specializations foreign key (id_engineer) references engineers (id_engineer),
	constraint fk2_specializations foreign key (id_cat) references ship_cat (id_cat)
	);

/* ΠΙΝΑΚΑΣ ΠΛΟΙΑ */

create table ships(
	id_ship int,
	name varchar(20),
	id_cat int,
	capacity int,
	primary key(id_ship),
	constraint fk1_ship foreign key (id_cat) references ship_cat (id_cat)
	);

/* ΠΙΝΑΚΑΣ ΚΑΤΗΓΟΡΙΩΝ ΕΛΕΓΧΩΝ */

create table control_cats(
	id_control int,
	name_control varchar(20),
	primary key(id_control) 
	);

/* ΠΙΝΑΚΑΣ ΙΣΤΟΡΙΚΟΥ ΕΛΕΓΧΩΝ */

create table control_history(
	id_history int,
	id_ship int,
	id_control int,
	duration int,
	calendar_day date,
	result int,
	id_engineer int,
	primary key (id_history),
	constraint fk1_controls foreign key (id_ship) references ships (id_ship),
	constraint fk2_controls foreign key (id_control) references control_cats (id_control),
	constraint fk3_controls foreign key (id_engineer) references engineers (id_engineer)
	);
