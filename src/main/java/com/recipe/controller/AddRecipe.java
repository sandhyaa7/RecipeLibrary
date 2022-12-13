package com.recipe.controller;


import com.recipe.entity.Recipe;

import com.recipe.entity.User;
import com.recipe.persistence.RecipeDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
;

import java.io.IOException;

/**
 * Add the recipe
 *
 * @author ssharma
 */
@WebServlet(
        urlPatterns = {"/addRecipe"}
)

public class AddRecipe extends HttpServlet {


    private final Logger logger = LogManager.getLogger(this.getClass());



    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RecipeDao recipeDao = new RecipeDao();

        String recipeTitle = req.getParameter("recipeTitle");
        String recipeDescription = req.getParameter("recipeDescription");

        Recipe recipe = new Recipe(recipeTitle, recipeDescription);
        recipeDao.insert(recipe);

        String url = "index.jsp";
        resp.sendRedirect(url);
    }

}

    

