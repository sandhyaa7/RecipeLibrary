DROP TABLE IF EXISTS `recipes`;

CREATE TABLE `Recipes` (
    `id` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `recipeTitle` VARCHAR(25) DEFAULT NULL,
    `recipeIngredients` VARCHAR(500) DEFAULT NULL,
    `recipeDescription` LONG VARCHAR DEFAULT NULL

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `recipes` WRITE;
INSERT INTO `recipes` VALUES (1, 'Eggplant Curry', 'Eggplant, Turmeric powder, Salt, Coriander powder, Cumin powder, Olive oil, Cilantro', 'Prep: 10 minutes Cook: 30 minutes Total: 40 minutes Ingredients: 2 eggplant, 1 Tbsp olive oil, 1 tsp each turmeric, cumin and coriander powder, salt to taste, cilantro to serve. Instructions: Cut the eggplant into bite-sized cubes. Heat oil in a large pot or pan, then add cubed eggplant. Cook until eggplant begins to brown and become soft, about 5 minutes. Stir in cumin, coriander, turmeric, and salt to evenly coat the eggplant and cook for another 2 minutes. Bring to a gentle simmer, cover, and let cook for 15 minutes. Serve warm over rice, topped with fresh cilantro.');
UNLOCK TABLES;

Create table `user` (
    userId int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(20) DEFAULT NULL,
    lastName VARCHAR(30) DEFAULT NULL,
    userName VARCHAR(20) DEFAULT NULL,
    password VARCHAR(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `user` WRITE;
INSERT INTO 'user' VALUES (1,'Sam', 'Windt', 'sWindt', 'pepper'),(2,'Will', 'Murphy', 'wMurphy', 'bell'),(3,'Will', 'Murry', 'wMurry', 'pop'), (4, 'Ray', 'Thompson', 'rThompson', 'sole'),(5, 'Windy', 'West', 'wWest', 'snow'),(6, 'Reah', 'Edwards', 'rEdwards', 'key');
UNLOCK TABLES;