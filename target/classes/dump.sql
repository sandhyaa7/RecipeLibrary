DROP TABLE IF EXISTS `recipe`;

CREATE TABLE `Recipe` (
    `id` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `recipeTitle` VARCHAR(25) DEFAULT NULL,
    `recipeIngredients` VARCHAR(500) DEFAULT NULL,
    `recipeDescription` LONG VARCHAR DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `recipe` WRITE;
INSERT INTO `recipe` VALUES (1, 'Eggplant Curry', 'Eggplant, Turmeric powder, Salt, Coriander powder, Cumin powder, Olive oil, Cilantro', 'Prep: 10 minutes Cook: 30 minutes Total: 40 minutes Ingredients: 2 eggplant, 1 Tbsp olive oil, 1 tsp each turmeric, cumin and coriander powder, salt to taste, cilantro to serve. Instructions: Cut the eggplant into bite-sized cubes. Heat oil in a large pot or pan, then add cubed eggplant. Cook until eggplant begins to brown and become soft, about 5 minutes. Stir in cumin, coriander, turmeric, and salt to evenly coat the eggplant and cook for another 2 minutes. Bring to a gentle simmer, cover, and let cook for 15 minutes. Serve warm over rice, topped with fresh cilantro.');
UNLOCK TABLES;
