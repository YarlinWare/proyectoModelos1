
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
CREATE TABLE color (
	idcolor INTEGER NOT NULL PRIMARY KEY,
	color VARCHAR(50) NOT NULL
);

INSERT INTO color values(1,'Negro'),(2,'Rojo'),(3,'Azul'),(4,'Gris'),(5,'Verde'),(6,'Amarillo');

CREATE TABLE motocolor (
	idcolor INTEGER NOT NULL,
	idmoto INTEGER NOT NULL,
	disponibilidad bool NOT NULL
);

ALTER TABLE motocolor ADD CONSTRAINT "FK_id_moto"
	FOREIGN KEY (idmoto) REFERENCES moto (idmoto) ON DELETE No Action ON UPDATE No Action;

ALTER TABLE motocolor ADD CONSTRAINT "FK_id_color"
	FOREIGN KEY (idcolor) REFERENCES color (idcolor) ON DELETE No Action ON UPDATE No Action;

ALTER TABLE color ALTER COLUMN idcolor SET DATA TYPE Serial;


INSERT INTO color values(1,'Negro'),(2,'Rojo'),(3,'Azul'),(4,'Gris'),(5,'Verde'),(6,'Amarillo');
INSERT INTO color values(7,'Blanco');
INSERT INTO color values(8,'Negro Mate');
INSERT INTO color values(9,'Negro/verde');
INSERT INTO color values(10,'Negro/rojo');

INSERT INTO motocolor values(4,36, true),(7,36, true),(3,36, true),(8,36, true),(2,36, true);
INSERT INTO motocolor values(9,43, true);
INSERT INTO motocolor values(7,48, true),(1,49, true),(1,33, true),(2,33, true),(3,33, true);

select c.color as color from color as c 
inner join motocolor as mt on (mt.idcolor = c.idcolor)
where mt.idmoto = 33









