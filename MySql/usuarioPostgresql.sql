INSERT INTO usuario (cedula, nombre, correo, usuario, password, telefono, cargo)
VALUES ('1024987654', 'Miguel Angel Asturias', 'mangela@gmail.com', 'mangela', 'admin123', '7654321', 'Gerente');

INSERT INTO usuario (cedula, nombre, correo, usuario, password, telefono, cargo)
VALUES ('1028988654', 'Margarita Salazar', 'msalazar@gmail.com', 'msalazar', 'admin123', '4654551', 'Asesor Ventas');

INSERT INTO usuario (cedula, nombre, correo, usuario, password, telefono, cargo)
VALUES ('1324686654', 'Marco António', 'mantonio@gmail.com', 'mantonio', 'admin123', '6654521', 'Jefe');


--ALTER TABLE usuario cedula bigint;
--ALTER TABLE moto DROP COLUMN cedula;
ALTER TABLE usuario ALTER COLUMN cedula SET DATA TYPE bigint;
ALTER TABLE cliente ALTER COLUMN cedula SET DATA TYPE bigint;
