package com.capgemini.walletapp.bean;

public class Customer {
	
	private String customerName;
	private long adharNumber;
	private String address;
	private String gender;
	private String phoneNumber;
	private int age;
	private String email;
	private String user_ID;
	private String password;
	private WalletAppDetails wallet;
	
	

	public WalletAppDetails getWallet() {
		return wallet;
	}
	public void setWallet(WalletAppDetails wallet) {
		this.wallet = wallet;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", adharNumber=" + adharNumber + ", address=" + address
				+ ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", age=" + age + ", email=" + email
				+ ", user_ID=" + user_ID + ", password=" + password + ", wallet=" + wallet + "]";
	}
	

	
	
}