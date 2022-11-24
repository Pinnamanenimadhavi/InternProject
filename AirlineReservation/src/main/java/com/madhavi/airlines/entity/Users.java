package com.madhavi.airlines.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int userId;
	private String userName;
	private String userAddress;
	private String userMail;
	private String userPassword;
	private Date userDob;
	private String userPhoneNo;
	private int flightBookingId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getUserDob() {
		return userDob;
	}
	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}
	public String getUserPhoneNo() {
		return userPhoneNo;
	}
	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}
	public int getFlightBookingId() {
		return flightBookingId;
	}
	public void setFlightBookingId(int flightBookingId) {
		this.flightBookingId = flightBookingId;
	}
	public Users(int userId, String userName, String userAddress, String userMail, String userPassword, Date userDob,
			String userPhoneNo, int flightBookingId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userMail = userMail;
		this.userPassword = userPassword;
		this.userDob = userDob;
		this.userPhoneNo = userPhoneNo;
		this.flightBookingId = flightBookingId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userMail="
				+ userMail + ", userPassword=" + userPassword + ", userDob=" + userDob + ", userPhoneNo=" + userPhoneNo
				+ ", flightBookingId=" + flightBookingId + "]";
	}
	
	

}
