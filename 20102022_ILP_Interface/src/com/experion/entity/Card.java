package com.experion.entity;

import java.util.ArrayList;

import com.experion.service.AccountCardServices;

public class Card extends Product implements AccountCardServices  {
	
	private String cardNumber;
	private double cardBalance;
	
	public Card(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getCardBalance() {
		return cardBalance;
	}

	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}

	@Override
	public void checkProductValidity() {
		
		System.out.println("Validity check of card class called: ");
		// TODO Auto-generated method stub
		
	}
	
public void checkBalance() {
		
		System.out.println("Validity check balance: ");
		// TODO Auto-generated method stub
		
	}
public void cashWithdraw() {
	
	System.out.println("Validity cash withdrawal initiated: ");
	// TODO Auto-generated method stub
	
}
	
	
	
	
	

}
