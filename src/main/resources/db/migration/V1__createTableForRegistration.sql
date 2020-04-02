create TABLE REGISTRATION_USER (
id bigint(20) NOT NULL AUTO_INCREMENT,
username varchar(100) NOT NULL,
firstname varchar(100) NOT NULL,
lastname varchar(100) DEFAULT NULL,
email varchar(100) NOT NULL,
primary key (id)
);