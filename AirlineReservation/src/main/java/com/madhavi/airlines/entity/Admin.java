package com.madhavi.airlines.entity;

public class Admin {
	private Integer adminId;
	private  String password;
	public Admin(Integer adminId, String password) {
		super();
		this.adminId = adminId;
		this.password = password;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", password=" + password + "]";
	}
	

}
