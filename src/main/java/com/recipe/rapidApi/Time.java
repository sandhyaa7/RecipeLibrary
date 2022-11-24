package com.recipe.rapidApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Time{

	@JsonProperty("total")
	private String total;

	@JsonProperty("prepration_time")
	private String preprationTime;

	@JsonProperty("cooking_time")
	private String cookingTime;

	@JsonProperty("additional_time")
	private String additionalTime;

	public void setTotal(String total){
		this.total = total;
	}

	public String getTotal(){
		return total;
	}

	public void setPreprationTime(String preprationTime){
		this.preprationTime = preprationTime;
	}

	public String getPreprationTime(){
		return preprationTime;
	}

	public void setCookingTime(String cookingTime){
		this.cookingTime = cookingTime;
	}

	public String getCookingTime(){
		return cookingTime;
	}

	public void setAdditionalTime(String additionalTime){
		this.additionalTime = additionalTime;
	}

	public String getAdditionalTime(){
		return additionalTime;
	}

	@Override
 	public String toString(){
		return 
			"Time{" + 
			"total = '" + total + '\'' + 
			",prepration_time = '" + preprationTime + '\'' + 
			",cooking_time = '" + cookingTime + '\'' + 
			",additional_time = '" + additionalTime + '\'' + 
			"}";
		}
}