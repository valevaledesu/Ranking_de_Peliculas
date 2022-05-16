-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 16-05-2022 a las 15:32:06
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `rankingpeliculasdb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Comentarios`
--

CREATE TABLE `Comentarios` (
  `id_comentario` int(11) NOT NULL,
  `comentario` text NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `fecha` varchar(15) NOT NULL,
  `id_post` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Directores`
--

CREATE TABLE `Directores` (
  `id_director` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `nacionalidad` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Directores`
--

INSERT INTO `Directores` (`id_director`, `nombre`, `nacionalidad`) VALUES
(1, 'Gaspar Noé', 'Argentina'),
(2, 'Sophia Copola', 'Americana'),
(3, 'David Lynch ', 'Americana'),
(4, 'Stanley Kubrick', 'Americana'),
(5, 'Victor Fleming', 'Alemana'),
(6, 'David Lynch ', 'Americana'),
(7, 'Stanley Kubrick', 'Americana'),
(8, 'Victor Fleming', 'Alemana');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Peliculas`
--

CREATE TABLE `Peliculas` (
  `id_pelicula` int(11) NOT NULL,
  `nombre` varchar(55) NOT NULL,
  `genero` varchar(20) NOT NULL,
  `id_director` int(11) NOT NULL,
  `duracion` int(11) NOT NULL,
  `descripcion` text NOT NULL,
  `clasificacion` varchar(3) NOT NULL,
  `productora` varchar(20) NOT NULL,
  `ano_estreno` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Peliculas`
--

INSERT INTO `Peliculas` (`id_pelicula`, `nombre`, `genero`, `id_director`, `duracion`, `descripcion`, `clasificacion`, `productora`, `ano_estreno`) VALUES
(1, 'Climax', 'Sexo', 1, 133, 'Pelicula sexo y drogas', 'C', 'Independiente', '2020'),
(2, 'Mago de Oz', 'Fantasia ', 5, 90, 'Dorothy, sueña con viajar más allá del arco iris, un tornado se la lleva con su perrito al mundo de Oz. Se dirige por el Camino Amarillo hacia la Ciudad Esmeralda, donde vive el todopoderoso Mago de Oz, que puede ayudarla a regresar a Kansas.', 'AA', 'Metro-Goldwyn-Mayer', '1939'),
(3, 'Enter the Void ', 'Experimental Drama', 1, 120, 'El fantasma (Nathaniel Brown) de un narcotraficante experimenta un viaje excéntrico y voyeurístico a través de la vida futura mientras se pase por Tokio.', 'C', 'Gaspar Noé', '2010');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Publicaciones`
--

CREATE TABLE `Publicaciones` (
  `id_post` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `fecha` varchar(15) NOT NULL,
  `publicacion` text NOT NULL,
  `id_pelicula` int(11) NOT NULL,
  `estrellas` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Publicaciones`
--

INSERT INTO `Publicaciones` (`id_post`, `id_usuario`, `fecha`, `publicacion`, `id_pelicula`, `estrellas`) VALUES
(1, 3, '16-05-2022', 'La neta esta bien aburrida la peli', 2, 0),
(2, 2, '10-05-2022', 'Muy adelantado a su epoca', 3, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuarios`
--

CREATE TABLE `Usuarios` (
  `id_usuario` int(11) NOT NULL,
  `username` text NOT NULL,
  `contrasena` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Usuarios`
--

INSERT INTO `Usuarios` (`id_usuario`, `username`, `contrasena`) VALUES
(1, 'Vale_aguilar666', '123'),
(2, 'ana_belenajeje', 'anitajeje'),
(3, 'tonycituk777', '1qazxsw2'),
(4, 'roger@lopez', 'rog111er');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Comentarios`
--
ALTER TABLE `Comentarios`
  ADD PRIMARY KEY (`id_comentario`);

--
-- Indices de la tabla `Directores`
--
ALTER TABLE `Directores`
  ADD PRIMARY KEY (`id_director`);

--
-- Indices de la tabla `Peliculas`
--
ALTER TABLE `Peliculas`
  ADD PRIMARY KEY (`id_pelicula`);

--
-- Indices de la tabla `Publicaciones`
--
ALTER TABLE `Publicaciones`
  ADD PRIMARY KEY (`id_post`);

--
-- Indices de la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Comentarios`
--
ALTER TABLE `Comentarios`
  MODIFY `id_comentario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Directores`
--
ALTER TABLE `Directores`
  MODIFY `id_director` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `Peliculas`
--
ALTER TABLE `Peliculas`
  MODIFY `id_pelicula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `Publicaciones`
--
ALTER TABLE `Publicaciones`
  MODIFY `id_post` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
