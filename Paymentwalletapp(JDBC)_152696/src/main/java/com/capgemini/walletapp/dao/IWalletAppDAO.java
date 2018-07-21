package com.capgemini.walletapp.dao;

import com.capgemini.walletapp.bean.Customer;

public interface IWalletAppDAO {
	
	public boolean createAccount(Customer customer);
	public boolean login(String username,String password);
	public double showBalance();
	public boolean deposit(double amount);
	public boolean withdraw(double amount);
	public boolean fundTransfer(long accNo,double amount);
	public void printTrans();

}