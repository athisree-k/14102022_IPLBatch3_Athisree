package com.experion.assignment1;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit;
		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit:");
		limit = scanner.nextInt();
	
			for (int i = 1; i <= limit; ++i) {
				System.out.print(firstNumber + " ");
				nextNumber = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = nextNumber;
			}

		

	}

}
