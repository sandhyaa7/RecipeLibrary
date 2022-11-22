package com.recipe.persistence;

import com.recipe.entity.Recipe;
import com.recipe.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Recipe dao test.
 */
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
     * Verifies getAll runs successfully.
     */
    @Test
    void getAllRecipesSuccess() {
        List<Recipe> recipes = dao.getAllRecipes();
        assertEquals(5, recipes.size());
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
     * Verifies successfully Insert of recipes.
     */
    @Test
    void insertSuccess() {
        UserDao userDao = new UserDao();
        User user = userDao.getUserById(1);
        Recipe newRecipe = new Recipe("Carrot salad", "Donec eget elit cursus, vulputate dui at, consectetur eros. Sed finibus mollis lacus et viverra. Integer porta eget elit eu placerat. Phasellus a odio luctus, ultrices erat eget, tristique nunc. Cras ut urna id quam egestas fringilla. Maecenas sit amet", user);
        user.addRecipe(newRecipe);

        int id = dao.insert(newRecipe);

        assertNotEquals(0,id);
        Recipe insertedRecipe = dao.getRecipeById(id);
        assertEquals("Carrot salad", insertedRecipe.getRecipeTitle());
        assertNotNull(insertedRecipe.getUser());
        assertEquals("Sam", insertedRecipe.getUser().getFirstName());
    }

    /**
     * Save or update success.
     */
    @Test
    void saveOrUpdateSuccess() {
        String newTitle = "Brinjal";
        Recipe recipeToUpdate = dao.getRecipeById(3);
        recipeToUpdate.setRecipeTitle(newTitle);
        dao.saveOrUpdate(recipeToUpdate);
        Recipe retrievedRecipe = dao.getRecipeById(3);
        assertEquals(newTitle, retrievedRecipe.getRecipeTitle());
        logger.info("Recipe title was updated.");
    }

    /**
     * Verifies successful delete of recipes.
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getRecipeById(3));
        assertNull(dao.getRecipeById(3));
    }

    /**
     * Gets by property equal success.
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Recipe> recipes = dao.getByPropertyEqual("recipeTitle", "Potato Salad");
        assertEquals(1, recipes.size());
        assertEquals(2, recipes.get(0).getId());
    }

    /**
     * Gets by property like success.
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Recipe> recipes = dao.getByPropertyLike("recipeTitle", "p");
        assertEquals(3, recipes.size());
    }


}


