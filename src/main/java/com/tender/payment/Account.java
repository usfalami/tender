package com.tender.payment;

import java.util.Date;

public class Account {

	private int id;
	private String cardtype;
	private int cardNumber;
	private Date expirationDate;
	private int cvx;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public int getCvx() {
		return cvx;
	}
	public void setCvx(int cvx) {
		this.cvx = cvx;
	};
}
