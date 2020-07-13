package com.tfm.dto;	


import java.io.Serializable;
import java.util.List;

public class Client implements Serializable{
	String name; 
	List<Product> products;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "{\"name\":\"" + name + "\", \"products\":[" + products + "]}";
	}

	
	
}
