package com.experion.assignment1;

import java.util.Scanner;

public class CountCharacterReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String sentence:");
		String str= scanner.nextLine();
		System.out.println("Enter the character you want to count:");
        char character =scanner.next().charAt(0);
        System.out.println("The character appeared"+"  "+count(str, character));
        System.out.println("Enter the character you want to replace it with:");
        char replace =scanner.next().charAt(0);
        System.out.println(str.replace(character, replace));
	}

	private static int count(String s, char character) {
		 int res = 0;
		 
	        for (int i=0; i<s.length(); i++)
	        {
	            // checking character in string
	            if (s.charAt(i) == character)
	            res++;
	        }
	        return res;
		// TODO Auto-generated method stub
	}

}
