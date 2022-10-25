package com.experion.assignment1;

import java.util.Scanner;

public class Descending {

	public static void main(String[] args) {
		
		int firstNumber, secondNumber, thirdNumber;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		firstNumber = scanner.nextInt();
		System.out.println("Enter the second number: ");
		secondNumber = scanner.nextInt();
		System.out.println("Enter the third number: ");
		thirdNumber = scanner.nextInt();
		
		if((firstNumber >=secondNumber)&&(firstNumber>= thirdNumber)) {
			
			if(secondNumber >=thirdNumber) {
				System.out.println("The numbers in descending order:"+ firstNumber+ "," + secondNumber+"," + thirdNumber);
				
			}
			else
				System.out.println("The numbers in descending order:"+ firstNumber+ "," + thirdNumber+"," + secondNumber);
			
		}
		// TODO Auto-generated method stub

		else if((secondNumber>=firstNumber)&&(secondNumber>=thirdNumber)) {
			if(firstNumber >=thirdNumber) {
				System.out.println("The numbers in descending order:"+secondNumber + "," + firstNumber +"," +thirdNumber );
			}
			else 
				System.out.println("The numbers in descending order:"+secondNumber + "," + thirdNumber +"," + firstNumber);
		}
        
		else if((thirdNumber>=firstNumber)&&(thirdNumber>=secondNumber)) {
			
			if(firstNumber>secondNumber) {
				System.out.println("The numbers in descending order:"+ thirdNumber + "," + firstNumber +"," +secondNumber );
				
			}
			else
				System.out.println("The numbers in descending order:"+ thirdNumber + "," + secondNumber +"," +firstNumber );
		}
			
	}
}
