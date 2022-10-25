package com.experion.utility;

import com.experion.entity.Product;
import java.text.SimpleDateFormat;
import com.experion.service.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProductUtility {

	public static void main(String[] args) {
	
	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
    String str = formatter.format(date);
    System.out.print("Current date: "+str);
	char mainChoice;
	int index =0;
	int customerInput ;
    
    Scanner scanner = new Scanner(System.in);
   // Product productList[]= new Product[3];
    ArrayList<Product>productList= new ArrayList<Product>();
    
    do {
    	System.out.println("1. Create Product 2. Display Product");
    	int choice = scanner.nextInt();
    	switch(choice) {
    	case 1:productList.add(Service.createProduct());
    	       index ++;
    	       break;
    	case 2 :Service.displayProductDetails(productList);   
    	      
    		
    	}
    	
    	System.out.println("Do you want to continue ?y/n");
    	mainChoice = scanner.next().charAt(0);
    }
    
    while(mainChoice =='y');
	
		// TODO Auto-generated method stub
    System.out.println("Enter the product Code:");
    customerInput = scanner.nextInt();
    
	}
}
