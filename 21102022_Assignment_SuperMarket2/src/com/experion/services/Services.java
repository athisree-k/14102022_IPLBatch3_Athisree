package com.experion.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.entity.Electronics;
import com.experion.entity.Fabric;

import com.experion.entity.Product;

public class Services {

	public static void addProductDetails(ArrayList<Product> productList, String string) throws ParseException {

		Product product = null;
		if (string.compareTo("Fabric") == 0) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Product Code");
			String productCode = scanner.nextLine();
			System.out.println("Enter Product Name");
			String productName = scanner.nextLine();
			System.out.println("Enter Product Price");
			String productType = scanner.nextLine();
			System.out.println("Enter FabricSize");
			String fabricSize = scanner.nextLine();
			

			product = new Fabric(productCode, productName, productType, fabricSize);

		} else if (string.compareTo("Electronics") == 0) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Product Code");
			String productCode = scanner.nextLine();
			System.out.println("Enter Product Name");
			String productName = scanner.nextLine();
			System.out.println("Enter Product Price");
			String productType = scanner.nextLine();
			System.out.println("Enter the warranty Date:");
			String warranty = scanner.nextLine();
			// date
			Date warrantyDate = convertStringToDate(warranty);

			System.out.println("Enter the Service Charge:");
			String serviceCharge = scanner.nextLine();

			product = new Electronics(productCode, productName, productType, warrantyDate, serviceCharge);

		}
		productList.add(product);
		// System.out.println(product.getProductCode());
		// function to convert string date to date
	}

	private static Date convertStringToDate(String warranty) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedDate = formatter.parse(warranty);
		return convertedDate;

	}

	public static void displayProductDetails(ArrayList<Product> productList) {

		String productType;

		System.out.println("ProductCode" + "		" + "ProductName" + " 	" + "ProductPrice" + " 	" + "FabricSize/Warranty");

		for (Product product : productList) {
			// System.out.println(product.getProductCode());
			if (product != null) {
				if (product instanceof Fabric) {
					Fabric fabric = (Fabric) product;
                    System.out.println(fabric.getProductCode() + "		 " + fabric.getProductName() + "	 	"
							+ fabric.getProductType() + "		" + fabric.getFabricSize());

				}

				if (product instanceof Electronics) {
					Electronics electronics = (Electronics) product;
					System.out.println(electronics.getProductCode() + "	 	" + electronics.getProductName()
							+ "	 	" + electronics.getProductType() + " 	" + electronics.getWarranty());

				}

			}
		}
	}

	public static Product buyProduct(ArrayList<Product> productList, Customer customer) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		Product selectedProduct = customer.getProduct();
		System.out.println("Product Code" + "      " + "Product Name" + "      " + "Product Type");
		for (Product product : productList) {
			System.out.println(product.getProductCode() + "      " + product.getProductName() + "      "
					+ product.getProductType());
		}

		System.out.println("Enter the product code to buy : ");
		String productCode = scanner.nextLine();

		for (Product product : productList) {

			if (selectedProduct.getProductCode().compareTo(productCode) == 0) {
				System.out.println("Esucessfully bought ");

			}

		}
		return selectedProduct;

	}

	public static void getProductService(Customer customer, Date currentDate) {
		Fabric fabric;
		Electronics electronics;
		char option, option1;
		Product product = customer.getProduct();
		Scanner scanner = new Scanner(System.in);
		System.out.println("The product you bought is " + product.getProductName() +" and the price is"+ product.getProductType());

		if (product instanceof Fabric) {
			fabric = (Fabric) product;
			do {
				System.out.println("Services : 1. ExchangeProduct, 2. Return ");
				int choice1 = scanner.nextInt();

				switch (choice1) {
				case 1:
					fabric.productExchange();
					break;
				case 2:
					fabric.productReturn();
				
				}

				System.out.println("Do you want to continue(y/n");
				option1 = scanner.next().charAt(0);

			} while (option1 == 'y');

		} else if (product instanceof Electronics) {
			electronics = (Electronics) product;
			do {
				System.out.println("Services : 1. Repair, 2. Check Warranty 3. Bill");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					electronics.productRepair();
					break;

				case 2:
					if (electronics.getWarranty().after(currentDate) || electronics.getWarranty().equals(currentDate)) {
						electronics.warrantyReplacement();
						break;
					} else
						System.out.println("Not valid for replacement");

					break;

				case 3:
					System.out.println("Your service charge is " + electronics.getServiceCharge());
				}
				System.out.println("Do you want to continue with electronic services(y/n");
				option = scanner.next().charAt(0);

			} while (option == 'y');

		}
	}

	public static Customer giveCustomerDetails(ArrayList<Product> productList, Customer customer) {
		Scanner scanner = new Scanner(System.in);
		Product selectedProduct = null;
		if (customer == null) {

			customer = new Customer();
			System.out.println("Enter the customer code");
			String customerCode = scanner.nextLine();
			customer.setCustomerCode(customerCode);
			System.out.println("Enter the customer name");
			String customerName = scanner.nextLine();
			customer.setCustomerName(customerName);
			System.out.println("Enter the customer selected product code");
			String productCode = scanner.nextLine();
			for (Product product : productList) {

				if (product.getProductCode().compareTo(productCode) == 0) {
					selectedProduct = product;
					customer.setProduct(selectedProduct);
				}

			}
		} else {
			System.out.println("Enter the customer selected product code");
			String productCode = scanner.nextLine();
			for (Product product : productList) {

				if (product.getProductCode().compareTo(productCode) == 0) {
					selectedProduct = product;
					customer.setProduct(selectedProduct);
				}
			}
		}
		return customer;

	}

}
