CREATE TABLE `tienda_motos`.`moto` (
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish_ci
COMMENT = 'tabla de registro de motos de la tienda';

CREATE TABLE `tienda_motos`.`moto` (
  `idmoto` INT NOT NULL AUTO_INCREMENT,
  `marca` VARCHAR(45) NOT NULL COMMENT 'marcas como:\n\nyamaha\nbajaj\nhero \nbmw\n',
  `linea` VARCHAR(45) NOT NULL COMMENT 'lineas como:\n\nfzs\nr15\nboxer100',
  `modelo` CHAR(4) NOT NULL COMMENT 'año de la versión de la moto',
  `imagen` VARCHAR(120) NOT NULL COMMENT 'url de la fotografía',
  `color` VARCHAR(30) NOT NULL,
  `precio` INT NOT NULL,
  `descripcion` LONGTEXT NOT NULL,
  `cilindraje` INT NOT NULL,
  `cantidad` INT NOT NULL,
  PRIMARY KEY (`idmoto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci
COMMENT = 'tabla de registro de motos de la tienda';
ALTER TABLE tienda_motos.moto ADD categoria VARCHAR(20);

CREATE TABLE `tienda_motos`.`cliente` (
  `cedula` INT NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `telefono` INT NULL,
  `correo` VARCHAR(80) NULL,
  `direccion` LONGTEXT NULL,
  `fech_nac` DATE NULL,
  `id_moto` INT NULL,
  PRIMARY KEY (`cedula`),
  INDEX `id_moto_idx` (`id_moto` ASC) VISIBLE,
  CONSTRAINT `id_moto`
    FOREIGN KEY (`id_moto`)
    REFERENCES `tienda_motos`.`moto` (`idmoto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE `tienda_motos`.`usuario` (
  `cedula` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `correo` VARCHAR(80) NULL,
  `usuario` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `telefono` INT NULL,
  `cargo` VARCHAR(45) NULL,
  PRIMARY KEY (`cedula`));