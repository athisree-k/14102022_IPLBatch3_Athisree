package com.experion.entity;

import java.util.Date;

import com.experion.services.ElectronicServices;

public  class Electronics extends Product implements ElectronicServices{

	private Date warranty;
	private String serviceCharge;
	
	public Date getWarranty() {
		return warranty;
	}
	public void setWarranty(Date warranty) {
		this.warranty = warranty;
	}
	public String getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public Electronics(String productCode, String productName, String productType, Date  warranty,
			String serviceCharge) {
		super(productCode, productName, productType);
		this.warranty = warranty;
		this.serviceCharge = serviceCharge;
	}
	@Override
	public void warrantyReplacement() {
		// TODO Auto-generated method stub
		System.out.println("warranty available product replaced.");
	}
	@Override
	public void productRepair() {
		// TODO Auto-generated method stub
		System.out.println("Repair product service provided.");
	}
	

}
