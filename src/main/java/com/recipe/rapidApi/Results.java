package com.recipe.rapidApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Results{

	@JsonProperty("data")
	private List<DataItem> data;

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"Results{" + 
			"data = '" + data + '\'' + 
			"}";
		}
}