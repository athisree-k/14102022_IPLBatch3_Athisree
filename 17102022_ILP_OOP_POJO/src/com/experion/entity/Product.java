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

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductCode() {

		return this.productCode;

	}
	
	
	public void setproductName(String productName) {
		this.productName = productName;
	}

	public String getproductName() {

		return this.productName;

	}
	
	
	public void  setproductDescription(String  productDescription)
	{
		this. productDescription =  productDescription;
	}

	public String getproductDescription() 
	{
		return this.productDescription;

	}
	
	public void  setproductPrice(double  productPrice)
	{
		this.productPrice =  productPrice;
	}

	public double getproductPrice() 
	{
		return this.productPrice;

	}
	
	public void  setopenDate(String  openDate)
	{
		this.openDate =  openDate;
	}

	public String getopenDate() 
	{
		return this.openDate;

	}
	
	public void  setvalidityDate(String  validityDate)
	{
		this.validityDate =  validityDate;
	}

	public String getvalidityDate() 
	{
		return this.validityDate;

	}
	
	public void  setexpiryDate(String expiryDate)
	{
		this.expiryDate =  expiryDate;
	}

	public String getexpiryDate() 
	{
		return this.expiryDate;

	}
	public void  setIsactive(boolean active)
	{
		this.active =  active;
	}

	public boolean getIsactive() 
	{
		return this.active;

	}
	
	
	
	
	
	
	
	
	
	

	
}
