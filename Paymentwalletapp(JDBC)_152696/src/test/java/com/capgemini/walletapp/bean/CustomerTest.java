package com.capgemini.walletapp.bean;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {
	
	Customer data=new Customer();

	public void testGetCustomerName() {
		data.setCustomerName("Susan");
		assertEquals("Susan",data.getCustomerName());
		assertTrue("Susan".equalsIgnoreCase(data.getCustomerName()));
		assertNotNull(data);
	}

	public void testGetGender() {
		data.setGender("Female");
		assertEquals("Female",data.getGender());
	}

	public void testGetPhoneNumber() {
		data.setPhoneNumber("8985901368");
		assertEquals("8985901368",data.getPhoneNumber());
		
	}

	public void testGetAge() {
		data.setAge(21);
		assertEquals(21,data.getAge());
	}

	public void testGetEmail() {
		data.setEmail("saharasusan@cap.com");
		assertEquals("saharasusan@cap.com",data.getEmail());
		
	}

	public void testGetUser_ID() {
		data.setUser_ID("Sahar21");
		assertEquals("Sahara21",data.getUser_ID());
		
	}

	public void testGetPassword() {
		data.setPassword("Susan@21");
		assertEquals("Susan@21",data.getPassword());
		
	}

}