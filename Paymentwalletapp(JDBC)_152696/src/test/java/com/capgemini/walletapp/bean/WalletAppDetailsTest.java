package com.capgemini.walletapp.bean;

import junit.framework.TestCase;

public class WalletAppDetailsTest extends TestCase {
	
	WalletAppDetails details=new WalletAppDetails();
	

	public void testGetAccountNumber() {
		details.setAccountNumber(165243);
		assertEquals(123456,details.getAccountNumber());
	}
	
	public void testGetDate() {
		assertNull(details.getDate());
		
	}

	public void testGetAmount() {
		details.setAmount(2000);
		assertEquals(2000.0,details.getAmount());
	}

	public void testGetTid() {
		details.setTid(12345);
		assertEquals(12345,details.getTid());
	}

}