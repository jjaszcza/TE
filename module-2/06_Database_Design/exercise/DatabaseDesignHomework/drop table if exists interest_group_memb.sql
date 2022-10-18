drop table if exists interest_group_member, member_event, event, interest_group, member cascade; 

CREATE TABLE member (
	member_id SERIAL NOT NULL PRIMARY KEY
	, last_name VARCHAR(50) NOT NULL
	, first_name VARCHAR(50) NOT NULL
	, email VARCHAR(50) NOT NULL
	, phone_number VARCHAR(20) 
	
);

CREATE TABLE interest_group (
	group_id SERIAL NOT NULL PRIMARY KEY
	, name VARCHAR (50) NOT NULL
	
);

CREATE TABLE event (
	event_id SERIAL NOT NULL PRIMARY KEY
	, name VARCHAR (50) NOT NULL
	, description VARCHAR (200) NOT NULL
	, start_date_and_time VARCHAR (50) NOT NULL
	, duration_in_minutes INT 
	, group_running_event VARCHAR (50) NOT NULL
	, group_id SERIAL NOT NULL
	
	,CONSTRAINT FK_group_id FOREIGN KEY(group_id) REFERENCES interest_group(group_id)
);

CREATE TABLE member_event (
	member_id SERIAL NOT NULL
	, event_id SERIAL NOT NULL,
	CONSTRAINT PK_member_event PRIMARY KEY(member_id, event_id),
    CONSTRAINT FK_member_event_member FOREIGN KEY(member_id) REFERENCES member(member_id),
    CONSTRAINT FK_member_event_event FOREIGN KEY(event_id) REFERENCES event(event_id)
	
);

CREATE TABLE interest_group_member (
	group_id SERIAL NOT NULL
	, member_id SERIAL NOT NULL,
	CONSTRAINT PK_interest_group_member PRIMARY KEY(group_id, member_id),
    CONSTRAINT FK_member_group_group FOREIGN KEY(group_id) REFERENCES interest_group(group_id),
    CONSTRAINT FK_member_group_member FOREIGN KEY(member_id) REFERENCES member(member_id)
	
);


alter table member add column birthday date;
alter table member add column email_reminder boolean; 

INSERT INTO member(last_name, first_name, email, phone_number, birthday, email_reminder)
	VALUES('Hilton', 'Acacia', 'ha99@hotmail.com', '701-572-4433', '1984-09-22', TRUE );
INSERT INTO member(last_name, first_name, email, phone_number, birthday, email_reminder)
	VALUES('Carey', 'Jagoda', 'ca26@hotmail.com', '701-572-4633', '1984-09-23', FALSE );
INSERT INTO member(last_name, first_name, email, phone_number, birthday, email_reminder)
	VALUES('Mustafa', 'Ned', 'nm69@hotmail.com', '701-774-3733', '1984-09-24', TRUE );
INSERT INTO member(last_name, first_name, email, phone_number, birthday, email_reminder)
	VALUES('Atherton', 'Zarah', 'zaza9@hotmail.com', '701-572-6669', '1984-09-25', FALSE );	
INSERT INTO member(last_name, first_name, email, phone_number, birthday, email_reminder)
	VALUES('Cassidy', 'Mikayla', 'yoloswaggins420@hotmail.com', '701-572-5555', '1984-09-26', TRUE );
INSERT INTO member(last_name, first_name, email, phone_number, birthday, email_reminder)
	VALUES('Mason', 'Celia', 'toocoofoschoo@hotmail.com', '701-572-1234', '1984-09-27', FALSE );
INSERT INTO member(last_name, first_name, email, phone_number, birthday, email_reminder)
	VALUES('Dickerson', 'Mickey', 'mickeydickey84@hotmail.com', '701-572-4321', '1984-09-28', TRUE );
INSERT INTO member(last_name, first_name, email, phone_number, birthday, email_reminder)
	VALUES('Guthrie', 'John', 'jgthepriest@hotmail.com', '701-572-4793', '1984-09-29', FALSE );
	
INSERT INTO interest_group(name)
	VALUES('Council to Ban Banning Bans');
INSERT INTO interest_group(name)
	VALUES('The Peoples Voice to Free Hat');
INSERT INTO interest_group(name)
	VALUES('Society of Sunday Funnies');
	
INSERT INTO event(name, description, start_date_and_time, duration_in_minutes, group_running_event, group_id)
	VALUES('PeanutCon', 'A place where peanut fans of all shapes and sizes meet to share findings about peanuts of all shapes and sizes', '1776-07-04, 5:00AM', 500, 'Council to Ban Banning Bans', 1);
INSERT INTO event(name, description, start_date_and_time, duration_in_minutes, group_running_event, group_id)
	VALUES('MugCon', 'A place where mug fans of all shapes and sizes meet to share findings about mugs of all shapes and sizes', '1876-07-04, 4:00AM', 15, 'The Peoples Voice to Free Hat', 2);
INSERT INTO event(name, description, start_date_and_time, duration_in_minutes, group_running_event, group_id)
	VALUES('NotebookCon', 'A place where notebook fans of all shapes and sizes meet to share findings about notebook of all shapes and sizes', '1976-07-04, 8:30AM', 89, 'Society of Sunday Funnies', 3);
INSERT INTO event(name, description, start_date_and_time, duration_in_minutes, group_running_event, group_id)
	VALUES('SHOEFEST', 'A place where shoe fans of all shapes and sizes meet to share findings about shoes of all shapes and sizes', '1176-07-04, 9:00AM', 501, 'Council to Ban Banning Bans', 1);