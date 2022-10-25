package com.experion.utility;



import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.entity.Product;

import com.experion.services.Services;


public class ProductUtility {

	public static void main(String[] args) throws ParseException {
		Product selectedProduct = null;
		Customer customer = null;
		
		// TODO Auto-generated method stub
ArrayList<Product> productList= new ArrayList<Product>();
		
		Scanner scanner = new Scanner(System.in);
		char mainChoice;
		do {
			System.out.println("1. Add Fabric, 2. Add Electronics, 3. Display Product, 4. Buy Product ");
			int choice = scanner.nextInt();
		    switch(choice)
		{
		case 1 :Services.addProductDetails(productList,"Fabric");
		        break;
		case 2 :Services.addProductDetails(productList,"Electronics");
		        break;
		case 3 :Services.displayProductDetails(productList);
		       break;
		case 4:
			    customer = Services.giveCustomerDetails(productList,customer);
			    //selectedProduct =Services.buyProduct(productList, customer);
			    Date currentDate = new Date();
			    Services.getProductService(customer, currentDate);
			    
		
		}
		System.out.println("Do you want to continue(y/n");
		mainChoice = scanner.next().charAt(0);
		}
	  while (mainChoice=='y');

	}

}
