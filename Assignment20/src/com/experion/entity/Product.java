package com.experion.entity;

import java.util.Date;

public class Product {

		String productCode;
		String productName;
		Date validityDate;
		Date expiryDate;
		public String getProductCode() {
			return productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public Date getValidityDate() {
			return validityDate;
		}
		public void setValidityDate(Date validityDate) {
			this.validityDate = validityDate;
		}
		public Product(String productCode, String productName, Date validityDate, Date expiryDate) {
			super();
			this.productCode = productCode;
			this.productName = productName;
			this.validityDate = validityDate;
			this.expiryDate = expiryDate;
		}
		public Date getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(Date expiryDate) {
			this.expiryDate = expiryDate;
		}
		
}
