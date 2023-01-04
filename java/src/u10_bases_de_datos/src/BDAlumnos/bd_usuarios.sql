SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `bd_usuarios` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci ;
USE `bd_usuarios` ;

-- -----------------------------------------------------
-- Table `bd_usuarios`.`usuarios`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `bd_usuarios`.`usuarios` (
  `nombre` VARCHAR(30) NOT NULL ,
  `password` VARCHAR(10) NULL ,
  `email` VARCHAR(50) NULL ,
  PRIMARY KEY (`nombre`) )
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
