-- Proyecto: Sistema de Recarga de Celulares
-- Curso: Programación Avanzada - 4to Ciclo
-- Autor: [Emilio Peña]

-- Eliminar base de existencia previa
DROP DATABASE IF EXISTS recarga_celulares;
CREATE DATABASE recarga_celulares;
USE recarga_celulares;

-- Tabla Clientes 
CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    cedula VARCHAR(10) UNIQUE NOT NULL,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL
);

-- Tabla Celulares con estado (0 = Inhabilitado, 1 = Habilitado)
CREATE TABLE celulares (
    id_celular INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(15) UNIQUE NOT NULL,
    estado TINYINT DEFAULT 1 COMMENT '0-Inhabilitado, 1-Habilitado',
    saldo DECIMAL(8,2) DEFAULT 0.00,
    megas INT DEFAULT 0,
    id_cliente INT NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);

-- Tabla Histórico de Recargas (Registro de movimientos)
CREATE TABLE recargas (
    id_recarga INT AUTO_INCREMENT PRIMARY KEY,
    id_celular INT NOT NULL,
    monto DECIMAL(8,2) NOT NULL,
    megas INT NOT NULL,
    fecha DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_celular) REFERENCES celulares(id_celular)
);
