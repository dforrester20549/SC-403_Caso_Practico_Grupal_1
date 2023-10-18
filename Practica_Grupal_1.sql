-- Crear la base de datos "practica"
CREATE DATABASE practica;

-- Usar la base de datos "practica"
USE practica;

-- Crear el usuario "usuario_practica" con la contraseña "la_Clave"
CREATE USER 'usuario_practica'@'localhost' IDENTIFIED BY 'la_Clave';

-- Conceder todos los privilegios al usuario "usuario_practica" en la base de datos "practica"
GRANT ALL PRIVILEGES ON practica.* TO 'usuario_practica'@'localhost';

-- Actualizar los privilegios
FLUSH PRIVILEGES;

-- Crear la tabla "arbol"
CREATE TABLE arbol (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ruta_imagen TEXT,
    nombre_comun VARCHAR(255),
    tipo_flor VARCHAR(255),
    dureza_madera INT,
    otros_datos TEXT
);

ALTER TABLE arbol
ADD activo BOOL;

-- Insertar 10 registros en la tabla "arbol"
INSERT INTO arbol (ruta_imagen, nombre_comun, tipo_flor, dureza_madera, otros_datos)
VALUES
    ('imagen1.jpg', 'Roble', 'Sin flores', 9, 'Resistente al clima frío'),
    ('imagen2.jpg', 'Pino', 'Sin flores', 8, 'Madera utilizada en construcción'),
    ('imagen3.jpg', 'Cerezo', 'Flores blancas', 6, 'Frutos comestibles'),
    ('imagen4.jpg', 'Arce', 'Flores rojas', 7, 'Follaje otoñal colorido'),
    ('imagen5.jpg', 'Palma', 'Flores pequeñas', 3, 'Tropical, sin madera dura'),
    ('imagen6.jpg', 'Cedro', 'Sin flores', 8, 'Madera de calidad para muebles'),
    ('imagen7.jpg', 'Olivo', 'Flores blancas', 5, 'Frutos utilizados en aceite de oliva'),
    ('imagen8.jpg', 'Abeto', 'Sin flores', 7, 'Árbol de Navidad común'),
    ('imagen9.jpg', 'Secuoya', 'Flores pequeñas', 10, 'Uno de los árboles más altos del mundo'),
    ('imagen10.jpg', 'Nogal', 'Flores amarillas', 6, 'Frutos con nueces comestibles');