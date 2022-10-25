package com.experion.entity;

public class Fabric extends Product {
	private String fabricSize;
 
	

	public Fabric(String productCode, String productName, String productType, String fabricSize) {
		super(productCode, productName, productType);
		this.fabricSize = fabricSize;
	}

	public String getFabricSize() {
		return fabricSize;
	}

	public void setFabricSize(String fabricSize) {
		this.fabricSize = fabricSize;
	}

	public void productExchange() {
		// TODO Auto-generated method stub
		System.out.println("Fabric product exchanged");
	}
	

}
