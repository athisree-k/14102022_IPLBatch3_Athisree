package com.experion.utility;
import java.text.ParseException;

import com.experion.entity.Product;
import com.experion.service.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProductUtility {

	public static void main(String[] args) throws ParseException {
	
	char mainChoice,cusChoice='n';
	int index =0;
    
    Scanner scanner = new Scanner(System.in);
   // Product productList[]= new Product[3];
    ArrayList<Product>productList= new ArrayList<Product>();
    
    do {
    	System.out.println("1. Create Product 2. Display Product");
    	int choice = scanner.nextInt();
    	switch(choice) {
    	case 1:productList.add(Service.inputProductDetails());
    	       index ++;
    	       break;
    	case 2 :Service.displayProductDetails(productList);   
    	      
    		
    	}
    	
    	System.out.println("Do you want to continue ?y/n");
    	mainChoice = scanner.next().charAt(0);
    
        while (cusChoice == 'y' || mainChoice =='n') {
        System.out.println("Customer Enter the product purchase date number");
        int customerInput = scanner.nextInt();
        String purchaseDate = scanner.nextLine();
        
        Date currentDate = new Date();
        Service.customerPurchase(customerInput, productList, currentDate);
        
        System.out.println("Select another product (y/n):");
        cusChoice = scanner.next().charAt(0);
        if (cusChoice == 'n')
		mainChoice = 'y';
		// TODO Auto-generated method stub
	    }
	} while (mainChoice == 'y');
	}
	
}
