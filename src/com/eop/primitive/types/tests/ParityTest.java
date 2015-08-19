package com.eop.primitive.types.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.eop.primitive.types.Parity;

public class ParityTest {

	@Test
	public void test() {
		Parity parity = new Parity();
		int a1 = 1;
		int a2 = 2;
		int a3 = 5;
		int a1001 = 1001;
		
		assertTrue("a1 should be true", parity.parity(a1));
		assertTrue("a2 should be true", parity.parity(a2));
		assertFalse("a3 should be false", parity.parity(a3));
		assertTrue("a1001 should be true", parity.parity(a1001));
	}

}
