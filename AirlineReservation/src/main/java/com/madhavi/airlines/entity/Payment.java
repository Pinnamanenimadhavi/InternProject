package com.madhavi.airlines.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
private String userName;
	private String userId;
	private Integer cardNumber;
	private String cardType;
	
	public Payment() {
		
	}
	public Payment(String userName, String userId, Integer cardNumber, String cardType) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "Payment [userName=" + userName + ", userId=" + userId + ", cardNumber=" + cardNumber + ", cardType="
				+ cardType + ", getUserName()=" + getUserName() + ", getUserId()=" + getUserId() + ", getCardNumber()="
				+ getCardNumber() + ", getCardType()=" + getCardType() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
