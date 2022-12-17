package com.recipe.rapidApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RIBF{

	@JsonProperty("unit")
	private String unit;

	@JsonProperty("quantity")
	private Object quantity;

	@JsonProperty("label")
	private String label;

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setQuantity(Object quantity){
		this.quantity = quantity;
	}

	public Object getQuantity(){
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
			"RIBF{" + 
			"unit = '" + unit + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",label = '" + label + '\'' + 
			"}";
		}
}