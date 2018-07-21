package com.capgemini.walletapp.service;
/*
import java.util.List;
import java.util.Map;
*/
import com.capgemini.walletapp.bean.Customer;
/*import com.capgemini.walletapp.bean.WalletAppDetails;*/

public interface IWalletAppService {
	
	public boolean createAccount(Customer customer);
	public boolean login(String username,String password);
	public double showBalance();
	public boolean deposit(double amount);
	public boolean withdraw(double amount);
	public boolean fundTransfer(long accNo,double amount);
	public void printTrans();

}