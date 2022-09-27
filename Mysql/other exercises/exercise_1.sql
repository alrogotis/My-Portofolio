/* Πινακας Συμετεχων */

create table participants (
	id_participant int,
	amka int not null,
	first_name varchar(30),
	last_name varchar(30) not null,
	age int,
	sex varchar(10),
	place_birth varchar(30),
	primary key (id_participant)
	);

/* ΠΙΝΑΚΑΣ ΕΡΓΟΔΟΤΕΣ */

create table employers (
	id_employer int primary key,
	id_participant int,
	employer_name varchar(40),
	employer_address varchar(30),
	employer_phone int,
	constraint fk1_employers foreign key (id_participant) references participants (id_participant)
	);

/* ΠΙΝΑΚΑΣ ΠΡΟΥΓΟΥΜΕΝΩΝ ΕΡΓΟΔΟΤΩΝ */

create table previous_employers (
	id_entry int,
	id_participant int,
	id_employer int,
	start_practice date,
	end_practice date,
	primary key (id_entry),
	constraint fk1_previous_employers foreign key (id_participant) references participants (id_participant),
	constraint fk2_previous_employers foreign key (id_employer) references employers (id_employer)
	);

/* ΠΙΝΑΚΑΣ ΣΕΜΙΝΑΡΙΩΝ */

create table seminars (
	id_seminar int,
	title varchar(30),
	id_version int,
	primary key (id_seminar),
	constraint fk1_seminars foreign key (id_version) references versions (id_version)
	);

/* ΠΙΝΑΚΑΣ ΤΡΕΧΟΝΤΑ ΣΕΜΙΝΑΡΙΑ */

create table active_seminars (
	id_entry int,
	id_participant int,
	id_seminar int,
	hours varchar(11),
	classroom int,
	primary key (id_entry),
	constraint fk1_active_seminars foreign key (id_participant) references participants (id_participant),
	constraint fk2_active_seminars foreign key (id_seminar) references seminars (id_seminar)
	);


/* ΠΙΝΑΚΑΣ ΠΑΛΑΙΩΤΕΡΩΝ ΣΕΜΙΝΑΡΙΩΝ */

create table old_seminars (
	id_entry int,
	id_participant int,
	id_seminar int,
	rating smallint,
	primary key (id_entry),
	constraint fk1_old_seminars foreign key (id_participant) references participants (id_participant),
	constraint fk2_old_seminars foreign key (id_seminar) references seminars (id_seminar)
	);

/* ΠΙΝΑΚΑΣ ΕΚΔΟΣΕΩΝ ΣΕΜΙΝΑΡΙΟΥ */

create table versions (
	id_version int,
	start_date date,
	final_date date,
	num_participants int,
	primary key (id_version)
	);
	
/* ΠΙΝΑΚΑΣ ΕΚΠΑΙΔΕΥΟΜΕΝΟΥ */

create table students (
	id_student int,
	id_participant int,
	primary key (id_student),
	constraint fk1_sudents foreign key (id_participant) references participants (id_participant)
	);

/* ΠΙΝΑΚΑΣ ΑΥΤΟΑΠΑΣΧΟΛΟΥΜΕΝΟΥ */

create table self_employed (
	id_entry int,
	id_student int,
	area varchar(20),
	title varchar(20),
	primary key (id_entry),
	constraint fk1_self_employed foreign key (id_student) references students (id_student)
	);

/* ΠΙΝΑΚΑΣ ΥΠΑΛΛΗΛΩΝ */

create table employees (
	id_entry int,
	id_student int,
	specialisasion varchar(20),
	position varchar(20),
	primary key (id_entry),
	constraint fk1_employees foreign key (id_student) references students (id_student)
	);

/* ΠΙΝΑΚΑΣ ΕΚΠΑΙΔΕΥΤΩΝ */

create table teachers(
	id_teacher int,
	id_participant int,
	lastname varchar(20),
	age int,
	place_birth varchar(20),
	id_version int,
	primary key (id_teacher),
	constraint fk1_teachers foreign key (id_participant) references participants (id_participant),
	constraint fk2_teachers foreign key (id_version) references versions (id_version)
	);

/* ΠΙΝΑΚΑΣ ΠΑΛΑΙΩΤΕΡΩΝ ΕΚΔΟΣΕΩΝ */

create table old_versions(
	id_entry int,
	id_version int,
	id_teacher int,
	primary key(id_entry),
	constraint fk1_old_versions foreign key (id_version) references versions (id_version),
	constraint fk2_old_versions foreign key (id_teacher) references teachers (id_teacher)
	);

/* ΠΙΝΑΚΑΣ ΜΑΘΗΜΑΤΩΝ */

create table lessons(
	id_entry int,
	name varchar(20),
	id_teacher int,
	primary key(id_entry),
	constraint fk1_lessons foreign key (id_teacher) references teachers (id_teacher)
	);

/* ΠΙΝΑΚΑΣ ΜΟΝΙΜΩΝ ΥΠΑΛΛΗΛΩΝ */

create table permanent_employee(
	id_entry int,
	id_teacher int,
	primary key(id_entry),
	constraint fk1_permanent_employee foreign key (id_teacher) references teachers (id_teacher)
	);

/* ΠΙΝΑΚΑΣ ΕΞΩΤΕΡΙΚΩΝ ΣΥΝΕΡΓΑΤΩΝ */

create table non_employee(
	id_entry int,
	id_teacher int,
	primary key(id_entry),
	constraint fk1_non_employee foreign key (id_teacher) references teachers (id_teacher)
	);

	




