package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		firstNumber = scanner.nextInt();
		System.out.println("Enter the Second Number:");
		secondNumber = scanner.nextInt();
		System.out.println( firstNumber);
		System.out.println(secondNumber);
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		System.out.println( "Number After Swapping");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
	
		
		
		// TODO Auto-generated method stub

	}

}
