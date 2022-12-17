package com.recipe.rapidApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Recipe{

	@JsonProperty("image")
	private String image;

	@JsonProperty("shareAs")
	private String shareAs;

	@JsonProperty("cautions")
	private List<String> cautions;

	@JsonProperty("healthLabels")
	private List<String> healthLabels;

	@JsonProperty("totalTime")
	private int totalTime;

	@JsonProperty("mealType")
	private List<String> mealType;

	@JsonProperty("label")
	private String label;

	@JsonProperty("source")
	private String source;

	@JsonProperty("calories")
	private Object calories;

	@JsonProperty("cuisineType")
	private List<String> cuisineType;

	@JsonProperty("uri")
	private String uri;

	@JsonProperty("url")
	private String url;

	@JsonProperty("totalNutrients")
	private TotalNutrients totalNutrients;

	@JsonProperty("dietLabels")
	private List<String> dietLabels;

	@JsonProperty("dishType")
	private List<String> dishType;

	@JsonProperty("yield")
	private int yield;

	@JsonProperty("totalWeight")
	private Object totalWeight;

	@JsonProperty("digest")
	private List<DigestItem> digest;

	@JsonProperty("ingredients")
	private List<IngredientsItem> ingredients;

	@JsonProperty("totalDaily")
	private TotalDaily totalDaily;

	@JsonProperty("ingredientLines")
	private List<String> ingredientLines;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setShareAs(String shareAs){
		this.shareAs = shareAs;
	}

	public String getShareAs(){
		return shareAs;
	}

	public void setCautions(List<String> cautions){
		this.cautions = cautions;
	}

	public List<String> getCautions(){
		return cautions;
	}

	public void setHealthLabels(List<String> healthLabels){
		this.healthLabels = healthLabels;
	}

	public List<String> getHealthLabels(){
		return healthLabels;
	}

	public void setTotalTime(int totalTime){
		this.totalTime = totalTime;
	}

	public int getTotalTime(){
		return totalTime;
	}

	public void setMealType(List<String> mealType){
		this.mealType = mealType;
	}

	public List<String> getMealType(){
		return mealType;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setCalories(Object calories){
		this.calories = calories;
	}

	public Object getCalories(){
		return calories;
	}

	public void setCuisineType(List<String> cuisineType){
		this.cuisineType = cuisineType;
	}

	public List<String> getCuisineType(){
		return cuisineType;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setTotalNutrients(TotalNutrients totalNutrients){
		this.totalNutrients = totalNutrients;
	}

	public TotalNutrients getTotalNutrients(){
		return totalNutrients;
	}

	public void setDietLabels(List<String> dietLabels){
		this.dietLabels = dietLabels;
	}

	public List<String> getDietLabels(){
		return dietLabels;
	}

	public void setDishType(List<String> dishType){
		this.dishType = dishType;
	}

	public List<String> getDishType(){
		return dishType;
	}

	public void setYield(int yield){
		this.yield = yield;
	}

	public int getYield(){
		return yield;
	}

	public void setTotalWeight(Object totalWeight){
		this.totalWeight = totalWeight;
	}

	public Object getTotalWeight(){
		return totalWeight;
	}

	public void setDigest(List<DigestItem> digest){
		this.digest = digest;
	}

	public List<DigestItem> getDigest(){
		return digest;
	}

	public void setIngredients(List<IngredientsItem> ingredients){
		this.ingredients = ingredients;
	}

	public List<IngredientsItem> getIngredients(){
		return ingredients;
	}

	public void setTotalDaily(TotalDaily totalDaily){
		this.totalDaily = totalDaily;
	}

	public TotalDaily getTotalDaily(){
		return totalDaily;
	}

	public void setIngredientLines(List<String> ingredientLines){
		this.ingredientLines = ingredientLines;
	}

	public List<String> getIngredientLines(){
		return ingredientLines;
	}

	@Override
 	public String toString(){
		return 
			"Recipe{" + 
			"image = '" + image + '\'' + 
			",shareAs = '" + shareAs + '\'' + 
			",cautions = '" + cautions + '\'' + 
			",healthLabels = '" + healthLabels + '\'' + 
			",totalTime = '" + totalTime + '\'' + 
			",mealType = '" + mealType + '\'' + 
			",label = '" + label + '\'' + 
			",source = '" + source + '\'' + 
			",calories = '" + calories + '\'' + 
			",cuisineType = '" + cuisineType + '\'' + 
			",uri = '" + uri + '\'' + 
			",url = '" + url + '\'' + 
			",totalNutrients = '" + totalNutrients + '\'' + 
			",dietLabels = '" + dietLabels + '\'' + 
			",dishType = '" + dishType + '\'' + 
			",yield = '" + yield + '\'' + 
			",totalWeight = '" + totalWeight + '\'' + 
			",digest = '" + digest + '\'' + 
			",ingredients = '" + ingredients + '\'' + 
			",totalDaily = '" + totalDaily + '\'' + 
			",ingredientLines = '" + ingredientLines + '\'' + 
			"}";
		}
}