package com.experion.assignment1;

import java.util.Scanner;

public class SumOfSeries_06 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 5;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n = scanner.nextInt();
		 
	      System.out.println("The sum of series 1/1! + 2/4! + 3/9! + …… + 1/N^2! upto " + n
	                           + " terms is : "
	                           + calculateSum(n));
		
		
	}

	public static double calculateSum(int n) {
		// TODO Auto-generated method stub'
        // Iteration by running a loop N times
		double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + ((double)i / factorial(i*i));
        }
 
        // Return calculated final sum
        return sum;
		
	}

	public static double factorial(int i) {
		 if (i == 1) {
	            return 1;
	        }
	        return i * factorial(i - 1);
	}

}
