package com.recipe.persistence;

import com.recipe.entity.Recipe;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Dao.
     */
    RecipeDao dao;

    /**
     * Sets up the recipe table with fresh data and instantiates the dao.
     */
    @BeforeEach
    void setUp() {
        com.recipe.util.Database database = com.recipe.util.Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new RecipeDao();

    }

    /**
     * Verifies getById runs successfully.
     */
    @Test
    void getByIdSuccess() {
        Recipe retrievedRecipe = dao.getRecipeById(1);
        assertEquals("Eggplant Curry", retrievedRecipe.getRecipeTitle());
        logger.info("Recipe is successfully retrieved by id.");
    }

    /**
     * Save or update success.
     */
    @Test
    void saveOrUpdateSuccess() {
        String newTitle = "Brinjal";
        Recipe recipeToUpdate = dao.getRecipeById(1);
        recipeToUpdate.setRecipeTitle(newTitle);
        dao.saveOrUpdate(recipeToUpdate);
        Recipe retrievedRecipe = dao.getRecipeById(1);
        assertEquals(newTitle, retrievedRecipe.getRecipeTitle());
        logger.info("Recipe title was updated.");
    }

    /**
     * Verifies successfully Insert of recipes.
     */
    @Test
    void insertSuccessful() {
        Recipe newRecipe = new Recipe("Potato Fry", "Red potato, Olive oil, Salt, Red dried chillies", "Prep: 5 minutes Cook: 20 minutes Total: 25 minutes Ingredients: 5 medium size red potatoes, 1 Tbsp olive oil, salt to taste, 2 dried red chillies. Instructions: Cut the potato into bite-sized cubes. Heat oil in a large pot or pan, then add red chillies and cubed potatoes. Cook until potatoes are crisp and brown, 20 minutes.");
        int id = dao.insert(newRecipe);
        assertNotEquals(0,id);
        Recipe insertedRecipe = dao.getRecipeById(id);
        assertEquals("Potato Fry", insertedRecipe.getRecipeTitle());
        assertEquals("Red potato, Olive oil, Salt, Red dried chillies", insertedRecipe.getRecipeIngredients());
        assertEquals("Prep: 5 minutes Cook: 20 minutes Total: 25 minutes Ingredients: 5 medium size red potatoes, 1 Tbsp olive oil, salt to taste, 2 dried red chillies. Instructions: Cut the potato into bite-sized cubes. Heat oil in a large pot or pan, then add red chillies and cubed potatoes. Cook until potatoes are crisp and brown, 20 minutes.", insertedRecipe.getRecipeDescription());
    }

    /**
     * Verifies successful delete of recipes.
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getRecipeById(1));
        assertNull(dao.getRecipeById(1));
    }

    /**
     * Verifies getAll runs successfully.
     */
    @Test
    void getAllSuccess() {
        List<Recipe> recipes = dao.getAllrecipes();
        assertEquals(1, recipes.size());
    }
}


