package com.recipe.controller;

import com.recipe.persistence.RecipeDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * The type Search recipe.
 */
public class SearchRecipe {
    /**
     * The type Search user.
     */
    @WebServlet(
            urlPatterns = {"/searchRecipe"}
    )

    public class SearchUser extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            RecipeDao recipeDao = new RecipeDao();
            if (req.getParameter("submit").equals("search")) {
                req.setAttribute("users", recipeDao.getRecipeByTitle(req.getParameter("searchTerm")));
            } else {
                req.setAttribute("users", recipeDao.getAllrecipes());
            }

            RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
