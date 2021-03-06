CREATE DATABASE  IF NOT EXISTS `gerenciamento_vendas`;
USE `gerenciamento_vendas`;

CREATE TABLE `produtos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `tipo` char(1) DEFAULT NULL,
  `quantidade` int(11) NOT NULL,
  `valor` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome_usuario` varchar(45) NOT NULL UNIQUE,
  `nome` varchar(45) NOT NULL,
  `senha` varchar(45) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `tipo` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `vendas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `quantidade_total` int(11) NOT NULL,
  `valor_total` double NOT NULL,
  `data` date NOT NULL,
  `hora` time DEFAULT NULL,
  `id_usuario` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id_usuario`) REFERENCES usuarios(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


CREATE TABLE `itens_venda` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_venda` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `valor` double DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id_produto`) REFERENCES produtos(`id`),
  FOREIGN KEY (`id_venda`) REFERENCES vendas(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Senha: "123123123"
INSERT INTO `usuarios` VALUES
(null, 'admin','admin','F5BB0C8DE146C67B44BABBF4E6584CC0','11111111111','A'),
(null, 'usuario','usuario','F5BB0C8DE146C67B44BABBF4E6584CC0','11111111111','U');

INSERT INTO `produtos` VALUES
(null, "Batata", 'P',30, 3.5),
(null, "Melancia", 'P',30, 5.5),
(null, "Queijo", 'P',30, 2.5);
