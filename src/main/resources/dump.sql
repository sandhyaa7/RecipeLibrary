-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: recipelibrary
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `recipes`
--

DROP TABLE IF EXISTS `recipes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recipes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `recipeTitle` varchar(100) DEFAULT NULL,
  `recipeDescription` longtext,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `recipes_pk` (`id`),
  KEY `recipes_user_fk` (`user_id`),
  CONSTRAINT `recipes_user_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recipes`
--

LOCK TABLES `recipes` WRITE;
/*!40000 ALTER TABLE `recipes` DISABLE KEYS */;
INSERT INTO `recipes` VALUES (1,'Eggplant Curry','fresh cilantro.',1),(2,'Potato Salad',' isi vitae matti Cras nec sem nulla.',1),(3,'Rice','Donec eget elit cursus, vulputate dui at, consectetur eros. Sed finibus mollis lacus et viverra. Integer porta eget elit eu placerat. Phasellus a odio luctus, ultrices erat eget, tristique nunc. Cras ut urna id quam egestas fringilla. Maecenas sit amet dui risus. Sed aliquet, nisl in fermentum ullamcorper, urna turpis facilisis justo, at vehicula dui velit at mi.',2),(4,'Clear Soup','Donec eget elit cursus, vulputate dui at, consectetur eros. Sed finibus mollis lacus et viverra. Integer porta eget elit eu placerat. Phasellus a odio luctus, ultrices erat eget, tristique nunc. Cras ut urna id quam egestas fringilla. Maecenas sit amet dui risus. Sed aliquet, nisl in fermentum ullamcorper, urna turpis facilisis justo, at vehicula dui velit at mi.',3),(5,'Fruit Salad','Donec eget elit cursus, vulputate dui at, consectetur eros. Sed finibus mollis lacus et viverra. Integer porta eget elit eu placerat. Phasellus a odio luctus, ultrices erat eget, tristique nunc.',3),(24,'Carrot salad','Donec eget elit cursus, vulputate dui at, consectetur eros. Sed finibus mollis lacus et viverra. Integer porta eget elit eu placerat. Phasellus a odio luctus, ultrices erat eget, tristique nunc. Cras ut urna id quam egestas fringilla. Maecenas sit amet',1);
/*!40000 ALTER TABLE `recipes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userId` int NOT NULL AUTO_INCREMENT,
  `firstName` varchar(20) DEFAULT NULL,
  `lastName` varchar(30) DEFAULT NULL,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Sam','Windt','sWindt','pepper'),(2,'Will','Murphy','wMurphy','bell'),(3,'Will','Murry','wMurry','pop'),(4,'Ray','Thompson','rThompson','sole'),(5,'Windy','West','wWest','snow'),(6,'Reah','Edwards','rEdwards','key'),(12,'Fred','Flintstone','fflintstone','apple');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-13 14:53:22
