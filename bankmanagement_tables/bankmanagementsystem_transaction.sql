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
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction` (
  `pin` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `amount` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES ('','Thu Jul 27 16:51:22 IST 2023','DEPOSIT','100'),('','Thu Jul 27 16:51:53 IST 2023','DEPOSIT','200'),('','Thu Jul 27 17:17:09 IST 2023','WITHDRAWL','20'),('2389','Fri Jul 28 09:55:19 IST 2023','DEPOSIT','100'),('2389','Fri Jul 28 09:55:37 IST 2023','DEPOSIT','200'),('4786','Fri Jul 28 10:17:11 IST 2023','DEPOSIT','100000'),('4786','Fri Jul 28 10:20:01 IST 2023','DEPOSIT','5000'),('4786','Fri Jul 28 10:20:06 IST 2023','Withdrawl','500'),('4786','Fri Jul 28 10:20:18 IST 2023','WITHDRAWL','100'),('1234','Fri Jul 28 16:40:44 IST 2023','DEPOSIT','1000'),('1234','Fri Jul 28 16:42:25 IST 2023','DEPOSIT','100000'),('1234','Fri Jul 28 16:43:16 IST 2023','DEPOSIT','100'),('1234','Fri Jul 28 16:46:59 IST 2023','DEPOSIT','200');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-30  1:43:19
