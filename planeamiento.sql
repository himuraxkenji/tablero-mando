-- MySQL dump 10.16  Distrib 10.1.41-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: planeamiento
-- ------------------------------------------------------
-- Server version	10.1.41-MariaDB-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `datosvarios`
--

DROP TABLE IF EXISTS `datosvarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `datosvarios` (
  `iddatosvarios` int(11) NOT NULL AUTO_INCREMENT,
  `gastos_de_comercializacion` double DEFAULT NULL,
  `ventas_totales` double DEFAULT NULL,
  `activo_corriente` double DEFAULT NULL,
  `activo_no_corriente` double DEFAULT NULL,
  `pasivo_corriente` double DEFAULT NULL,
  `pasivo_no_corriente` double DEFAULT NULL,
  `disponibilidades` double DEFAULT NULL,
  `inversiones_a_corto_plazo` double DEFAULT NULL,
  `capital_propio` double DEFAULT NULL,
  `anio` int(11) DEFAULT NULL,
  PRIMARY KEY (`iddatosvarios`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datosvarios`
--

LOCK TABLES `datosvarios` WRITE;
/*!40000 ALTER TABLE `datosvarios` DISABLE KEYS */;
INSERT INTO `datosvarios` VALUES (1,159760,1000,85667000,76989213,534000,0,26755897,14500000,200000000,2017),(2,165800,23700543,93888000,95433000,2645000,450000,33000600,12460000,200000000,2018),(3,284320,27569310,114854322,138456732,3567900,1200000,12434500,22900500,230000000,2019);
/*!40000 ALTER TABLE `datosvarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produccion`
--

DROP TABLE IF EXISTS `produccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produccion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `producto` char(5) DEFAULT NULL,
  `producto_en_proceso` double DEFAULT NULL,
  `producto_terminados` double DEFAULT NULL,
  `defectuosos` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produccion`
--

LOCK TABLES `produccion` WRITE;
/*!40000 ALTER TABLE `produccion` DISABLE KEYS */;
INSERT INTO `produccion` VALUES (1,'A',20,80,2),(2,'B',35,65,12),(3,'C',55,45,3),(4,'D',80,20,8),(5,'E',67,33,1);
/*!40000 ALTER TABLE `produccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rrhh`
--

DROP TABLE IF EXISTS `rrhh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rrhh` (
  `idempleado` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(40) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `departamento` varchar(30) DEFAULT NULL,
  `puesto` varchar(30) DEFAULT NULL,
  `salario` double DEFAULT NULL,
  `faltas` int(11) DEFAULT NULL,
  `cursos_capacitacion` int(11) DEFAULT NULL,
  `horas_extras` int(11) DEFAULT NULL,
  `despidos` int(11) DEFAULT NULL,
  `fecha_despido` varchar(45) DEFAULT NULL,
  `genero` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idempleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rrhh`
--

LOCK TABLES `rrhh` WRITE;
/*!40000 ALTER TABLE `rrhh` DISABLE KEYS */;
INSERT INTO `rrhh` VALUES (1,'Alaminos','Carmen Anahí','Administracion','Gte. Adm.',120000,0,3,0,0,'','Femenino'),(2,'Alarcon','Josefina Ines','Produccion','Operario',42000,3,1,0,1,'30/08/2019','Femenino'),(3,'Belís','Sandra Estefanía','Produccion','Operario',48700,2,1,12,0,'','Femenino'),(4,'Buonanote','Mauricio Juan','Finanzas','Gte. Finanzas',150000,1,0,0,0,'','Masculino'),(5,'Cantero','Hilda Sonia','Comercializacion','Ventas',52130,2,1,4,0,'','Femenino'),(6,'Caparroz','Maria Josefina','Comercializacion','Ventas',52300,0,1,2,0,'','Femenino'),(7,'Cuello','Mariano','Finanzas','Jefe Rendic.',65400,0,0,3,0,'','Masculino'),(8,'Diaz','Solange','Comercializacion','Jefe Market',62500,0,3,6,0,'','Femenino'),(9,'Drabe','Sergio Anibal','Produccion','Gte. Producc',175000,0,1,0,0,'','Masculino'),(10,'Edel','Luciano Jose','Personal','Gte. RHHH',115000,0,2,0,0,'','Masculino'),(11,'Fantino','Hilario Exequiel','Produccion','Jefe Fabrica',71000,0,0,8,0,'','Masculino'),(12,'Gutierrez Solar','Jesica','Personal','Formacion RRHH',68000,0,4,0,0,'','Femenino'),(13,'Hansen','Cristina Mabel','Administracion','Tesorera',71000,0,0,10,0,'','Femenino'),(14,'Irazabal','Jose Luis','Produccion','Jefe Almacen',45000,2,0,0,1,'23/08/2019','Masculino'),(15,'Jaime','Lucia Ana','Personal','Control RRHH',56700,0,2,0,0,'','Femenino'),(16,'Landi','Eduardo Angel','Administracion','Liquidacion Sueldos',82000,0,1,10,0,'','Masculino'),(17,'Maidana','Juan Alberto','Sistemas','Gte. Sistemas',125000,0,0,0,0,'','Masculino'),(18,'Mateo','Analia Belen','Administracion','Auditora',75000,0,0,0,0,'','Femenino'),(19,'Melero','Jose Anibal','Finanzas','Jefe G. Bancaria',78,0,0,0,0,'','Masculino'),(20,'Merton','Ricardo Abel','Comercializacion','Gte. Comercial',145000,0,1,0,0,'','Masculino'),(21,'Olave','Santurino Jose','Comercializacion','Ctas. Ctes',67000,0,0,0,0,'','Masculino'),(22,'Peña','Fabricio Noel','Produccion','Encargado Compras',62000,0,0,5,0,'','Masculino'),(23,'Perez','Juan Carlos','Finanzas','Auxiliar',35000,1,1,0,0,'','Masculino'),(24,'Piñera','Solana Anabel','Produccion','Operario',54000,3,1,12,0,'','Femenino'),(25,'Quiroga','Alfredo Raul','Produccion','Operario',61000,0,1,14,0,'','Masculino'),(26,'Romera','Ruth Isabel','Produccion','Operario',39000,0,1,10,0,'','Femenino'),(27,'Salazar','Avaristo','Sistemas','Operador',43500,2,0,12,0,'','Masculino'),(28,'Santibares','Lucas Arturo','Produccion','Higiene y Seguridad',75000,1,1,0,0,'','Masculino'),(29,'Soria','Claudia Liliana','Sistemas','Programador',64200,3,2,2,0,'','Femenino'),(30,'Talavera','Indiana','Sistemas','Programador',63800,0,1,9,0,'','Femenino'),(31,'Tabares','Cesar','Sistemas','Programador',63364,0,NULL,NULL,NULL,NULL,'Femenino'),(32,'Champi','SADF','Sistemas','Analista',63333,0,2,1,0,NULL,'Masculino'),(33,'alguno','ASD','Sistemas','Nose',698,1,2,1,2,'12/10/2018','Femenino');
/*!40000 ALTER TABLE `rrhh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ventas` (
  `idventa` int(11) NOT NULL AUTO_INCREMENT,
  `cliente` varchar(254) DEFAULT NULL,
  `importe` decimal(20,4) DEFAULT NULL,
  `contado` decimal(20,4) DEFAULT NULL,
  `credito` decimal(20,4) DEFAULT NULL,
  `medio` varchar(254) DEFAULT NULL,
  `destino` varchar(250) DEFAULT NULL,
  `mes` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idventa`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,'Amarcor S.A',200000.0000,30.0000,70.0000,'Negocio','San Juan','Mayo'),(2,'Sanchez, Juan',58.0000,80.0000,20.0000,'Internet','Catamarca','Mayo'),(3,'La Lucila S.R.L.',243.0000,85.0000,15.0000,'Negocio','Catamarca','Mayo'),(4,'El Laberinto',83.2000,100.0000,NULL,'Negocio','San Luis','Mayo'),(5,'La Conana',65.0000,50.0000,50.0000,'Internet','La Rioja','Mayo'),(6,'Sarmiento S.R.L.',326.0000,20.0000,80.0000,'Negocio','La Rioja','Mayo'),(7,'Gutierrez Alberto',112.5000,40.0000,60.0000,'Internet','Neuquén','Mayo'),(8,'Mendoza S.R.L.',89.0000,100.0000,NULL,'Internet','Mendoza','Mayo'),(9,'El Guardián',116.0000,60.0000,40.0000,'Negocio','Córdoba','Mayo'),(10,'Los Trinos',285.0000,100.0000,0.0000,'Internet','Paraguay','Mayo'),(11,'INDIC S.R.L.',423.0000,50.0000,50.0000,'Negocio','Uruguay','Mayo'),(12,'Amarcor S.A.',342.0000,25.0000,75.0000,'Negocio','San Juan','Junio'),(13,'Sanchez, Juan',146.7900,30.0000,70.0000,'Internet','Catamarca','Junio'),(14,'La Lucila S.R.L.',134.0000,100.0000,0.0000,'Negocio','Catamarca','Junio'),(15,'El Laberinto',54.0000,100.0000,0.0000,'Negocio','San Luis','Junio'),(16,'La Conana',89.0000,50.0000,50.0000,'Internet','La Rioja','Junio'),(17,'Sarmiento S.R.L.',265.8000,40.0000,60.0000,'Negocio','La Rioja','Junio'),(18,'Gutierrez Alberto',113.5000,80.0000,20.0000,'Internet','Neuquén','Junio'),(19,'Mendoza S.R.L.',422.0000,40.0000,60.0000,'Internet','Mendoza','Junio'),(20,'El Guardián',69.0000,100.0000,0.0000,'Negocio','Córdoba','Junio'),(21,'Los Trinos',158.4000,70.0000,30.0000,'Internet','Paraguay','Junio'),(22,'INDIC S.R.L.',269.6000,50.0000,50.0000,'Negocio','Uruguay','Junio'),(23,'Amarcor S.A.',124.3000,100.0000,0.0000,'Negocio','San Juan','Julio'),(24,'Sanchez, Juan',235.0000,60.0000,40.0000,'Internet','Catamarca','Julio'),(25,'La Lucila S.R.L.',213.0000,70.0000,30.0000,'Negocio','Catamarca','Julio'),(26,'El Laberinto',366.0000,65.0000,35.0000,'Negocio','San Luis','Julio'),(27,'La Conana',125.0000,50.0000,50.0000,'Internet','La Rioja','Julio'),(28,'Sarmiento S.R.L.',403.0000,20.0000,80.0000,'Negocio','La Rioja','Julio'),(29,'Gutierrez Alberto',458.0000,10.0000,90.0000,'Internet','Neuquén','Julio'),(30,'Mendoza S.R.L.',528.0000,35.0000,65.0000,'Internet','Mendoza','Julio'),(31,'El Guardián',47.0000,100.0000,NULL,'Negocio','Córdoba','Julio'),(32,'Los Trinos',52.1000,100.0000,NULL,'Internet','Paraguay','Julio'),(33,'INDIC S.R.L.',98.6000,100.0000,0.0000,'Negocio','Uruguay','Julio'),(34,'Amarcor S.A',200.0000,30.0000,70.0000,'Negocio','San Juan','Mayo'),(35,'Sanchez, Juan',58.0000,80.0000,20.0000,'Internet','Catamarca','Mayo'),(36,'La Lucila S.R.L.',243.0000,85.0000,15.0000,'Negocio','Catamarca','Mayo'),(37,'El Laberinto',83.2000,100.0000,0.0000,'Negocio','San Luis','Mayo'),(38,'La Conana',65.0000,50.0000,50.0000,'Internet','La Rioja','Mayo'),(39,'Sarmiento S.R.L.',326.0000,20.0000,80.0000,'Negocio','La Rioja','Mayo'),(40,'Gutierrez Alberto',112.5000,40.0000,60.0000,'Internet','Neuquén','Mayo'),(41,'Mendoza S.R.L.',89.0000,100.0000,0.0000,'Internet','Mendoza','Mayo'),(42,'El Guardián',116.0000,60.0000,40.0000,'Negocio','Córdoba','Mayo'),(43,'Los Trinos',285.0000,100.0000,0.0000,'Internet','Paraguay','Mayo'),(44,'INDIC S.R.L.',423.0000,50.0000,50.0000,'Negocio','Uruguay','Mayo'),(45,'Amarcor S.A.',342.0000,25.0000,75.0000,'Negocio','San Juan','Junio'),(46,'Sanchez, Juan',146.7900,30.0000,70.0000,'Internet','Catamarca','Junio'),(47,'La Lucila S.R.L.',134.0000,100.0000,0.0000,'Negocio','Catamarca','Junio'),(48,'El Laberinto',54.0000,100.0000,0.0000,'Negocio','San Luis','Junio'),(49,'La Conana',89.0000,50.0000,50.0000,'Internet','La Rioja','Junio'),(50,'Sarmiento S.R.L.',265.8000,40.0000,60.0000,'Negocio','La Rioja','Junio'),(51,'Gutierrez Alberto',113.5000,80.0000,20.0000,'Internet','Neuquén','Junio'),(52,'Mendoza S.R.L.',422.0000,40.0000,60.0000,'Internet','Mendoza','Junio'),(53,'El Guardián',69.0000,100.0000,0.0000,'Negocio','Córdoba','Junio'),(54,'Los Trinos',158.4000,70.0000,30.0000,'Internet','Paraguay','Junio'),(55,'INDIC S.R.L.',269.6000,50.0000,50.0000,'Negocio','Uruguay','Junio'),(56,'Amarcor S.A.',124.3000,100.0000,0.0000,'Negocio','San Juan','Julio'),(57,'Sanchez, Juan',235.0000,60.0000,40.0000,'Internet','Catamarca','Julio'),(58,'La Lucila S.R.L.',213.0000,70.0000,30.0000,'Negocio','Catamarca','Julio'),(59,'El Laberinto',366.0000,65.0000,35.0000,'Negocio','San Luis','Julio'),(60,'La Conana',125.0000,50.0000,50.0000,'Internet','La Rioja','Julio'),(61,'Sarmiento S.R.L.',403.0000,20.0000,80.0000,'Negocio','La Rioja','Julio'),(62,'Gutierrez Alberto',458.0000,10.0000,90.0000,'Internet','Neuquén','Julio'),(63,'Mendoza S.R.L.',528.0000,35.0000,65.0000,'Internet','Mendoza','Julio'),(64,'El Guardián',47.0000,100.0000,0.0000,'Negocio','Córdoba','Julio'),(65,'Los Trinos',52.1000,100.0000,0.0000,'Internet','Paraguay','Julio'),(66,'INDIC S.R.L.',98.6000,100.0000,0.0000,'Negocio','Uruguay','Julio'),(67,'ALgunaEmpesa',98.0000,100.0000,0.0000,'Local','Rioja','Agosto'),(68,'Otr',98.0000,12.0000,78.0000,'Local','Rioja','Septiembre'),(69,'Alguna',100.0000,20.0000,80.0000,'Local','Uruguay','Noviembre');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'planeamiento'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-25  3:20:18
