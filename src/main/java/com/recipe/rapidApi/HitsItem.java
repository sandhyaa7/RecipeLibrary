package com.recipe.rapidApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HitsItem{

	@JsonProperty("recipe")
	private Recipe recipe;

	public void setRecipe(Recipe recipe){
		this.recipe = recipe;
	}

	public Recipe getRecipe(){
		return recipe;
	}

	@Override
 	public String toString(){
		return 
			"HitsItem{" + 
			"recipe = '" + recipe + '\'' + 
			"}";
		}
}