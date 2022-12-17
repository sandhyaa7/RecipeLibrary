package com.recipe.rapidApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Recipes{

	@JsonProperty("hits")
	private List<HitsItem> hits;

	@JsonProperty("q")
	private String q;

	@JsonProperty("more")
	private boolean more;

	@JsonProperty("count")
	private int count;

	@JsonProperty("from")
	private int from;

	@JsonProperty("to")
	private int to;

	public void setHits(List<HitsItem> hits){
		this.hits = hits;
	}

	public List<HitsItem> getHits(){
		return hits;
	}

	public void setQ(String q){
		this.q = q;
	}

	public String getQ(){
		return q;
	}

	public void setMore(boolean more){
		this.more = more;
	}

	public boolean isMore(){
		return more;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setFrom(int from){
		this.from = from;
	}

	public int getFrom(){
		return from;
	}

	public void setTo(int to){
		this.to = to;
	}

	public int getTo(){
		return to;
	}

	@Override
 	public String toString(){
		return 
			"Recipes{" + 
			"hits = '" + hits + '\'' + 
			",q = '" + q + '\'' + 
			",more = '" + more + '\'' + 
			",count = '" + count + '\'' + 
			",from = '" + from + '\'' + 
			",to = '" + to + '\'' + 
			"}";
		}
}