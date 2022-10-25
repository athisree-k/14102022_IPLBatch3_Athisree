package com.experion.basicprogramming;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String productName[] = new String[5];
		System.out.println("Enter the product names ");
		for(int index = 0;index < productName.length;index++) {
			productName[index] = scanner.nextLine();
			
		}
		for(int index =0; index <productName.length;index++) {
			System.out.println(productName[index]+"   "+ productName[index].length());
		}
		

	}

}
