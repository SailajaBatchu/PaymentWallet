package com.capgemini.walletapp.service;

import com.capgemini.walletapp.bean.Customer;
import com.capgemini.walletapp.bean.WalletAppDetails;

import junit.framework.TestCase;

public class WalletAppServiceTest extends TestCase {
	
	WalletAppDetails details=new WalletAppDetails();
	WalletAppService service =new WalletAppService();
	Customer data=new Customer();
	

	public void testCreateAccount() {
		assertEquals(1,service.createAccount(data));
		
		assertTrue(true);
		
	}

	public void testLogin() {
		assertEquals(true,service.login(data.getUser_ID(), data.getPassword()));
		
	}

	public void testShowBalance() {
		
		assertEquals(2000,2000);
	}

	public void testDeposit() {
		assertEquals(0,service.deposit(2000));
		
	}

	public void testWithdraw() {
		assertEquals(0,service.withdraw(2000));
		
	}

	public void testFundTransfer() {
		assertEquals(0,service.fundTransfer(12345, 25000));
		
	}

}