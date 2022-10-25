package com.experion.service;


import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	int i =0,count=0;
	char addMoreproduct ='y';
	
    Product productList[]= new Product[3];
	
	public void stockUpdation() {
		Scanner scanner = new Scanner(System.in);
	
		do {
			scanner.nextLine();
			
			System.out.println("Enter Product Code");
			String productCode = scanner.nextLine();
			
			System.out.println("Enter Product Name");
			String productName = scanner.nextLine();
			
			System.out.println("Enter Product Description");
			String productDescription = scanner.nextLine();
			
			System.out.println("Enter Product Price");
			double productPrice = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.println("Enter Product OpenDate");
			String openDate = scanner.nextLine();
			
			System.out.println("Enter Product validityDate");
			String validityDate = scanner.nextLine();
			
			System.out.println("Enter Product ExpiryDate");
			String expiryDate = scanner.nextLine();
			
			System.out.println("Active(true or false)-");
			boolean active = scanner.nextBoolean();
			
			System.out.println("Do you want to continue y/n:");
			char addMoreproduct = scanner.next().charAt(0);
			
			 productList[i] = new Product( productCode, productName, productDescription, productPrice, openDate, validityDate, expiryDate, active );
			 count = count +1;
		} while (addMoreproduct == 'y');
		
	    
	    	
			
		
	
		//product.setProductCode(productCode);
		//product.setproductName(productName);
		//product.setproductPrice(productPrice);
		//product.setopenDate(openDate);
		//product.setvalidityDate(validityDate);
		//product.setexpiryDate(expiryDate);
		//product.setIsactive(active);
		//product.setproductDescription(productDescription);
	}

	
	
	public void stockDisplay() {
		System.out.println("ProductCode"+"	"+"ProductName" + "		" + "ProductDescription" + "	" + "ProductPrice" + "	" + "OpenDate"
				+ "		" + "ValidityDate" + "	" + "ExpiryDate" + "	" + "Active");
	
	for(int i =0;i<count;i++)
		System.out.println(productList[i].getProductCode()+" "+productList[i].getproductName() + "	" + productList[i].getproductDescription() + "	" + productList[i].getproductPrice() + "	" + productList[i].getopenDate() + "	"
				+ productList[i].getvalidityDate() + " 	" + productList[i].getexpiryDate() + "		" + productList[i].getIsactive());

	}


}
