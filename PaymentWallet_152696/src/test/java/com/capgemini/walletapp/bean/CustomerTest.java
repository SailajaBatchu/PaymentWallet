package com.capgemini.walletapp.bean;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {

	Customer cust = new Customer();

	public void testGetFirstName() {
		cust.setFirstName("susan");
		assertEquals("susan", cust.getFirstName());
		assertTrue("susan".equalsIgnoreCase(cust.getFirstName()));
		assertNotNull(cust);

	}

	public void testGetLastName() {
		cust.setLastName("sahara");
		assertEquals("sahara", cust.getFirstName());
		assertTrue("sahara".equalsIgnoreCase(cust.getFirstName()));
		assertNotNull(cust);

	}

	public void testGetGender() {
		cust.setGender("female");
		assertEquals("female", cust.getGender());
		assertTrue("female".equalsIgnoreCase(cust.getGender()));
		assertNotNull(cust);

	}

	public void testGetAge() {
		cust.setAge(20);
		assertEquals(20, cust.getAge());
		assertNotNull(cust);
	}

	public void testGetMobileNo() {
		cust.setMobileNo("9856321047");
		assertEquals("9856321047", cust.getMobileNo());
	}

	public void testGetEmail() {
		cust.setEmail("susansahara@gmail.com");
		assertEquals("susansahara@gmail.com", cust.getEmail());
	}

	public void testGetLocation() {
		cust.setLocation("hyderabad");
		assertEquals("hyderabad", cust.getLocation());
	}

	public void testGetAadhar() {
		cust.setAadhar(238674871);
		assertEquals(238674871, cust.getAadhar());
	}

}