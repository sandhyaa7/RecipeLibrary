package com.recipe.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Recipe.
 */
@Entity(name = "Recipe")
@Table(name = "recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;
    private String recipeTitle;
    private String recipeDescription;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;


    /**
     * Instantiates a new Recipe.
     */
    public Recipe() {
    }

    /**
     * Instantiates a new Recipe.
     *
     * @param recipeTitle       the recipe title
     * @param recipeDescription the recipe description
     * @param user              the user
     */
    public Recipe(String recipeTitle, String recipeDescription, User user) {
        this.recipeTitle = recipeTitle;
        this.recipeDescription = recipeDescription;
        this.user = user;
    }

    public Recipe(String recipeTitle, String recipeDescription) {
        this.recipeTitle = recipeTitle;
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
        this.id = id;
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

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeTitle='" + recipeTitle + '\'' +
                ", recipeDescription='" + recipeDescription + '\'' +
                ", user=" + user +
                '}';
    }

}
