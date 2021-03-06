-- MySQL dump 10.13  Distrib 8.0.28, for macos11 (x86_64)
--
-- Host: 127.0.0.1    Database: movies
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `Films`
--

DROP TABLE IF EXISTS `Films`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Films` (
  `title` varchar(100) DEFAULT NULL,
  `rating` double DEFAULT NULL,
  `id` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Films`
--

LOCK TABLES `Films` WRITE;
/*!40000 ALTER TABLE `Films` DISABLE KEYS */;
INSERT INTO `Films` VALUES ('The Shawshank Redemption',1,'tt0111161'),('The Godfather',2,'tt0068646'),('The Godfather: Part II',3,'tt0071562'),('Pulp Fiction',4,'tt0110912'),('\"The Good, the Bad and the Ugly\"',5,'tt0060196'),('The Dark Knight',6,'tt0468569'),('12 Angry Men',7,'tt0050083'),('Schindlers List',8,'tt0108052'),('The Lord of the Rings: The Return of the King',9,'tt0167260'),('Fight Club',10,'tt0137523'),('Star Wars: Episode V - The Empire Strikes Back',11,'tt0080684'),('The Lord of the Rings: The Fellowship of the Ring',12,'tt0120737'),('One Flew Over the Cuckoos Nest',13,'tt0073486'),('Inception',14,'tt1375666'),('Goodfellas',15,'tt0099685'),('Star Wars',16,'tt0076759'),('Seven Samurai',17,'tt0047478'),('Forrest Gump',18,'tt0109830'),('The Matrix',19,'tt0133093'),('The Lord of the Rings: The Two Towers',20,'tt0167261'),('City of God',21,'tt0317248'),('Se7en',22,'tt0114369'),('The Silence of the Lambs',23,'tt0102926'),('Once Upon a Time in the West',24,'tt0064116'),('Casablanca',25,'tt0034583'),('The Usual Suspects',26,'tt0114814'),('Raiders of the Lost Ark',27,'tt0082971'),('Rear Window',28,'tt0047396'),('Its a Wonderful Life',29,'tt0038650'),('Psycho',30,'tt0054215'),('L??on: The Professional',31,'tt0110413'),('Sunset Blvd.',32,'tt0043014'),('American History X',33,'tt0120586'),('Apocalypse Now',34,'tt0078788'),('Terminator 2: Judgment Day',35,'tt0103064'),('Saving Private Ryan',36,'tt0120815'),('Memento',37,'tt0209144'),('City Lights',38,'tt0021749'),('Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb',39,'tt0057012'),('Alien',40,'tt0078748'),('Modern Times',41,'tt0027977'),('Spirited Away',42,'tt0245429'),('North by Northwest',43,'tt0053125'),('Back to the Future',44,'tt0088763'),('Life Is Beautiful',45,'tt0118799'),('The Shining',46,'tt0081505'),('The Pianist',47,'tt0253474'),('Citizen Kane',48,'tt0033467'),('The Departed',49,'tt0407887'),('M',50,'tt0022100'),('Paths of Glory',51,'tt0050825'),('Vertigo',52,'tt0052357'),('Django Unchained',53,'tt1853728'),('Double Indemnity',54,'tt0036775'),('The Dark Knight Rises',55,'tt1345836'),('Aliens',56,'tt0090605'),('Taxi Driver',57,'tt0075314'),('American Beauty',58,'tt0169547'),('The Green Mile',59,'tt0120689'),('Gladiator',60,'tt0172495'),('The Intouchables',61,'tt1675434'),('WALL??E',62,'tt0910970'),('The Lives of Others',63,'tt0405094'),('Toy Story 3',64,'tt0435761'),('The Great Dictator',65,'tt0032553'),('The Prestige',66,'tt0482571'),('A Clockwork Orange',67,'tt0066921'),('Lawrence of Arabia',68,'tt0056172'),('Am??lie',69,'tt0211915'),('To Kill a Mockingbird',70,'tt0056592'),('Reservoir Dogs',71,'tt0105236'),('Das Boot',72,'tt0082096'),('The Lion King',73,'tt0110357'),('Cinema Paradiso',74,'tt0095765'),('Star Wars: Episode VI - Return of the Jedi',75,'tt0086190'),('The Treasure of the Sierra Madre',76,'tt0040897'),('The Third Man',77,'tt0041959'),('Once Upon a Time in America',78,'tt0087843'),('Requiem for a Dream',79,'tt0180093'),('Eternal Sunshine of the Spotless Mind',80,'tt0338013'),('Full Metal Jacket',81,'tt0093058'),('Oldboy',82,'tt0364569'),('Braveheart',83,'tt0112573'),('L.A. Confidential',84,'tt0119488'),('Bicycle Thieves',85,'tt0040522'),('Chinatown',86,'tt0071315'),('Singin in the Rain',87,'tt0045152'),('Princess Mononoke',88,'tt0119698'),('Monty Python and the Holy Grail',89,'tt0071853'),('Metropolis',90,'tt0017136'),('Rashomon',91,'tt0042876'),('Some Like It Hot',92,'tt0053291'),('Amadeus',93,'tt0086879'),('2001: A Space Odyssey',94,'tt0062622'),('All About Eve',95,'tt0042192'),('Witness for the Prosecution',96,'tt0051201'),('The Sting',97,'tt0070735'),('The Apartment',98,'tt0053604'),('Grave of the Fireflies',99,'tt0095327'),('Indiana Jones and the Last Crusade',100,'tt0097576');
/*!40000 ALTER TABLE `Films` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-23 16:13:16
