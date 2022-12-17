package com.recipe.persistence;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.recipe.rapidApi.Recipe;
import com.recipe.rapidApi.Recipes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestServiceClient {
    @Test
    public void testapiJSON() throws Exception {
        HttpResponse<String> response = Unirest.get("https://edamam-recipe-search.p.rapidapi.com/search?q=lemon")
                .header("X-RapidAPI-Key", "5ebf4aefbbmshb4b4241cb3accf1p1db69bjsnc57795d3037c")
                .header("X-RapidAPI-Host", "edamam-recipe-search.p.rapidapi.com")
                .asString();

        ObjectMapper objectMapper = new ObjectMapper();
        String json = response.getBody();
        Recipes recipes = objectMapper.readValue(json, Recipes.class);
        assertEquals("lemon", recipes.getQ());

    }
}
