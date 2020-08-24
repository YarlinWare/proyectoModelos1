
CREATE TABLE moto (
  idmoto SERIAL NOT NULL PRIMARY KEY,
  marca VARCHAR(45) NOT NULL,
  linea VARCHAR(45) NOT NULL ,
  modelo CHAR(4) NOT NULL,
  imagen VARCHAR(120) NOT NULL,
  color VARCHAR(30) NOT NULL,
  precio INTEGER NOT NULL,
  descripcion TEXT NOT NULL,
  cilindraje INTEGER NOT NULL,
  cantidad INTEGER NOT NULL,
  categoria VARCHAR(20) NOT NULL);

CREATE TABLE cliente (
  cedula INTEGER NOT NULL PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  telefono INT NULL,
  correo VARCHAR(80) NULL,
  direccion VARCHAR(80) NULL,
  fech_nac DATE NULL,
  id_moto INTEGER NULL
);

ALTER TABLE cliente ADD CONSTRAINT "FK_id_moto"
	FOREIGN KEY (id_moto) REFERENCES moto (idmoto) ON DELETE No Action ON UPDATE No Action
;

CREATE TABLE usuario (
  cedula INTEGER NOT NULL PRIMARY KEY,
  nombre VARCHAR(45) NULL,
  correo VARCHAR(80) NULL,
  usuario VARCHAR(45) NULL,
  password VARCHAR(45) NULL,
  telefono INTEGER NULL,
  cargo VARCHAR(45) NULL
  );

ALTER TABLE cliente ADD CONSTRAINT "FK_id_usuario"
	FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario) ON DELETE No Action ON UPDATE No Action
;
ALTER TABLE empleado ADD CONSTRAINT "FK_id_usuario"
	FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario) ON DELETE No Action ON UPDATE No Action
;