CREATE TABLE `shop`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `image` VARCHAR(45) NOT NULL,
  `quantity` VARCHAR(45) NOT NULL,
  `description` VARCHAR(4500) NULL,
  `price` INT NOT NULL,
  PRIMARY KEY (`id`));