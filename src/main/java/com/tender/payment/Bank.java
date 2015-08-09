package com.tender.payment;

import com.tender.bean.Adress;

public class Bank {

	public String getCodeBank() {
		return codeBank;
	}
	public void setCodeBank(String codeBank) {
		this.codeBank = codeBank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adress getAddress() {
		return address;
	}
	public void setAddress(Adress address) {
		this.address = address;
	}
	private String codeBank;
	private String name;
	private Adress address;
	
	
}
