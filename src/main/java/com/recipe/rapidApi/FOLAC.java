package com.recipe.rapidApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FOLAC{

	@JsonProperty("unit")
	private String unit;

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("label")
	private String label;

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	@Override
 	public String toString(){
		return 
			"FOLAC{" + 
			"unit = '" + unit + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",label = '" + label + '\'' + 
			"}";
		}
}