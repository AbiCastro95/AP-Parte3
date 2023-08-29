-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-08-2023 a las 17:30:32
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nesflis`
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `seriespeliculas`
--

INSERT INTO `seriespeliculas` (`idContenido`, `titulo`, `formato`, `creador`, `estreno`, `puntaje`) VALUES
(1, 'el planeta de los simios', 'novela', 'peter jakcson', 1963, 9.8),
(2, 'el planeta de los simios', 'pelicula', 'franklin Schaffner', 1968, 7.9),
(3, 'escape del planeta de los simios ', 'pelicula', 'arthur P.jacobs', 1972, 6.7),
(4, 'conquista del planeta de los simios', 'pelicula', 'arthur P. jacobs', 1972, 6.7),
(5, 'la batalla por el planeta de los simios', 'pelicula', 'arthut P.jacobs', 1973, 8.6),
(6, 'el planeta de los simios', 'serie', 'mort abraham', 1974, 7),
(8, 'el planeta de los simios', 'comic', 'el planeta de los simios franquicia', 1975, 8.2),
(9, 'el planeta de los simios', 'pelicula', 'tim burton', 2001, 8),
(10, 'el planeta de los simios evolucion', 'pelicula', 'rupert wyatt', 2011, 7.8),
(11, 'el planeta de los simios confrontacion', 'pelicula', 'matt reeves', 2014, 9),
(12, 'la guerra del planeta de los simios', 'serie ', 'matt reeves', 2017, 9.5),
(15, 'transformers: Bumblebee', 'pelicula', 'travis knight', 2018, 7.4),
(16, 'transformers: el ultimo caballero', 'pelicula', 'michael bay ', 2017, 8.2),
(17, 'transformers: la guerra por cybertron- el asedio', 'serie', 'pierre boulle', 2020, 9.8);

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
