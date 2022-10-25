package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String productNames[] = new String[5];
		System.out.println("Enter the product names ");
		for(int index = 0;index < productNames.length;index++) {
			productNames[index] = scanner.nextLine();
			
		}
		System.out.println("************Product in stock************ ");
		for(String productName : productNames)
			System.out.println(productName+"   "+ productName.length());
	
		

	}
}


