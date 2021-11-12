Use Master
go
/*CREACION DE LA BASE DE DATOS*/
CREATE DATABASE DB_PELUDO
GO
/*TABLA DE USUARIO*/
 CREATE TABLE usuario (
 id_usuario			INTEGER  PRIMARY KEY IDENTITY (1,1)  NOT NULL,
 nombre				VARCHAR(40) NOT NULL,
 email				VARCHAR(40) NOT NULL,
 contraseña			VARCHAR(40) NOT NULL,
 tipo_usuario		VARCHAR(40)
 )
 GO

 /*TABLA DE ANIMALES*/
 CREATE TABLE animal (
 id_animal			INTEGER  PRIMARY KEY IDENTITY (1,1)  NOT NULL,
 lugar_encontrado	VARCHAR (50) NOT NULL,	
 fecha_encontrado	DATE NOT NULL,
 fecha_baja			DATE,
 tipo_raza			VARCHAR(40),
 id_usuario			INTEGER CONSTRAINT FK_id_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
 )
 GO

 /*TABLA RAZA*/
 CREATE TABLE raza (
 id_raza			INTEGER  PRIMARY KEY IDENTITY (1,1)  NOT NULL,
 id_animal			INTEGER CONSTRAINT FK_id_animal FOREIGN KEY (id_animal) REFERENCES animal(id_animal),
 nombre				VARCHAR(30)
 )
 GO

 /*TABLA ESPECIE*/
 CREATE TABLE especie (
 id_especie			INTEGER  PRIMARY KEY IDENTITY (1,1)  NOT NULL,
 id_raza			INTEGER CONSTRAINT FK_id_raza FOREIGN KEY (id_raza) REFERENCES raza (id_raza),
 nombre				VARCHAR(30)
 )
 GO

 /*COMANDOS A MANO*/
 /*PRIMARY KEY
ALTER TABLE especie
	ADD CONSTRAINT  id_especie_PK PRIMARY KEY CLUSTERED (id_especie)
GO
*/
/*BORRADO

 DROP TABLE animal, especie, raza, usuario 
 DROP TABLE raza
 DROP TABLE especie
 DROP TABLE animal
 DROP TABLE usuario


 /* DATABASE ACTUAL
SELECT DB_NAME() AS [Current Database];  
GO