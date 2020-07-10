package com.chandra.springboot.model;

public class Customer {
	
	private int customerNo;
	private String customerName;
	private String country;
	
	public Customer() {}

	public Customer(int customerNo, String customerName, String country) {
		this.customerNo = customerNo;
		this.customerName = customerName;
		this.country = country;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
