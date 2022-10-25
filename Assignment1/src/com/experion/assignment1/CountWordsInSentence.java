package com.experion.assignment1;

import java.util.Scanner;

public class CountWordsInSentence {

	static int wordCount(String sentence) {
		// sentence = null;
		int count = 0;

		char sent[] = new char[sentence.length()];
		for (int i = 0; i < sentence.length(); i++) {
			sent[i] = sentence.charAt(i);
			if (((i > 0) && (sent[i] != ' ') && (sent[i - 1] == ' ')) || ((sent[0] != ' ') && (i == 0))) {
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		char choice;
		do {
		
		System.out.println("Enter the sentence :");
		String sentence = scanner.nextLine();
		
		System.out.println(wordCount(sentence) + " words.");
		System.out.println("Do you want to continue ?(y/n)");
		choice = scanner.next().charAt(0);
		scanner.nextLine();
		}while(choice =='y');
		// TODO Auto-generated method stub

	}
}
