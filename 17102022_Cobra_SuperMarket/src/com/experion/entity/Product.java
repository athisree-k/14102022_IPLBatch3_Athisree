package com.experion.entity;

import java.util.Scanner;

public class Product {

	private String productCode;
	private String productName;
	private String productDescription;
	private double productPrice;
	private String openDate;
	private String validityDate;
	private String expiryDate;
	private boolean active;
	char addMoreproduct ;
	
	public Product() {
		
	}
	
	public Product(String productCode, String productName,String productDescription,double productPrice,String openDate,String validityDate,String expiryDate,boolean active ) {
		this.productCode =productCode;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.openDate = openDate;
		this.validityDate = validityDate;
		this.expiryDate = expiryDate;
		this.active = active;
	}
	

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductCode() {

		return productCode;

	}
	
	
	public void setproductName(String productName) {
		this.productName = productName;
	}

	public String getproductName() {

		return productName;

	}
	
	
	public void  setproductDescription(String  productDescription)
	{
		this. productDescription =  productDescription;
	}

	public String getproductDescription() 
	{
		return productDescription;

	}
	
	public void  setproductPrice(double  productPrice)
	{
		this.productPrice =  productPrice;
	}

	public double getproductPrice() 
	{
		return productPrice;

	}
	
	public void  setopenDate(String  openDate)
	{
		this.openDate =  openDate;
	}

	public String getopenDate() 
	{
		return openDate;

	}
	
	public void  setvalidityDate(String  validityDate)
	{
		this.validityDate =  validityDate;
	}

	public String getvalidityDate() 
	{
		return validityDate;

	}
	
	public void  setexpiryDate(String expiryDate)
	{
		this.expiryDate =  expiryDate;
	}

	public String getexpiryDate() 
	{
		return expiryDate;

	}
	public void  setIsactive(boolean active)
	{
		this.active =  active;
	}

	public boolean getIsactive() 
	{
		return active;

	}
	
	
	
	
	
	
	
	
	
	

	
}
