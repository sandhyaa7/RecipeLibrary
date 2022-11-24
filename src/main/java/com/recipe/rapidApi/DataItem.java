package com.recipe.rapidApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DataItem{

	@JsonProperty("instructions")
	private List<String> instructions;

	@JsonProperty("image")
	private String image;

	@JsonProperty("servings")
	private String servings;

	@JsonProperty("name")
	private String name;

	@JsonProperty("ingredients")
	private List<String> ingredients;

	@JsonProperty("time")
	private Time time;

	@JsonProperty("nutrients")
	private Nutrients nutrients;

	@JsonProperty("tags")
	private List<Object> tags;

	public void setInstructions(List<String> instructions){
		this.instructions = instructions;
	}

	public List<String> getInstructions(){
		return instructions;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setServings(String servings){
		this.servings = servings;
	}

	public String getServings(){
		return servings;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIngredients(List<String> ingredients){
		this.ingredients = ingredients;
	}

	public List<String> getIngredients(){
		return ingredients;
	}

	public void setTime(Time time){
		this.time = time;
	}

	public Time getTime(){
		return time;
	}

	public void setNutrients(Nutrients nutrients){
		this.nutrients = nutrients;
	}

	public Nutrients getNutrients(){
		return nutrients;
	}

	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	public List<Object> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"instructions = '" + instructions + '\'' + 
			",image = '" + image + '\'' + 
			",servings = '" + servings + '\'' + 
			",name = '" + name + '\'' + 
			",ingredients = '" + ingredients + '\'' + 
			",time = '" + time + '\'' + 
			",nutrients = '" + nutrients + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}