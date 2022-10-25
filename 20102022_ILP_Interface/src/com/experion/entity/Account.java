package com.experion.entity;

import java.util.ArrayList;

import com.experion.service.AccountCardServices;

public class Account extends Product implements AccountCardServices {
	
	private String accountNumber;
	private double accountBalance;
	
	public Account(String productName, String accountNumber, double accountBalance) {
		super(productName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public void checkProductValidity() {
		// TODO Auto-generated method stub
		System.out.println("Validity check of the product: ");
		
	}
	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Validity check balance: ");
	}
	@Override
	public void cashWithdraw() {
		// TODO Auto-generated method stub
		System.out.println("Validity cash withdraw: ");
	}
	
	

}