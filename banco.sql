CREATE TABLE IF NOT EXISTS `ferramenta`.`tb_amigo` (
  `id_amigo` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  `teleforne` VARCHAR(20) NULL,
  PRIMARY KEY (`id_amigo`))
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS `ferramenta`.`tb_emprestimo` (
  `id_emprestimo` INT NOT NULL,
  `id_ferramenta` INT NULL,
  `id_amigo` INT NULL,
  `data_emprestimo` VARCHAR(45) NULL,
  `data_devolução_prevista` VARCHAR(45) NULL,
  `data_devolução_real` VARCHAR(45) NULL,
  `Status` TINYINT NULL,
  foreign key(`id_amigo`) references `tb_amigo` (`id_amigo`),
   foreign key(`id_ferramenta`) references `tb_ferramenta` (`id_ferramenta`),
  PRIMARY KEY (`id_emprestimo`))
ENGINE = InnoDB


CREATE TABLE IF NOT EXISTS `ferramenta`.`tb_ferramenta` (
  `id_ferramenta` INT NOT NULL,
  `nome` VARCHAR(30) NULL,
  `custo` FLOAT NULL,
  `marca` VARCHAR(45) NULL,
  PRIMARY KEY (`id_ferramenta`))
ENGINE = InnoDB
