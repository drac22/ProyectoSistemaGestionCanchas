CREATE DATABASE sistemagestioncanchas;

USE sistemagestioncanchas;

CREATE TABLE `tbl_cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `celular` varchar(12) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `correo` (`correo`),
  UNIQUE KEY `username` (`username`)
);

INSERT INTO `tbl_cliente` VALUES ('David Ruben','Arone Calle','arone123@gmail.com','drac','drac','999888777','Av. Los Lirios 123'),('Maria','Salazar','maria123@gmail.com','mari123','maria123','111222333','Av. Los Claveles 321');

CREATE TABLE `tbl_usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `rol` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `correo` (`correo`),
  UNIQUE KEY `username` (`username`),
  CONSTRAINT `tbl_usuario_chk_1` CHECK ((`rol` in ('admin','empleado')))
)

INSERT INTO `tbl_usuario` VALUES ('Juan Pablo','Cueva Rivera','juan123@gmail.com','juanpa123','juanpa123','554466773','empleado'),('Diego Javier','Morales','orestes@hotmail.com','orestes27','orestes27','9123945967','admin');
