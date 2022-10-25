package com.experion.entity;

public class Product {
	
	String productCode;
	String productName ;
	String productType;
	
	
	public Product(String productCode,  String productName, String productType) {
		this.productCode = productCode;
		this.productName = productName;
		this.productType = productType;
		
			
	}

	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	

}
