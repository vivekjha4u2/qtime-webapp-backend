-- MySQL dump 10.13  Distrib 5.7.17, for Win32 (AMD64)
--
-- Host: localhost    Database: quarantine_db
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
  `url` longtext,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'Make a Confession to me??','F',NULL),(2,'How many people have I kissed?','M',NULL),(3,'Propose me!!!!','F',NULL),(4,'First thing you notice in me when you meet me first??','F',NULL),(5,'What was the last thing you searched for on your phone?','M',NULL),(6,'Have you ever practiced kissing in a mirror?','M',NULL),(7,'Tell me the name of your BF/GF.','F',NULL),(8,'One Word that describes me?','F',NULL),(9,'What you dislike about me?','F',NULL),(10,'What was your most embarrassing moment in public?','M',NULL),(11,'Who is your secret crush?','M',NULL),(12,'A nickname that you have given to me?','F',NULL),(13,'Do you think you\'ll marry your current girlfriend/boyfriend?','M',NULL),(14,'Have you ever tasted ear wax?','M',NULL),(15,'Which dress colour suits me the most?','F',NULL),(16,'Relation status you want to be with me?','F',NULL),(17,'Who in this room would be the worst person to date? Why?','M',NULL),(18,'Have you ever caught me checking someone out?','M',NULL),(19,'Rate my look from 1 to 10','F',NULL),(20,'What qualities do I search for my life partner?','F',NULL),(21,'Describe the strangest dream i ever had?','M',NULL),(22,'Tell us about a time I embarrassed myself in front of a crush?','M',NULL),(23,'Tell us about a time I embarrassed myself in front of a crush?','F',NULL),(24,'Do i have any silly nicknames?','F',NULL),(25,'Do i have any silly nicknames?','M',NULL),(26,'Have I ever watched a movie which i shouldn’t?Name it.','M',NULL),(27,'Have I ever watched a movie which i shouldn’t?Name it.','F',NULL),(28,'What app on my phone do i waste the most time on?','M',NULL),(29,'What app on my phone do i waste the most time on?','F',NULL),(30,'Have i ever pretended to be sick to get out of something? If so, what was it?','M',NULL),(31,'Have i ever pretended to be sick to get out of something? If so, what was it?','F',NULL),(32,'Which drink I like the most?','M',NULL),(33,'Which drink I like the most?','F',NULL),(34,'How many selfies do i take a day?','F',NULL),(35,'If i were home by alone all day, what would I do?','M',NULL),(36,'Have I ever eaten something off the floor?','F',NULL),(37,'Have I ever eaten something off the floor?','M',NULL),(38,'Have I ever butt-dialed someone?','F',NULL),(39,'What is something that no one else knows about you?','M',NULL),(40,'What is something that no one else knows about you?','F',NULL),(41,'Have i ever had a crush on a friend’s boyfriend/girlfriend?','M',NULL),(42,'Have i ever asked someone out?','F',NULL),(43,'Have i ever asked someone out?','M',NULL),(44,'Has a crush ever found out i liked them and turned me down?','M',NULL),(45,'If i could marry any celebrity, who would it be?','F',NULL),(46,'Have you ever been stood up on a date?','M',NULL),(47,'Who am i jealous of?','F',NULL),(48,'My name of your phone?','M',NULL),(49,'My name of your phone?','F',NULL),(50,'Things you like most about my personality?','M',NULL),(51,'Things you like most about my personality?','F',NULL),(52,'Which dress colour suits me the most?','F',NULL),(53,'What do you like the most in me?','F',NULL),(54,'What do you like the most in me?','M',NULL),(55,'The behavior that you hate about my attitude?','M',NULL),(56,'The behavior that you hate about my attitude?','F',NULL),(57,'Dedicate me a song..','M',NULL),(58,'Dedicate me a song..','F',NULL),(59,'Which is my favourite icecream?','F',NULL),(60,'Which is my favourite icecream?','M',NULL),(61,'Which life is better according to me ?Single commited or married.','M',NULL),(62,'Which life is better according to me ?Single commited or married.','F',NULL),(63,'My favourite movie genre?Romantic,Action,comedy or horror.','F',NULL),(64,'My favourite movie genre?Romantic,Action,comedy or horror.','M',NULL),(65,'Which app on my phone i use the most?','M',NULL),(66,'Which app on my phone i use the most?','F',NULL),(67,'Have i ever lied about being sick so i could stay home from work or school?','M',NULL),(68,'Have i ever lied about being sick so i could stay home from work or school?','F',NULL),(69,'What is one thing/activity that makes me relax?like dance,listening music','M',NULL),(70,'What is one thing/activity that makes me relax?like dance,listening music','F',NULL),(71,'With whom i would like to go on vacation with? Friends or family.','M',NULL),(72,'With whom i would like to go on vacation with? Friends or family.','F',NULL),(73,'Do i prefer cats, dogs, or neither?','M',NULL),(74,'Do i prefer cats, dogs, or neither?','F',NULL),(75,'What season is my favorite?','F',NULL),(76,'Do i have rings in my hand?','F',NULL),(77,'Which of these describe your character? Serious, friendly,funny,kind.','M',NULL),(78,'Which of these describe your character? Serious, friendly,funny,kind.','F',NULL),(79,'Do i prefer the beach or the mountains?','M',NULL),(80,'Do i prefer the beach or the mountains?','F',NULL),(81,'Who knows all my secrets?','M',NULL),(82,'Who knows all my secrets?','F',NULL),(83,'Which type of shopping do i like?','F',NULL),(84,'Tell my deepest secret.','F',NULL),(85,' First impression when you saw me first.','M',NULL),(86,' First impression when you saw me first.','F',NULL),(87,'Can I share your answer on my WhatsApp story?','M',NULL),(88,'Can I share your answer on my WhatsApp story?','F',NULL),(89,'Who am I to you?','M',NULL),(90,'Who am I to you?','F',NULL);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quiz_ques`
--

DROP TABLE IF EXISTS `quiz_ques`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quiz_ques` (
  `qid` bigint(10) NOT NULL AUTO_INCREMENT,
  `quiz_id` varchar(45) DEFAULT NULL,
  `question` longtext,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quiz_ques`
--

LOCK TABLES `quiz_ques` WRITE;
/*!40000 ALTER TABLE `quiz_ques` DISABLE KEYS */;
INSERT INTO `quiz_ques` VALUES (1,'Q-22748','Tell Me Two Negative Points About Me That You Hate The Most.'),(2,'Q-22748','The thing you don’t like in me'),(3,'Q-22748','Dedicate a song to our relationship?'),(4,'Q-22748','what do i do when i am bored'),(5,'Q-22748','Say a cheesy sentence to me'),(6,'Q-22748','Dedicate a song for our relationship?'),(7,'Q-22748','What do you think of me as a person?'),(8,'Q-22748','What Kind of Relationship do you expect from me?'),(9,'Q-22748','what d u hink of me as a person'),(10,'Q-22748','what is ur favourite colour'),(11,'Q-14602','? Flirt me!!?'),(12,'Q-14602','What do you like in me?'),(13,'Q-14602','Guess my relationship status'),(14,'Q-14602','? Flirt me!!?'),(15,'Q-14602','Tell Me Two Negative Points About Me That You Hate The Most.'),(16,'Q-14602','Dedicate a song to our relationship?'),(17,'Q-14602','? Flirt me!!?'),(18,'Q-14602','The thing you like most about my character?'),(19,'Q-14602','What do you like in me?'),(20,'Q-14602','What Kind of Relationship do you expect from me?'),(21,'Q-14602','What Kind of Relationship do you expect from me?'),(22,'Q-14602','Dedicate a song to our relationship?'),(23,'Q-14602','Tell Me Two Negative Points About Me That You Hate The Most.'),(24,'Q-14602','Guess my relationship status'),(25,'Q-14602','The thing you like most about my character?'),(26,'Q-14602','The thing you like most about my character?'),(27,'Q-14602','What Kind of Relationship do you expect from me?'),(28,'Q-14602','? Flirt me!!?'),(29,'Q-14602','The thing you like most about my character?'),(30,'Q-14602','What Kind of Relationship do you expect from me?'),(31,'Q-19682','Guess my relationship status'),(32,'Q-19682','what is my favourite dish'),(33,'Q-19682','what d u hink of me as a person'),(34,'Q-19682','what do i do when i am bored'),(35,'Q-19682','? Flirt me!!?'),(36,'Q-19682','Dedicate a song to our relationship?'),(37,'Q-19682','The thing you don’t like in me'),(38,'Q-19682','What do you like in me?'),(39,'Q-19682','what d u hink of me as a person'),(40,'Q-19682','Say a cheesy sentence to me'),(41,'Q-19682','Guess my relationship status'),(42,'Q-19682','what do i do when i am bored'),(43,'Q-19682','what d u hink of me as a person'),(44,'Q-19682','what is my favourite dish'),(45,'Q-19682','? Flirt me!!?'),(46,'Q-19682','Dedicate a song to our relationship?'),(47,'Q-19682','Say a cheesy sentence to me'),(48,'Q-19682','The thing you don’t like in me'),(49,'Q-19682','What do you like in me?'),(50,'Q-19682','what d u hink of me as a person');
/*!40000 ALTER TABLE `quiz_ques` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quiz_reply`
--

DROP TABLE IF EXISTS `quiz_reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quiz_reply` (
  `rid` bigint(20) NOT NULL AUTO_INCREMENT,
  `quiz_id` varchar(45) NOT NULL,
  `question` longtext,
  `answer` longtext,
  `p_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quiz_reply`
--

LOCK TABLES `quiz_reply` WRITE;
/*!40000 ALTER TABLE `quiz_reply` DISABLE KEYS */;
INSERT INTO `quiz_reply` VALUES (1,'Q-28340','flirt me','i like you','shweta'),(2,'Q-28340','flirt me','i like you','dd'),(3,'Q-28340','flirt me','i like you','fgfg');
/*!40000 ALTER TABLE `quiz_reply` ENABLE KEYS */;
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
INSERT INTO `user` VALUES ('Q-10087','ss','f'),('Q-10643','jxjx','m'),('Q-11374','n','f'),('Q-11446','bopl','m'),('Q-11473','dsa','m'),('Q-11577','sasd','m'),('Q-11861','pp','f'),('Q-12513','qqqq','m'),('Q-12521','ssa','f'),('Q-12815','ccxc','f'),('Q-12875','eea','m'),('Q-12984','ccxxzz','f'),('Q-13030','njkn','m'),('Q-13047','ccccc','m'),('Q-13698','mmmmm','m'),('Q-14006','hnhs','m'),('Q-14602','shweta','f'),('Q-15228','hily','m'),('Q-15497','hjdj','m'),('Q-16015','fffff','f'),('Q-16253','ll','f'),('Q-16274','hvmmm','f'),('Q-16287','dsc','m'),('Q-16570','hsbv','m'),('Q-16604','eeeeeeeeeee','m'),('Q-16736','sasd','f'),('Q-17094','lll','m'),('Q-17262','xnbc','m'),('Q-17334','dfsds','m'),('Q-17549','hc','m'),('Q-17633','jbndjs','f'),('Q-17656','dssd','m'),('Q-17676','cnjd','m'),('Q-17833','djb','f'),('Q-17914','ckjb','f'),('Q-18115','  bbbb','m'),('Q-18627','nippy','m'),('Q-19152','shweta','F'),('Q-19182','hhjjjkk','f'),('Q-19682','amisha','f'),('Q-19707','vvc','f'),('Q-19816','ssssss','\0'),('Q-20049','cnnc','f'),('Q-20329','shweta','F'),('Q-20902','dcf','f'),('Q-20954','mm','\0'),('Q-21220','bholu','m'),('Q-21340','sas','m'),('Q-21399','hhh','m'),('Q-21980','sdb','f'),('Q-22022','ssssss','f'),('Q-22071','ddd','m'),('Q-22357','jasdsa','\0'),('Q-22381','vivek','M'),('Q-22559','jdkash','M'),('Q-22587','jfj','m'),('Q-22748','shweta','f'),('Q-22810','vv','f'),('Q-23291','saassssss','m'),('Q-23349','uu','f'),('Q-23411','a','f'),('Q-23744','xs','f'),('Q-23922','hilop','m'),('Q-23925','bbn','f'),('Q-24343','ds','\0'),('Q-24389','asAZ','m'),('Q-24771','eeeww','m'),('Q-24972','nn','f'),('Q-25507','ddddd','m'),('Q-25573','qq','m'),('Q-25859','jsb','m'),('Q-25993','jkhdj','m'),('Q-26016','dfb','m'),('Q-26082','Bomp','m'),('Q-26301','saaaaa','m'),('Q-26482','molia','m'),('Q-27053','djbvdvdv','m'),('Q-27104','vv','\0'),('Q-27321','jfb','f'),('Q-27527','cxzz','m'),('Q-27760','ccx','m'),('Q-28162','sdd','m'),('Q-28270','an ','m'),('Q-28340','cxxcsss','f'),('Q-28661','sfdds','m'),('Q-28880','jbjb','m'),('Q-29425','asknck','m'),('Q-29916','zz','m'),('Q-29968','dbjsbcnxxc','m');
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

-- Dump completed on 2020-06-24 14:48:42
