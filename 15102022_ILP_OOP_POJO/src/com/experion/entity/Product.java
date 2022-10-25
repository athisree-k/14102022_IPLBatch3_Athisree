package com.experion.entity;

import java.util.Scanner;

public class Product {
	
	String productCode;
	String productName;
	String productDescription;
	double productPrice;
	String openDate;
	String validityDate;
	String expiryDate;
	boolean active;
	
	public void inputProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code");
		productCode = scanner.nextLine();
		System.out.println("Enter Product Name");
		productName = scanner.nextLine();
		System.out.println("Enter Product Description");
		productDescription = scanner.nextLine();
		System.out.println("Enter Product Price");
		productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product OpenDate");
		openDate = scanner.nextLine();
		System.out.println("Enter Product validityDate");
		validityDate = scanner.nextLine();
		System.out.println("Enter Product ExpiryDate");
		expiryDate = scanner.nextLine();
		System.out.println("Active(true or false)-");
		active = scanner.nextBoolean();
		
		
		
		
	}
	
	public void displayProductDetails(){
		System.out.println("ProductName"+"	"+"ProductDescription"+"	"+"ProductPrice"+"	"+"OpenDate"+"	"+"ValidityDate"+"	"+ "ExpiryDate"+"	"+ "Active");
		System.out.println(productName+"	"+productDescription+"	"+ productPrice+"	"+ openDate +"	"+validityDate+" 	"+expiryDate+"		"+ active) ;
		
		
		
		
		
	}

}
