package com.capgemini.walletapp.service;

import junit.framework.TestCase;

public class WalletAppValidationTest extends TestCase {
	WalletAppValidation v=new WalletAppValidation();
	
	public void testIsValidCustomername() {
		assertEquals(false,v.isValidcustomername(""));
		assertEquals(true, v.isValidcustomername("susan"));
	}

	public void testIsValidGender() {
		assertEquals(false,v.isValidGender(""));
		assertEquals(true, v.isValidGender("Female"));
	}

	public void testIsValidPhoneNumber() {
		assertEquals(false,v.isValidphoneNumber(""));
		assertEquals(true, v.isValidphoneNumber("8985901368"));
	}

	public void testIsValidAge() {
		assertEquals(false,v.isValidAge(12));
		assertEquals(true, v.isValidAge(17));
	}

	public void testIsValidEmail() {
		assertEquals(false,v.isValidEmail(""));
		assertEquals(true,v.isValidEmail("saharas@12.com"));
	}

	public void testIsValidUsername() {
		assertEquals(false,v.isValidUsername(""));
		assertEquals(true,v.isValidUsername("12345"));
	}

	public void testIsValidPassword() {
		assertEquals(false,v.isValidPassword(""));
		assertEquals(true,v.isValidPassword("12345"));
	}

	public void testIsValidAmount() {
		assertEquals(false,v.isValidAmount(0));
		assertEquals(true,v.isValidAmount(1250));
		
	}

}