package com.experion.utility;

import com.experion.service.Service;
import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;


public class ProductUtility {

	public static void main(String[] args) {
		
		ArrayList<Product> productList= new ArrayList<Product>();
		
		Scanner scanner = new Scanner(System.in);
		
		
		char mainChoice;
		do {
			System.out.println("1. Add Card Prodcuts, 2. Add Account Products, 3. Buy Product");
			int choice = scanner.nextInt();
		    switch(choice)
		{
		case 1 :productList.add(Service.createProduct("Cards"));
		        break;
		case 2 :productList.add(Service.createProduct("Accounts"));
		        break;
		case 3 :Service.displayProductDetails(productList);
		        break;
	    default: System.out.println("Invalid Choice");
		
		}
		System.out.println("Do you want to continue(y/n");
		mainChoice = scanner.next().charAt(0);
		}
	  while (mainChoice=='y');
		
		
	}	    	
		    	
		// TODO Auto-generated method stub

	}


