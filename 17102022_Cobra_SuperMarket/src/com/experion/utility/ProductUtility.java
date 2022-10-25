package com.experion.utility;


import com.experion.service.Service;

import java.util.Scanner;

public class ProductUtility {

	public static void main(String[] args) {
	Service	service = new Service();
	
	
	while(true) {
		System.out.println("Enter 1 for stockupdate and 2 for stock display:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number ==1) {
			service.stockUpdation();
		}
		else if(number==2)
		service.stockDisplay();
		
		else 
			System.out.println("INVALID");
			
		}
			
		
	}
	

	
		// TODO Auto-generated method stub
	}

