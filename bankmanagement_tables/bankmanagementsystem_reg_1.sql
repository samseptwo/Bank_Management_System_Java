-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: bankmanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `reg_1`
--

DROP TABLE IF EXISTS `reg_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reg_1` (
  `name` varchar(50) DEFAULT NULL,
  `fname` varchar(50) DEFAULT NULL,
  `dob` varchar(50) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `marital` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `pin` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reg_1`
--

LOCK TABLES `reg_1` WRITE;
/*!40000 ALTER TABLE `reg_1` DISABLE KEYS */;
INSERT INTO `reg_1` VALUES ('sdfghj','dghj','Jul 13, 2023','single','san@gmail.com','null','xcvbnm','xcvbnm','lkjhgc','sdfghj'),('Sameer Singh','Ajay Singh','Dec 25, 2002','single','sameer2sep2002@gmail.com','null','Up house Uem hostel','Jaipur','Rajasthan','395006'),('s','a','Jul 22, 2023','single','sameer2sep2002@gmail.com','null','asas','asas','asa','asas'),('Rudra','ajay','Jul 23, 2023','single','sameer2sep2002@gmail.com','null','zxcvbnm','cvbn','c','cv'),('sdasd','dasda','Jul 23, 2023','single','sdfsd','null','sfdfs','fdss','dfssd','fsds');
/*!40000 ALTER TABLE `reg_1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-30  1:43:18
