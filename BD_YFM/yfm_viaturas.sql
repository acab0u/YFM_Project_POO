-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: yfm
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `viaturas`
--

DROP TABLE IF EXISTS `viaturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `viaturas` (
  `id_viatura` int NOT NULL AUTO_INCREMENT,
  `id_empresa` int DEFAULT NULL,
  `matricula` varchar(8) NOT NULL,
  `data_matricula` date NOT NULL,
  `nome_viatura` varchar(15) NOT NULL,
  `modelo_viatura` varchar(15) NOT NULL,
  `nr_apolice` int NOT NULL,
  `data_apolice` date NOT NULL,
  `quilometros_viatura` int NOT NULL,
  PRIMARY KEY (`id_viatura`),
  KEY `id_empresa` (`id_empresa`),
  CONSTRAINT `viaturas_ibfk_1` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viaturas`
--

LOCK TABLES `viaturas` WRITE;
/*!40000 ALTER TABLE `viaturas` DISABLE KEYS */;
INSERT INTO `viaturas` VALUES (1,1,'25-74-AF','2010-04-10','Peugeot','2008 Crossover',586324867,'2010-04-24',140135),(2,3,'34-74-AZ','2017-01-25','Peugeot','2008 Crossover',519856487,'2017-01-27',210457),(3,2,'29-16-BF','2018-05-04','BMW','Série 3 Touring',159874563,'2018-05-15',120411),(4,4,'27-26-LJ','2013-02-28','Ford','Transit',158746298,'2013-03-10',210457),(6,5,'31-12-AZ','2015-11-18','Ford','Connect',125896587,'2015-11-28',125000),(7,2,'10-22-GL','2017-12-15','Citroen','Berlingo',502485796,'2017-12-28',126051),(8,3,'36-15-TG','2011-02-21','Mitsubishi','L200',135485274,'2011-02-23',112450),(9,4,'51-25-QJ','2013-04-14','Opel','Combo',110245056,'2013-04-22',150100),(10,1,'41-42-OX','2015-06-11','Renault','Kangoo',135159851,'2015-06-18',350154),(11,5,'29-15-ZB','2019-08-06','Fiat','Ducato',502154785,'2019-08-10',850245),(12,3,'35-82-LD','2018-12-21','Renault','Kangoo',503598524,'2018-01-10',350214);
/*!40000 ALTER TABLE `viaturas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-26 23:59:43
