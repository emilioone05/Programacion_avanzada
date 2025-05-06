DROP DATABASE IF EXISTS VehiculoParcial1;
CREATE DATABASE VehiculoParcial1;
USE VehiculoParcial1;

CREATE TABLE Propietario (
    Idprop INT PRIMARY KEY AUTO_INCREMENT,
    Cedula VARCHAR(20) NOT NULL UNIQUE,
    Apellido VARCHAR(50) NOT NULL,
    Nombre VARCHAR(50) NOT NULL
);
CREATE TABLE Turno (
    Idturn INT PRIMARY KEY AUTO_INCREMENT,
    Anden INT NOT NULL,
    Dia INT NOT NULL,
    Hora INT NOT NULL,
    CONSTRAINT chk_dia CHECK (Dia BETWEEN 1 AND 7), -- 1=Lunes, 7=Domingo
    CONSTRAINT chk_hora CHECK (Hora BETWEEN 0 AND 23) -- Hora en formato 24h
);
CREATE TABLE Vehiculo (
    IdVehi INT PRIMARY KEY AUTO_INCREMENT,
    Placa VARCHAR(15) NOT NULL UNIQUE,
    Marca VARCHAR(50) NOT NULL,
    Estado VARCHAR(20) NOT NULL,
    Ced INT NOT NULL,
    CONSTRAINT fk_vehiculo_propietario FOREIGN KEY (Ced) REFERENCES Propietario(Idprop),
    CONSTRAINT chk_estado CHECK (Estado IN ('Disponible', 'En taller', 'En viaje', 'Inactivo'))
);
