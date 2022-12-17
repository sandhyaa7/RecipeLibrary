package com.recipe.rapidApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubItem{

	@JsonProperty("schemaOrgTag")
	private String schemaOrgTag;

	@JsonProperty("total")
	private Object total;

	@JsonProperty("unit")
	private String unit;

	@JsonProperty("daily")
	private Object daily;

	@JsonProperty("hasRDI")
	private boolean hasRDI;

	@JsonProperty("label")
	private String label;

	@JsonProperty("tag")
	private String tag;

	public void setSchemaOrgTag(String schemaOrgTag){
		this.schemaOrgTag = schemaOrgTag;
	}

	public String getSchemaOrgTag(){
		return schemaOrgTag;
	}

	public void setTotal(Object total){
		this.total = total;
	}

	public Object getTotal(){
		return total;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setDaily(Object daily){
		this.daily = daily;
	}

	public Object getDaily(){
		return daily;
	}

	public void setHasRDI(boolean hasRDI){
		this.hasRDI = hasRDI;
	}

	public boolean isHasRDI(){
		return hasRDI;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public String getTag(){
		return tag;
	}

	@Override
 	public String toString(){
		return 
			"SubItem{" + 
			"schemaOrgTag = '" + schemaOrgTag + '\'' + 
			",total = '" + total + '\'' + 
			",unit = '" + unit + '\'' + 
			",daily = '" + daily + '\'' + 
			",hasRDI = '" + hasRDI + '\'' + 
			",label = '" + label + '\'' + 
			",tag = '" + tag + '\'' + 
			"}";
		}
}