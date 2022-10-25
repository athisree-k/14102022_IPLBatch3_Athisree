package com.experion.service;


import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	Product product = new Product();
	
	
	

	
	public void inputProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code");
		String productCode = scanner.nextLine();
		product.setProductCode(productCode);
		System.out.println("Enter Product Name");
		String productName = scanner.nextLine();
		product.setproductName(productName);
		System.out.println("Enter Product Description");
		String productDescription = scanner.nextLine();
		product.setproductDescription(productDescription);
		System.out.println("Enter Product Price");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		product.setproductPrice(productPrice);
		System.out.println("Enter Product OpenDate");
		String openDate = scanner.nextLine();
		product.setopenDate(openDate);
		System.out.println("Enter Product validityDate");
		String validityDate = scanner.nextLine();
		product.setvalidityDate(validityDate);
		System.out.println("Enter Product ExpiryDate");
		String expiryDate = scanner.nextLine();
		product.setexpiryDate(expiryDate);
		System.out.println("Active(true or false)-");
		boolean active = scanner.nextBoolean();
		product.setIsactive(active);
		

	}

	public void displayProductDetails() {
		System.out.println("ProductCode"+"	"+"ProductName" + "		" + "ProductDescription" + "	" + "ProductPrice" + "	" + "OpenDate"
				+ "	" + "ValidityDate" + "	" + "ExpiryDate" + "	" + "Active");
	
	
		System.out.println(product.getProductCode()+" "+product.getproductName() + "	" + product.getproductDescription() + "	" + product.getproductPrice() + "	" + product.getopenDate() + "	"
				+ product.getvalidityDate() + " 	" + product.getexpiryDate() + "		" + product.getIsactive());

	}


}
