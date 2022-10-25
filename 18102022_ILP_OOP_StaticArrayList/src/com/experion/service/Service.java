package com.experion.service;


import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	//static Product product = null;
	
	public static Product createProduct() {
		Scanner scanner = new Scanner(System.in);
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
	
		//product.setProductCode(productCode);
		//product.setproductName(productName);
		//product.setproductPrice(productPrice);
		//product.setopenDate(openDate);
		//product.setvalidityDate(validityDate);
		//product.setexpiryDate(expiryDate);
		//product.setIsactive(active);
		//product.setproductDescription(productDescription);
		
		
		Product product = new Product( productCode, productName, productDescription, productPrice, openDate, validityDate, expiryDate, active );
		
		product.setSerialNo(product.getSerialNo()+1);
		product.setSerialNoOriginal(product.getSerialNo());
		return product;
	}

	
	
	public static void displayProductDetails(ArrayList<Product> productList) {
		System.out.println("SL.No"+"	"+ "ProductCode"+"	"+"ProductName" + "		" + "ProductDescription" + "	" + "ProductPrice" + "	" + "OpenDate"
				+ "		" + "ValidityDate" + "	" + "ExpiryDate" + "	" + "Active");
	
		for(Product product: productList)
		{
		if(product!=null){
		System.out.println(product.getSerialNoOriginal()+"	 "+ product.getProductCode()+"	 "+product.getproductName() + "		" + product.getproductDescription() + "		" + product.getproductPrice() + "		" + product.getopenDate() + "		"
				+ product.getvalidityDate() + " 	" + product.getexpiryDate() + "		" + product.getIsactive());
		}
		
	}
	}

}
