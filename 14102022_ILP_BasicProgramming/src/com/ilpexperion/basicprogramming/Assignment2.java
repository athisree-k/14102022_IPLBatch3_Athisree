package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		firstNumber = scanner.nextInt();
		System.out.println("Enter the Second Number:");
		secondNumber = scanner.nextInt();
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println( "Number After Swapping");
		System.out.println(firstNumber);
		System.out.println(secondNumber);

	}

}
