package com.fibonacci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciControllerTest {
	
	FibonacciController controller;
	
	@Before
	public void init() {
		controller = new FibonacciController();
	}
	

	@Test
	public void returnFibonnaciNullTest() {
		String s = controller.returnFibonnaci(null);
		assertTrue(s.equals("Number not present"));
		String s1 = controller.returnFibonnaci("");
		assertTrue(s1.equals("Number not present"));
		String s2 = controller.returnFibonnaci("abc");
		assertTrue(s2.equals("Enter a valid number"));
	}
	
	@Test
	public void returnFibonnaciValid() {
		String s = controller.returnFibonnaci("5");
		assertTrue(s.equals("0,1,1,2,3"));
	}

}
