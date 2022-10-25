package com.experion.assignment1;

import java.util.Scanner;

public class SumOfSeries_03 {

	public static void main(String[] args) {
		int limit;
		int sum =0,sign = 1;
		
		
		// TODO Auto-generated method stub
		System.out.println("Enter the limit");
		Scanner scanner= new Scanner(System.in);
		limit = scanner.nextInt();
		
		System.out.println("Sum of the series of type 1-3+5-7+.............+n");
		
		 int i = 1, c, f = 1;                            // i for odd nos, c for counter, f for flag
		  for (c = 1; c <= limit; c++) {
		   if (f % 2 == 0) {
		   // System.out.print(-i + " ");
		    sum = sum + -i;
		   } else {
		   // System.out.print(i + " ");
		    sum = sum+i;
		   }
		   i += 2;
		   f++;
		  }                              
		//System.out.println("Sum of first"+ " "+ limit+" "+"digits:"+ sum);
		  System.out.println(sum);

		
	}

}
