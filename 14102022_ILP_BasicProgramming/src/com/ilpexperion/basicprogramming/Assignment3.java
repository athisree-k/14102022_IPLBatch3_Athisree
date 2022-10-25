package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		int number,digit;
		
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		number = scanner.nextInt();
		digit = number%10;
		if(digit ==0) {
			System.out.println("The number is zero");
			
		}
		else if(digit%2 ==0) {
			System.out.println("The number is Even");
		}
		 else
		System.out.println("The number is Odd");
			
			

	}

}
