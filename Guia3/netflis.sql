-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-08-2023 a las 16:39:00
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `netflis`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seriespeliculas`
--

CREATE TABLE `seriespeliculas` (
  `idContenido` int(11) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `formato` varchar(30) NOT NULL,
  `creador` varchar(50) NOT NULL,
  `estreno` int(11) NOT NULL,
  `puntaje` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `seriespeliculas`
--

INSERT INTO `seriespeliculas` (`idContenido`, `titulo`, `formato`, `creador`, `estreno`, `puntaje`) VALUES
(1, 'El Planeta de los Simios', 'Novela', 'Peter Jackson', 1963, 9.8),
(2, 'El Planeta de los Simios', 'Pelicula', 'Franklin Schaffner', 1968, 7.9),
(3, 'Escape del Planeta de los Simios', 'Pelicula', 'Arthur P. Jacobs', 1972, 6.7),
(4, 'Conquista del Planeta de los Simios', 'Pelicula', 'Arthur P. Jacobs', 1972, 6.7),
(5, 'La Batalla por el Planeta de los Simios', 'Pelicula', 'Arthur P. Jacobs', 1973, 8.6),
(6, 'El Planeta de los Simios', 'Serie', 'Mort Abraham', 1974, 7),
(8, 'El Planeta de los Simios', 'Comic', 'El Planeta de los Simios Franquicia', 1975, 8.2),
(9, 'El Planeta de los Simios', 'Pelicula', 'Tim Burton', 2001, 8),
(10, 'El Planeta de los Simios: Evolucion', 'Pelicula', 'Rupert Wyatt', 2011, 7.8),
(11, 'El Planeta de los Simios: Confrontacion', 'Pelicula', 'Matt Reeves', 2014, 9),
(12, 'La Guerra del Planeta de los Simios', 'Serie', 'Matt Reeves', 2017, 9.5),
(15, 'Transformers: Bumblebee', 'Pelicula', 'Travis Knight', 2018, 7.4),
(16, 'Transformers: El Último Caballero', 'Pelicula', 'Michael Bay ', 2017, 8.2),
(17, 'Transformers: La Guerra por Cybertron - El Asedio', 'Serie', 'Pierre Boulle', 2020, 9.8);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `seriespeliculas`
--
ALTER TABLE `seriespeliculas`
  ADD PRIMARY KEY (`idContenido`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `seriespeliculas`
--
ALTER TABLE `seriespeliculas`
  MODIFY `idContenido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
