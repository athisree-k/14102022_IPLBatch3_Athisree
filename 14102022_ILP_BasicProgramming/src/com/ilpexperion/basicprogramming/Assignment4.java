package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {

		int firstNumber, secondNumber, thirdNumber;

		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub

		System.out.println("Enter the FirstNumber:");
		firstNumber = scanner.nextInt();
		System.out.println("Enter the SecondNumber:");
		secondNumber = scanner.nextInt();
		System.out.println("Enter the ThirdNumber:");
		thirdNumber = scanner.nextInt();
		
		if(firstNumber>secondNumber) {
			if(firstNumber>thirdNumber) {
				if(secondNumber>thirdNumber)
					System.out.println("Second Largest Number is" + thirdNumber );
				else
					System.out.println("Second Largest Number is" + secondNumber );
			}     
		}
		else {
			if(secondNumber>thirdNumber) {
				if(thirdNumber>firstNumber)
					System.out.println("Second Largest Number is" + firstNumber );
				else
					System.out.println("Second Largest Number is" + thirdNumber );
			}
		else
			System.out.println("Second Largest Number is" + secondNumber );
			

		
		}
	}
}


