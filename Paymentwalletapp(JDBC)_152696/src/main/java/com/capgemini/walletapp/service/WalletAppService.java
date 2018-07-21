package com.capgemini.walletapp.service;

import java.util.List;
import java.util.Map;

import com.capgemini.walletapp.bean.Customer;
import com.capgemini.walletapp.bean.WalletAppDetails;
import com.capgemini.walletapp.dao.WalletAppDao;

public class WalletAppService implements IWalletAppService {
	
	WalletAppDao dao=new WalletAppDao();
	Customer customer = new Customer();
	
	
	public boolean createAccount(Customer customer) {
		// TODO Auto-generated method stub
		return dao.createAccount(customer);
	}
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return dao.login(username, password);
	}
	public double showBalance() {
		// TODO Auto-generated method stub
		return dao.showBalance();
	}
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		return dao.deposit(amount);
	}
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(amount);
	}
	public boolean fundTransfer(long accNo, double amount) {
		// TODO Auto-generated method stub
		return dao.fundTransfer(accNo, amount);
	}
	public void printTrans() {
		// TODO Auto-generated method stub
		dao.printTrans();
	}

}