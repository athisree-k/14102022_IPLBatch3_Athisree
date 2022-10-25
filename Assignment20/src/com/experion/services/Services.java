package com.experion.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Product;

public class Services {
	public static void addproductDetails(ArrayList<Product> productList, String string) throws ParseException{
		Product product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name");
		String productName = scanner.nextLine();
		System.out.println("Enter Product expiryDate");
		String Dateexpiry = scanner.nextLine();
		Date expiryDate = convertStringToDate(Dateexpiry);
		System.out.println("Enter the validity");
		String Datevalidity = scanner.nextLine();
		Date validityDate = convertStringToDate(Datevalidity);
		product = new Product(productCode, productName, expiryDate, validityDate);
		productList.add(product);
	}
	
	
	
	private static Date convertStringToDate(String Dateexpiry) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedDate = formatter.parse(Dateexpiry);
		return convertedDate;

	}
	
	private static Date convertStringToDate2(String Datevalidity) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedDate = formatter.parse(Datevalidity);
		return convertedDate;

	}

}
