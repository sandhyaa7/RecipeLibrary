package com.recipe.persistence;

import com.recipe.entity.Recipe;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The type Recipe dao.
 */
public class RecipeDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets allrecipes.
     *
     * @return the allrecipes
     */
    public List<Recipe> getAllRecipes() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Recipe> query = builder.createQuery(Recipe.class);
        Root<Recipe> root = query.from(Recipe.class);
        List<Recipe> recipes = session.createQuery(query).getResultList();
        session.close();
        return recipes;
    }


    /**
     * Gets recipe by title.
     *
     * @param recipeTitle the recipe title
     * @return the recipe by title
     */
    public List<Recipe> getRecipeByTitle(String recipeTitle) {
        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Recipe> query = builder.createQuery(Recipe.class);
        Root<Recipe> root = query.from(Recipe.class);
        Expression<String> propertyPath = root.get("recipeTitle");
        query.where(builder.like(propertyPath, "%" + recipeTitle + "%"));
        List<Recipe> recipes = session.createQuery(query).getResultList();
        session.close();
        return recipes;
    }

    /**
     * Get recipe by id recipe.
     *
     * @param id the id
     * @return the recipe by id
     */
    public Recipe getRecipeById(int id){
        Session session = sessionFactory.openSession();
        Recipe recipe = session.get(Recipe.class, id);
        session.close();
        return recipe;

    }

    /**
     * Save or update.
     *
     * @param recipe the recipe to be saved or updated
     */
    public void saveOrUpdate(Recipe recipe) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(recipe);
        transaction.commit();
        session.close();
    }

    /**
     * Insert int.
     *
     * @param recipe the recipe to be inserted
     * @return the int
     */
    public int insert(Recipe recipe) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(recipe);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a recipe
     *
     * @param recipe the recipe
     */
    public void delete(Recipe recipe) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(recipe);
        transaction.commit();
        session.close();
    }

    /**
     * Gets by property equal.
     *
     * @param propertyName the property name
     * @param value        the value
     * @return the by property equal
     */
    public List<Recipe> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for recipe with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Recipe> query = builder.createQuery( Recipe.class );
        Root<Recipe> root = query.from( Recipe.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Recipe> recipes = session.createQuery( query ).getResultList();

        session.close();
        return recipes;
    }

    /**
     * Gets by property like.
     *
     * @param propertyName the property name
     * @param value        the value
     * @return the by property like
     */
    public List<Recipe> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for recipe with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Recipe> query = builder.createQuery( Recipe.class );
        Root<Recipe> root = query.from( Recipe.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<Recipe> recipes = session.createQuery( query ).getResultList();
        session.close();
        return recipes;
    }
}
