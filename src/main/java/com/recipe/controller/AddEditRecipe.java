package com.recipe.controller;


import com.recipe.entity.Recipe;
import com.recipe.persistence.RecipeDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Add or edit the recipe
 *
 * @author pwaite
 */
@WebServlet(
        urlPatterns = {"/addEditRecipe"}
)

public class AddEditRecipe  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RecipeDao recipeDao = new RecipeDao();

        if (req.getParameter("id").equals("")) {
            Recipe recipe = new Recipe(req.getParameter("recipeTitle"), req.getParameter("recipeDescription"));
            recipeDao.insert(recipe);
        } else {
            Recipe recipe = new Recipe(req.getParameter("recipeTitle"), req.getParameter("recipeDescription"));
            recipeDao.saveOrUpdate(recipe);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("searchRecipe?searchTerm=&submit=viewAll");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RecipeDao recipeDao = new RecipeDao();
        req.setAttribute("recipeDao", recipeDao.getRecipeById(Integer.parseInt(req.getParameter("id"))));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/addEditRecipe.jsp");
        dispatcher.forward(req, resp);
    }
}

    

