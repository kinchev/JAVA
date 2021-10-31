-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.6.4-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for beers
DROP DATABASE IF EXISTS `beers`;
CREATE DATABASE IF NOT EXISTS `beers` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `beers`;

-- Dumping structure for table beers.address
DROP TABLE IF EXISTS `address`;
CREATE TABLE IF NOT EXISTS `address` (
    `address_id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(100) NOT NULL,
    `city_id` int(11) NOT NULL,
    PRIMARY KEY (`address_id`),
    KEY `address_city_city_id_fk` (`city_id`),
    CONSTRAINT `address_city_city_id_fk` FOREIGN KEY (`city_id`) REFERENCES `city` (`city_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table beers.beers
DROP TABLE IF EXISTS `beers`;
CREATE TABLE IF NOT EXISTS `beers` (
    `beer_id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(50) NOT NULL,
    `abv` decimal(10,1) NOT NULL,
    `style_id` int(11) NOT NULL,
    PRIMARY KEY (`beer_id`),
    KEY `beers_styles_style_id_fk` (`style_id`),
    CONSTRAINT `beers_styles_style_id_fk` FOREIGN KEY (`style_id`) REFERENCES `styles` (`style_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table beers.city
DROP TABLE IF EXISTS `city`;
CREATE TABLE IF NOT EXISTS `city` (
    `city_id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(100) NOT NULL,
    `country_id` int(11) NOT NULL,
    PRIMARY KEY (`city_id`),
    KEY `city_country_country_id_fk` (`country_id`),
    CONSTRAINT `city_country_country_id_fk` FOREIGN KEY (`country_id`) REFERENCES `country` (`country_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table beers.country
DROP TABLE IF EXISTS `country`;
CREATE TABLE IF NOT EXISTS `country` (
    `country_id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`country_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table beers.styles
DROP TABLE IF EXISTS `styles`;
CREATE TABLE IF NOT EXISTS `styles` (
    `style_id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(50) NOT NULL,
    PRIMARY KEY (`style_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table beers.users
DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
    `user_id` int(11) NOT NULL AUTO_INCREMENT,
    `username` varchar(50) NOT NULL,
    `password` varchar(50) NOT NULL,
    `first_name` varchar(50) NOT NULL,
    `last_name` varchar(50) NOT NULL,
    `email` varchar(50) NOT NULL,
    `address_id` int(11) NOT NULL,
    PRIMARY KEY (`user_id`),
    KEY `users_address_address_id_fk` (`address_id`),
    CONSTRAINT `users_address_address_id_fk` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table beers.users_beers
DROP TABLE IF EXISTS `users_beers`;
CREATE TABLE IF NOT EXISTS `users_beers` (
    `user_id` int(11) NOT NULL,
    `beer_id` int(11) NOT NULL,
    `drunk` tinyint(1) NOT NULL,
    KEY `users_beers_beers_beer_id_fk` (`beer_id`),
    KEY `users_beers_users_user_id_fk` (`user_id`),
    CONSTRAINT `users_beers_beers_beer_id_fk` FOREIGN KEY (`beer_id`) REFERENCES `beers` (`beer_id`),
    CONSTRAINT `users_beers_users_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
