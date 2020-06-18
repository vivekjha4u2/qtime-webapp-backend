CREATE DATABASE  IF NOT EXISTS `quarantine_db` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `quarantine_db`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: quarantine_db
-- ------------------------------------------------------
-- Server version	5.7.28-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `question` (
  `qid` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(200) NOT NULL,
  `category` char(1) NOT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'What do you think of me as a person?','F'),(2,'what is ur favourite colour','F'),(3,'what game i like to play','M'),(4,'what series i like the most','M'),(5,'what is my favourite dish','F'),(6,'who is my first crush','F'),(7,'Guess my relationship status','F'),(8,'what d u hink of me as a person','F'),(9,'What Kind of Relationship do you expect from me?','F'),(10,'What do you like in me?','F'),(11,'The thing you don’t like in me','F'),(12,'Describe me in one word.','F'),(13,'What is your opinion on me?','M'),(14,'What is my wildest dream?','M'),(15,'Give me a nickname that you want?','F'),(16,'My contact name saved on your phone?','M'),(17,'The thing you like most about my character?','F'),(18,'Dedicate a song for our relationship?','F'),(19,'? Flirt me!!?','F'),(20,'Tell Me Two Negative Points About Me That You Hate The Most.','F'),(21,'which abusive word i use the most','M'),(22,'Say a cheesy sentence to me','F'),(23,'What do you want me to do to you the next time we meet?','M'),(24,'What is the most embarrassing thing you’ve ever done?','M'),(25,'Dedicate a song to our relationship?','F'),(26,'During which month is my birthday?','M'),(27,'what is my favourite sport?','F'),(28,'what is my favourite sport?','M'),(29,'During which month is my birthday?','F'),(30,'When shweta is bored, what does she do?','M'),(31,'What type of movies do i like like?','M'),(32,'what do i do when i am bored','F'),(33,'what s my favourite snack?','M'),(34,'what s my favourite snack?','F'),(35,'what type of part do i like?','F'),(36,'How do you prefer to communicate?','M'),(37,'How do you prefer to communicate?','M');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quiz`
--

DROP TABLE IF EXISTS `quiz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quiz` (
  `quiz_id` varchar(45) NOT NULL,
  `userid` bigint(20) NOT NULL,
  `question` longtext,
  `answer` longtext,
  `p_name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quiz`
--

LOCK TABLES `quiz` WRITE;
/*!40000 ALTER TABLE `quiz` DISABLE KEYS */;
/*!40000 ALTER TABLE `quiz` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quiz_ques`
--

DROP TABLE IF EXISTS `quiz_ques`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quiz_ques` (
  `quiz_id` varchar(10) NOT NULL,
  `question` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quiz_ques`
--

LOCK TABLES `quiz_ques` WRITE;
/*!40000 ALTER TABLE `quiz_ques` DISABLE KEYS */;
INSERT INTO `quiz_ques` VALUES ('Q-28340','Dedicate a song to our relationship?'),('Q-28340','Give me a nickname that you want?'),('Q-28340','Give me a nickname that you want?'),('Q-28340','Give me a nickname that you want?'),('Q-28340','Give me a nickname that you want?'),('Q-28340','Give me a nickname that you want?'),('Q-28340','Give me a nickname that you want?'),('Q-28340','what type of part do i like?'),('Q-28340','Give me a nickname that you want?'),('Q-28340','Give me a nickname that you want?');
/*!40000 ALTER TABLE `quiz_ques` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `quiz_id` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `gender` char(1) NOT NULL,
  PRIMARY KEY (`quiz_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('Q-13698','mmmmm','m'),('Q-15228','hily','m'),('Q-15497','hjdj','m'),('Q-16015','fffff','f'),('Q-16274','hvmmm','f'),('Q-16570','hsbv','m'),('Q-17262','xnbc','m'),('Q-17334','dfsds','m'),('Q-17633','jbndjs','f'),('Q-17833','djb','f'),('Q-17914','ckjb','f'),('Q-18627','nippy','m'),('Q-19152','shweta','F'),('Q-20329','shweta','F'),('Q-20902','dcf','f'),('Q-21220','bholu','m'),('Q-21980','sdb','f'),('Q-22071','ddd','m'),('Q-22381','vivek','M'),('Q-22559','jdkash','M'),('Q-23922','hilop','m'),('Q-24343','ds','\0'),('Q-24771','eeeww','m'),('Q-25859','jsb','m'),('Q-25993','jkhdj','m'),('Q-26016','dfb','m'),('Q-26082','Bomp','m'),('Q-26482','molia','m'),('Q-27053','djbvdvdv','m'),('Q-27321','jfb','f'),('Q-28162','sdd','m'),('Q-28340','cxxcsss','f'),('Q-29968','dbjsbcnxxc','m');
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

-- Dump completed on 2020-06-19  1:10:09
