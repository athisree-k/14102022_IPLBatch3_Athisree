package com.experion.assignment1;

import java.util.Scanner;

public class SortArray_12 {
	

	static void arrayAscending(int array[]) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}

		}
		System.out.println();

		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int numberOfElements = scanner.nextInt();
		int array[] = new int[numberOfElements];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			
		}
		arrayAscending(array);
		arrayDescending(array);
		
		// TODO Auto-generated method stub
         return;
	}

	private static void arrayDescending(int[] array) {
		
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}

		}
		System.out.println();

		System.out.println("Elements of array sorted in descending order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		// TODO Auto-generated method stub
		
	}

}
