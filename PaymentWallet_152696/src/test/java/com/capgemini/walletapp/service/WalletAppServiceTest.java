package com.capgemini.walletapp.service;

import com.capgemini.walletapp.bean.WalletAppDetails;

import junit.framework.TestCase;

public class WalletAppServiceTest extends TestCase {

	WalletAppDetails details;
	
	WalletAppService service=new WalletAppService();
	
	public void testCreateAccount() {
		
		
		assertEquals(0,service.createAccount(details) );
		assertNull(details);
		assertTrue(true);
		
		
	}

	public void testDeposit() {
		
		assertEquals(0,service.deposit(2000));
		assertTrue(true);
		assertNull(details);
		
	}

	public void testWithdraw() {
		
		assertEquals(0,service.withdraw(3000));
		assertTrue(true);
		assertNull(details);
		
	}

	public void testFundTransfer() {
		
		assertEquals(0,service.fundTransfer(184512336, 783783783));
		assertNull(details);
		
	}

	public void testLogin() {
		
		assertEquals(false,service.login(details));
		
	}

	public void testShowBalance() {
		
		assertEquals(5000,5000);
		
	}

}