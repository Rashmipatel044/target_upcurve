-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: assignment1
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `countries`
--

DROP TABLE IF EXISTS `countries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `countries` (
  `country_id` varchar(2) NOT NULL,
  `country_name` varchar(50) NOT NULL,
  `region_id` int DEFAULT NULL,
  PRIMARY KEY (`country_id`),
  KEY `region_id` (`region_id`),
  CONSTRAINT `countries_ibfk_1` FOREIGN KEY (`region_id`) REFERENCES `regions` (`region_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countries`
--

LOCK TABLES `countries` WRITE;
/*!40000 ALTER TABLE `countries` DISABLE KEYS */;
INSERT INTO `countries` VALUES ('','',NULL),('1',' Europe ',NULL),('10',' Administration',NULL),('2',' Americas ',NULL),('20',' Marketing',NULL),('3',' Asia ',NULL),('30',' Purchasing',NULL),('4',' Middle East and Africa ',NULL),('40',' Human Resources',NULL),('50',' Shipping',NULL),('60',' IT',NULL),('70',' Public Relations',NULL),('80',' Sales',NULL),('90',' Executive',NULL);
/*!40000 ALTER TABLE `countries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobs`
--

DROP TABLE IF EXISTS `jobs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jobs` (
  `job_id` varchar(15) NOT NULL,
  `job_title` varchar(50) DEFAULT NULL,
  `min_salary` int DEFAULT NULL,
  `max_salary` int DEFAULT NULL,
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobs`
--

LOCK TABLES `jobs` WRITE;
/*!40000 ALTER TABLE `jobs` DISABLE KEYS */;
INSERT INTO `jobs` VALUES (' AC_ACCOUNT',' Public Accountant',4200,9000),(' AC_MGR',' Accounting Manager',8200,16000),(' AD_ASST',' Administration Assistant',3000,6000),(' AD_PRES',' President',20000,40000),(' AD_VP',' Administration Vice President',15000,30000),(' FI_ACCOUNT',' Accountant',4200,9000),(' FI_MGR',' Finance Manager',8200,16000),(' HR_REP',' Human Resources Representative',4000,9000),(' IT_PROG',' Programmer',4000,10000),(' MK_MAN',' Marketing Manager',9000,15000),(' MK_REP',' Marketing Representative',4000,9000),(' PR_REP',' Public Relations Representative',4500,10500),(' PU_CLERK',' Purchasing Clerk',2500,5500),(' PU_MAN',' Purchasing Manager',8000,15000),(' SA_MAN',' Sales Manager',10000,20000),(' SA_REP',' Sales Representative',6000,12000),(' SH_CLERK',' Shipping Clerk',2500,5500),(' ST_CLERK',' Stock Clerk',2000,5000),(' ST_MAN',' Stock Manager',5500,8500);
/*!40000 ALTER TABLE `jobs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locations`
--

DROP TABLE IF EXISTS `locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `locations` (
  `location_id` int NOT NULL,
  `street_address` varchar(255) DEFAULT NULL,
  `postal_code` varchar(10) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state_province` varchar(50) DEFAULT NULL,
  `country_id` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`location_id`),
  KEY `country_id` (`country_id`),
  CONSTRAINT `locations_ibfk_1` FOREIGN KEY (`country_id`) REFERENCES `countries` (`country_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locations`
--

LOCK TABLES `locations` WRITE;
/*!40000 ALTER TABLE `locations` DISABLE KEYS */;
/*!40000 ALTER TABLE `locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regions`
--

DROP TABLE IF EXISTS `regions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `regions` (
  `region_id` int NOT NULL,
  `region_name` varchar(50) NOT NULL,
  PRIMARY KEY (`region_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regions`
--

LOCK TABLES `regions` WRITE;
/*!40000 ALTER TABLE `regions` DISABLE KEYS */;
INSERT INTO `regions` VALUES (1,'Europe'),(2,'Americas'),(3,'Asia'),(4,'middle Asia and Africa');
/*!40000 ALTER TABLE `regions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-09 17:58:19
