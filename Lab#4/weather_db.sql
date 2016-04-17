-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 17, 2016 at 02:41 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `weather_db`
--
CREATE DATABASE IF NOT EXISTS `weather_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_romanian_ci;
USE `weather_db`;

-- --------------------------------------------------------

--
-- Table structure for table `row`
--

CREATE TABLE IF NOT EXISTS `row` (
  `DATE` date NOT NULL,
  `Time` text CHARACTER SET utf8 COLLATE utf8_romanian_ci NOT NULL,
  `Image` text CHARACTER SET utf8 COLLATE utf8_romanian_ci NOT NULL,
  `Temperature` text CHARACTER SET utf8 COLLATE utf8_romanian_ci NOT NULL,
  `Pressure` int(11) NOT NULL,
  `Wind` text CHARACTER SET ucs2 COLLATE ucs2_romanian_ci NOT NULL,
  KEY `DATE` (`DATE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `row`
--

INSERT INTO `row` (`DATE`, `Time`, `Image`, `Temperature`, `Pressure`, `Wind`) VALUES
('2016-04-16', '06:00', '01', '+10', 741, '2.2'),
('2016-04-16', '12:00', '11', '+24', 742, '2.1'),
('2016-04-16', '18:00', '11', '+22', 740, '2.5'),
('2016-04-16', '24:00', '01', '+11', 741, '2.5'),
('2016-04-17', '06:00', '03', '+11', 742, '2.0'),
('2016-04-17', '12:00', '11', '+24', 742, '3.1'),
('2016-04-17', '18:00', '13', '+25', 741, '1.8'),
('2016-04-17', '24:00', '02', '+17', 742, '3.0'),
('2016-04-18', '06:00', '03', '+14', 741, '2.2'),
('2016-04-18', '12:00', '11', '+26', 742, '3.5'),
('2016-04-18', '18:00', '13', '+24', 741, '2.5'),
('2016-04-18', '24:00', '02', '+18', 740, '2.5'),
('2016-04-19', '06:00', '03', '+16', 742, '4.2'),
('2016-04-19', '12:00', '14', '+13', 745, '2.9'),
('2016-04-19', '18:00', '14', '+17', 744, '3.4'),
('2016-04-19', '24:00', '01', '+14', 744, '1.5'),
('2016-04-20', '06:00', '03', '+8', 746, '2.1'),
('2016-04-20', '12:00', '14', '+13', 746, '0.9'),
('2016-04-20', '18:00', '14', '+14', 745, '4.8'),
('2016-04-20', '24:00', '01', '+10', 746, '3.3'),
('2016-04-21', '06:00', '03', '+8', 746, '3.9'),
('2016-04-21', '12:00', '14', '+8', 746, '7.3'),
('2016-04-21', '18:00', '11', '+12', 745, '8.3'),
('2016-04-21', '24:00', '01', '+9', 746, '2.9'),
('2016-04-22', '06:00', '01', '+3', 741, '2.5'),
('2016-04-22', '12:00', '14', '+9', 749, '1.7'),
('2016-04-22', '18:00', '14', '+16', 743, '5.2'),
('2016-04-22', '24:00', '03', '+12', 738, '2.3'),
('2016-04-23', '06:00', '03', '+11', 737, '2.1'),
('2016-04-23', '12:00', '13', '+12', 738, '4.0'),
('2016-04-23', '18:00', '14', '+17', 737, '2.4'),
('2016-04-23', '24:00', '05', '+13', 737, '1.9'),
('2016-04-24', '06:00', '05', '+9', 737, '2.1'),
('2016-04-24', '12:00', '14', '+10', 736, '2.1'),
('2016-04-24', '18:00', '15', '+17', 734, '3.7'),
('2016-04-24', '24:00', '03', '+14', 732, '3.8'),
('2016-04-25', '06:00', '05', '+11', 731, '3.6'),
('2016-04-25', '12:00', '15', '+13', 729, '3.9'),
('2016-04-25', '18:00', '15', '+18', 725, '3.4'),
('2016-04-25', '24:00', '01', '+10', 730, '5.4');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
