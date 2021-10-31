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

-- Dumping data for table beers.address: ~1 rows (approximately)
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` (`address_id`, `name`, `city_id`) VALUES
(1, 'Bul. Dondukov 40', 1);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;

-- Dumping data for table beers.beers: ~10 rows (approximately)
/*!40000 ALTER TABLE `beers` DISABLE KEYS */;
INSERT INTO `beers` (`beer_id`, `name`, `abv`, `style_id`) VALUES
(1, 'Glarus English Ale', 4.6, 8),
(2, 'Rhombus Porter', 5.0, 4),
(3, 'Opasen char', 6.6, 6),
(4, 'Ailyak', 6.6, 6),
(5, 'Basi Kefa', 6.7, 6),
(6, 'Vitoshko lale', 5.5, 2),
(7, 'Divo Pivo', 4.5, 2),
(8, 'Bloody Muddy', 5.0, 3),
(9, 'Black Head', 5.0, 5),
(10, 'Pilsner Urquell', 4.4, 1);
/*!40000 ALTER TABLE `beers` ENABLE KEYS */;

-- Dumping data for table beers.city: ~3 rows (approximately)
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` (`city_id`, `name`, `country_id`) VALUES
(1, 'Sofia', 1),
(2, 'Varna', 1),
(3, 'Burgas', 1);
/*!40000 ALTER TABLE `city` ENABLE KEYS */;

-- Dumping data for table beers.country: ~1 rows (approximately)
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` (`country_id`, `name`) VALUES
(1, 'Bulgaria');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;

-- Dumping data for table beers.styles: ~8 rows (approximately)
/*!40000 ALTER TABLE `styles` DISABLE KEYS */;
INSERT INTO `styles` (`style_id`, `name`) VALUES
(1, 'Pilsner'),
(2, 'Pale ale'),
(3, 'Red Ale'),
(4, 'Porter'),
(5, 'Stout'),
(6, 'Indian pale ale'),
(7, 'Weissbier'),
(8, 'Special ale');
/*!40000 ALTER TABLE `styles` ENABLE KEYS */;

-- Dumping data for table beers.users: ~3 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`user_id`, `username`, `password`, `first_name`, `last_name`, `email`, `address_id`) VALUES
(1, 'todor', 'pass1', 'Todor', 'Andonov', 'todor@telerikacademy.com', 1),
(2, 'vladi', 'pass2', 'Vladi', 'Venkov', 'vladi@telerikacademy.com', 1),
(3, 'pesho', 'pass3', 'Petar', 'Raykov', 'pesho@telerikacademy.com', 1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Dumping data for table beers.users_beers: ~11 rows (approximately)
/*!40000 ALTER TABLE `users_beers` DISABLE KEYS */;
INSERT INTO `users_beers` (`user_id`, `beer_id`, `drunk`) VALUES
(1, 1, 0),
(1, 2, 0),
(1, 3, 1),
(1, 5, 1),
(2, 3, 0),
(2, 4, 0),
(3, 3, 1),
(3, 5, 1),
(3, 7, 1),
(3, 8, 1),
(3, 10, 1);
/*!40000 ALTER TABLE `users_beers` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
