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
-- Table structure for table `colaborador`
--

DROP TABLE IF EXISTS `colaborador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `colaborador` (
  `id_colaborador` int NOT NULL AUTO_INCREMENT,
  `id_empresa` int DEFAULT NULL,
  `nome_colaborador` varchar(50) DEFAULT NULL,
  `morada` varchar(80) DEFAULT NULL,
  `localidade` varchar(25) DEFAULT NULL,
  `contacto` int DEFAULT NULL,
  `e_mail` varchar(50) DEFAULT NULL,
  `nif` int DEFAULT NULL,
  `username` varchar(15) DEFAULT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id_colaborador`),
  KEY `id_empresa` (`id_empresa`),
  CONSTRAINT `colaborador_ibfk_1` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colaborador`
--

LOCK TABLES `colaborador` WRITE;
/*!40000 ALTER TABLE `colaborador` DISABLE KEYS */;
INSERT INTO `colaborador` VALUES (1,1,'João Miguel','Rua Prata Silva nº23','Lisboa',912584789,'jm213@gmail.com',NULL,'joaomiguel213','joaomiguel'),(2,2,'Luis Sousa','Avenida Helio Pereira nº67','Lisboa',912547848,'ls43@gmail.com',NULL,'luissousa43','luissousa'),(3,1,'Manuel Sampaio','Avenida MArechal Pereira nº42','Loures',965478415,'msampaio@gmail.com',NULL,'manuel_sampaio','manuelsampaio'),(5,5,'Filipe Amaral','Travessa do Prado nº12','Amadora',911206148,'famaral@gmail.com',NULL,'filipe_amaral','filipeamaral'),(6,3,'Luisa Fidalgo','Avenida Lopes Gameiro lote 74','Odivelas',917207512,'lfidalgo@gmail.com',NULL,'luisa_fidalgo','luisafidalgo'),(7,3,'Paulo Dionisio','Rua Amaro Gomes 89','Sintra',917851006,'p.dionisio@gmail.com',NULL,'p_dionisio','paulodionisio'),(8,2,'Carlos Fernandes','Avenida Doutor Graça nº52','Oeiras',918444123,'cfernandes@gmail.com',NULL,'fernandesc','cfernandes'),(9,1,'Joaquim  Santos','Rua Sousa Silva','Cascais',917225106,'j.santos@gmail.com',NULL,'joaquimfsantos','jsantos'),(10,4,'Nuno Rebelo Reis','Travessa do Prado nº14','Mafra',915056179,'n.reis@gmail.com',NULL,'nuno_reis','nunoreis'),(11,5,'Tomás Armando Proença','Rua das Graças nº82','Vila Franca de Xira',910756570,'t.proenca@icloud.com',NULL,'tomas.proenca','tproenca'),(12,3,'Miguel Venancio Lacerda','Rua Jordão Dias nº12','Lisboa',910590648,'m.lacerda@gmail.com',NULL,'miguel_lacerda','mlacerda'),(13,4,'Fernando Claro','Travessa do Pecado nº71','Loures',935597812,'fclaro@gmail.com',NULL,'fernando_claro','fclaro'),(14,2,'Luisa Marques','Rua Fernão Daniel nº25','Lisboa',938477812,'luisa.marques@gmail.com',NULL,'luisa_marques','luisamarques'),(15,1,'Carlos Alves','Rua Jorge Lopes nº35','Cascais',968475451,'c.alves@gmail.com',NULL,'carlos_alves','carlosalves'),(16,3,'Claudia Gomes','Praçeta Manuel Franco nº46','Odivelas',964747812,'c.gomes@gmail.com',NULL,'claudia_gomes','cgomes');
/*!40000 ALTER TABLE `colaborador` ENABLE KEYS */;
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
