package com.experion.assignment1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates_15 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//int array[]= new int[100];
	
		
		
		 Integer[] numbers = new Integer[] {1,2,1,3,3,5,6,7};
		 System.out.println( Arrays.toString(numbers) );
		  LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
		  Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
	         
	        //Verify the array content
	        System.out.println( Arrays.toString(numbersWithoutDuplicates) );

	}

}
