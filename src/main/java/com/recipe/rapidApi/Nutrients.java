package com.recipe.rapidApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients{

	@JsonProperty("carbohydrates")
	private String carbohydrates;

	@JsonProperty("calcium")
	private String calcium;

	@JsonProperty("potassium")
	private String potassium;

	@JsonProperty("saturated fat")
	private String saturatedFat;

	@JsonProperty("magnesium")
	private String magnesium;

	@JsonProperty("vitamin a iu")
	private String vitaminAIu;

	@JsonProperty("sodium")
	private String sodium;

	@JsonProperty("folate")
	private String folate;

	@JsonProperty("protein")
	private String protein;

	@JsonProperty("fat")
	private String fat;

	@JsonProperty("calories from fat")
	private String caloriesFromFat;

	@JsonProperty("cholesterol")
	private String cholesterol;

	@JsonProperty("iron")
	private String iron;

	@JsonProperty("dietary fiber")
	private String dietaryFiber;

	public void setCarbohydrates(String carbohydrates){
		this.carbohydrates = carbohydrates;
	}

	public String getCarbohydrates(){
		return carbohydrates;
	}

	public void setCalcium(String calcium){
		this.calcium = calcium;
	}

	public String getCalcium(){
		return calcium;
	}

	public void setPotassium(String potassium){
		this.potassium = potassium;
	}

	public String getPotassium(){
		return potassium;
	}

	public void setSaturatedFat(String saturatedFat){
		this.saturatedFat = saturatedFat;
	}

	public String getSaturatedFat(){
		return saturatedFat;
	}

	public void setMagnesium(String magnesium){
		this.magnesium = magnesium;
	}

	public String getMagnesium(){
		return magnesium;
	}

	public void setVitaminAIu(String vitaminAIu){
		this.vitaminAIu = vitaminAIu;
	}

	public String getVitaminAIu(){
		return vitaminAIu;
	}

	public void setSodium(String sodium){
		this.sodium = sodium;
	}

	public String getSodium(){
		return sodium;
	}

	public void setFolate(String folate){
		this.folate = folate;
	}

	public String getFolate(){
		return folate;
	}

	public void setProtein(String protein){
		this.protein = protein;
	}

	public String getProtein(){
		return protein;
	}

	public void setFat(String fat){
		this.fat = fat;
	}

	public String getFat(){
		return fat;
	}

	public void setCaloriesFromFat(String caloriesFromFat){
		this.caloriesFromFat = caloriesFromFat;
	}

	public String getCaloriesFromFat(){
		return caloriesFromFat;
	}

	public void setCholesterol(String cholesterol){
		this.cholesterol = cholesterol;
	}

	public String getCholesterol(){
		return cholesterol;
	}

	public void setIron(String iron){
		this.iron = iron;
	}

	public String getIron(){
		return iron;
	}

	public void setDietaryFiber(String dietaryFiber){
		this.dietaryFiber = dietaryFiber;
	}

	public String getDietaryFiber(){
		return dietaryFiber;
	}

	@Override
 	public String toString(){
		return 
			"Nutrients{" + 
			"carbohydrates = '" + carbohydrates + '\'' + 
			",calcium = '" + calcium + '\'' + 
			",potassium = '" + potassium + '\'' + 
			",saturated fat = '" + saturatedFat + '\'' + 
			",magnesium = '" + magnesium + '\'' + 
			",vitamin a iu = '" + vitaminAIu + '\'' + 
			",sodium = '" + sodium + '\'' + 
			",folate = '" + folate + '\'' + 
			",protein = '" + protein + '\'' + 
			",fat = '" + fat + '\'' + 
			",calories from fat = '" + caloriesFromFat + '\'' + 
			",cholesterol = '" + cholesterol + '\'' + 
			",iron = '" + iron + '\'' + 
			",dietary fiber = '" + dietaryFiber + '\'' + 
			"}";
		}
}