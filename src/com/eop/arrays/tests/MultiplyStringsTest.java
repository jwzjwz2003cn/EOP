package com.eop.arrays.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.eop.arrays.MultiplyStrings;

public class MultiplyStringsTest {

	@Test
	public void test() {

		MultiplyStrings ms = new MultiplyStrings();
		String num1 = "29";
		String num2 = "28";
		
		String num3 = "-29";
		String num4 = "28";
		String results = ms.multiply(num1, num2);
		String results2 = ms.multiply(num3, num4);
		System.out.println(results);
		System.out.println(results2);
		assertTrue("-612 should be the result", ms.multiply(num3, num4).equals("-612"));

	}
	
}
