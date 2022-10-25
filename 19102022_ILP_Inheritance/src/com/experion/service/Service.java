package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service {

	public static Product createProduct(String productType) {
		ArrayList<BankServices> bankServices = new ArrayList<BankServices>();

		bankServices.add(new BankServices("SOB100", "Online Banking"));
		bankServices.add(new BankServices("SOB102", "Mobile Banking"));
		bankServices.add(new BankServices("SOB105", " Cash Deposit"));

		Product product = null;
		// Card card = new Card("PRDM100", "Master Card","Cards","Master" );
		if (productType.compareTo("Cards") == 0) {
			product = new Card("PRDM100", "Master Card", "Cards", "Master");
		} else if (productType.compareTo("Accounts") == 0) {
			product = new Account("PRDWSA100", "Womens Saving Account", "Accounts", "Savings Accounts", bankServices);

		}
		return product;
		// TODO Auto-generated method stub

	}

	public static void createAccountProduct() {
		// TODO Auto-generated method stub

	}

	public static void displayProductDetails(ArrayList<Product> productList) {
		Card card = null;
		Account account = null;

		System.out.println("Product Code" + "		" + "ProductName" + "     " + "ProductType" + "		"
				+ "Account/Card	" + "		" + "Services");
		for (Product product : productList) {
			if (product instanceof Card) {
				card = (Card) product;
				System.out.println(
						card.getProductCode() + "	 	" + card.getProductName() + "		" + card.getProductType()
								+ "		" + card.getCardType());

			} else if (product instanceof Account) {
				account = (Account) product;
				System.out.println(account.getProductCode() + "	 	" + account.getProductName() + "			"
						+ account.getProductType() + "		" + account.getAccountType() + "	"
						+ account.getBankServices());
				System.out.println("The list services are given below:");
				for (BankServices bankServices : account.getBankServices()) {
					System.out.println(bankServices.getServiceName());
				}
			}

		}
		// TODO Auto-generated method stub

	}

}
