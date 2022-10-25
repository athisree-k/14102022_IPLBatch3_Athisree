package com.experion.assignment1;

import java.util.Scanner;

public class SumOfSeries_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

		    int n;
		    int sum = 0;
            char choice = 0;
           
		    System.out.print("Enter the limit ");
		    n = scanner.nextInt();
		    for(int i=1; i<=n; i++) {
		      sum = sum + i*i*i;
		    }

		    // display result
		    System.out.println("Sum = " + sum);
		   
           
	}

}
