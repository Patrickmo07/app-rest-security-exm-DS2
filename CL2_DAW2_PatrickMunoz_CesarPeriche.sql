create database tokenbd;
use tokenbd;

CREATE TABLE usuario (
	idusuario INT auto_increment NOT NULL,
	nomusuario varchar(100) NULL,
	email varchar(250) NULL,
	password varchar(250) NULL,
	activo BOOL NULL,
	CONSTRAINT users_pk PRIMARY KEY (idusuario)
);


CREATE TABLE rol (
	idrol INT auto_increment NOT NULL,
	nomrol varchar(250) NULL,
	CONSTRAINT roles_pk PRIMARY KEY (idrol)
);


CREATE TABLE usuario_rol (
	idusuario INT NOT NULL,
	idrol INT NOT NULL,
	CONSTRAINT user_role_pk PRIMARY KEY (idusuario, idrol),
	CONSTRAINT user_role_FK FOREIGN KEY (idusuario) REFERENCES usuario(idusuario),
	CONSTRAINT user_role_FK_1 FOREIGN KEY (idrol) REFERENCES rol(idrol)
);

insert into usuario values(1,'cperiche','cperiche@hotmail.com','$2a$12$X4Q/MRGg2V1fWOwYc2YbNu1CAttUQsw5iloQVIqBm9CnHlLQU0Ig.','1'),
(2,'amunoz','amunoz@hotmail.com','$2a$12$j2XclFT4lPL8kyfzFDzvV.0JdRsjneruz2UBWXzjcnyludNgw2m1u','1'),
(3,'kecca','kecca@hotmail.com','$12$sqvhKOlOPyXkmbsEXnMRH.CvGg8w48rSPAP/9SMmKb/6dWkPOoOVe','1'),
(4,'cbacca','cbacca@@hotmail.com','$12$fZL.tCJ1H0wfd5GehNP7zOCE2kr3OoSM3aJpUsp980iWKHKhS9Z4K','1');
insert into rol values(1,'COORDINADOR'),(2,'GESTOR');
insert into usuario_rol values(1,'1'),(2,'1'),(3,'1'),(4,'2');

select * from usuario