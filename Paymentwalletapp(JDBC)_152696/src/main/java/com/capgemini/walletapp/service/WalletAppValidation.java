package com.capgemini.walletapp.service;

public class WalletAppValidation {
	
	public boolean isValidcustomername(String customerName)
	{
		if(customerName.isEmpty())
		{
			System.err.println("LastName should not be empty");
			return false;
		}
		
		return true;
		
	}
	public boolean isValidGender(String gender)
	{
		if(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female"))
		{
			return true;
		}
		return false;
		
	}
	public boolean isValidphoneNumber(String phoneNumber)
	{
		if(phoneNumber.length()==10)
		{
			return true;
		}
		return false;
		
	}
	public boolean isValidAge(int age)
	{
		if(age<15)
		{
			System.err.println("Age should be greater than 15");
			return false;
		}
		return true;
		
	}
	public boolean isValidEmail(String email)
	{
		
		if(email.isEmpty()||!(email.endsWith(".com")))
		{
			System.err.println("Email should not be emptyand should end with .com");
			return false;
		}
		return true;
		
	}
	public boolean isValidUsername(String username)
	{
		if(username.isEmpty())
		{
			System.err.println("UserName should not be empty");
			return false;
		}
		return true;
		
	}
	public boolean isValidPassword(String password)
	{
		if(password.isEmpty())
		{
			System.err.println("password should not be empty");
			return false;
		}
		return true;
		
	}
	public boolean isValidAmount(double amount)
	{
		if(amount<=0)
		{
			System.err.println("Amount should be greater than 0");
			return false;
		}
		return true;
		
	}

}