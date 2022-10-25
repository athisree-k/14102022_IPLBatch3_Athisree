package com.experion.entity;

import com.experion.services.ElectronicServices;

public  class Electronics extends Product implements ElectronicServices{

	private String warranty;
	private String serviceCharge;
	
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public Electronics(String productCode, String productName, String productType, String warranty,
			String serviceCharge) {
		super(productCode, productName, productType);
		this.warranty = warranty;
		this.serviceCharge = serviceCharge;
	}
	@Override
	public void warrantyReplacement() {
		// TODO Auto-generated method stub
		System.out.println("warranty replaced.");
	}
	@Override
	public void productRepair() {
		// TODO Auto-generated method stub
		System.out.println("Repair product service provided.");
	}
	

}
