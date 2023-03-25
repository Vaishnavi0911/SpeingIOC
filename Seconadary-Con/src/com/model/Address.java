package com.model;

public class Address {

	private String city;
	
	private int pincode;

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}

	public Address(String city, int pincode) {
		
		this.city = city;
		this.pincode = pincode;
	}
}
