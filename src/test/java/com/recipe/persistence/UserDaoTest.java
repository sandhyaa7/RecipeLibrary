package com.recipe.persistence;

import com.recipe.entity.Recipe;
import com.recipe.entity.User;
import com.recipe.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {
    /**
     * The Dao.
     */
    UserDao dao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        dao = new UserDao();

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies gets all users successully.
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAllUsers();
        assertEquals(6, users.size());
    }

    /**
     * Verifies the gets users by first name successfully.
     */
    @Test
    void getUserByFirstNameSuccess() {
        List<User> users = dao.getUserByFirstName("s");
        assertEquals(1, users.size());
    }


    /**
     * Gets users by id successfully.
     */
    @Test
    void getUserByIdSuccess() {
        User retrievedUser = dao.getUserById(4);
        assertNotNull(retrievedUser);
        assertEquals("Ray", retrievedUser.getFirstName());
    }

    /**
     * Verify successful insert of a user
     */
    @Test
    void insertSuccess() {

        User newUser = new User("Fred", "Flintstone", "fflintstone", "apple");
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = dao.getUserById(id);

        assertEquals("Fred", insertedUser.getFirstName());

    }

    /**
     * Insert with recipe success.
     */
    @Test
    void insertWithRecipeSuccess() {
        User newUser = new User("Fred", "Flintstone", "fflintstone", "apple");

        String recipeTitle = "Potato Fry";
        String recipeDescription = "Prep: 5 minutes Cook: 20 minutes Total: 25 minutes Ingredients: 5 medium size red potatoes, 1 Tbsp olive oil, salt to taste, 2 dried red chillies. Instructions: Cut the potato into bite-sized cubes. Heat oil in a large pot or pan, then add red chillies and cubed potatoes. Cook until potatoes are crisp and brown, 20 minutes.";

        Recipe recipe = new Recipe(recipeTitle, recipeDescription, newUser);
        newUser.addRecipe(recipe);
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = dao.getUserById(id);
        assertEquals("Fred", insertedUser.getFirstName());
        assertEquals(1, insertedUser.getRecipes().size());

    }

    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getUserById(3));
        assertNull(dao.getUserById(3));
    }

    /**
     * Verify successful update of user.
     */
    @Test
    void updateSuccess() {
        String newLastName = "Davis";
        User userToUpdate = dao.getUserById(3);
        userToUpdate.setLastName(newLastName);
        dao.saveOrUpdate(userToUpdate);
        User retrievedUser = dao.getUserById(3);
        assertEquals(newLastName, retrievedUser.getLastName());
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = dao.getByPropertyEqual("lastName", "Murphy");
        assertEquals(1, users.size());
        assertEquals(2, users.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = dao.getByPropertyLike("lastName", "w");
        assertEquals(3, users.size());
    }

}