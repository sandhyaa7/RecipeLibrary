package com.recipe.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Recipe.
 */
@Entity(name = "Recipe")
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;
    private String recipeTitle;
    private String recipeIngredients;
    private String recipeDescription;

    /**
     * Instantiates a new Recipe.
     */
    public Recipe() {
    }

    /**
     * Instantiates a new Recipe.
     *
     * @param recipeTitle       the recipe title
     * @param recipeIngredients the recipe ingredients
     * @param recipeDescription the recipe description
     */
    public Recipe(String recipeTitle, String recipeIngredients, String recipeDescription) {
        this.recipeTitle = recipeTitle;
        this.recipeIngredients = recipeIngredients;
        this.recipeDescription = recipeDescription;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        id = id;
    }

    /**
     * Gets recipe title.
     *
     * @return the recipe title
     */
    public String getRecipeTitle() {
        return recipeTitle;
    }

    /**
     * Sets recipe title.
     *
     * @param recipeTitle the recipe title
     */
    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    /**
     * Gets recipe ingredients.
     *
     * @return the recipe ingredients
     */
    public String getRecipeIngredients() {
        return recipeIngredients;
    }

    /**
     * Sets recipe ingredients.
     *
     * @param recipeIngredients the recipe ingredients
     */
    public void setRecipeIngredients(String recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    /**
     * Gets recipe description.
     *
     * @return the recipe description
     */
    public String getRecipeDescription() {
        return recipeDescription;
    }

    /**
     * Sets recipe description.
     *
     * @param recipeDescription the recipe description
     */
    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeTitle='" + recipeTitle + '\'' +
                ", recipeIngredients='" + recipeIngredients + '\'' +
                ", recipeDescription='" + recipeDescription + '\'' +
                '}';
    }
}
