package com.eop.arrays.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.eop.arrays.PlusOne;

public class PlusOneTest {

	@Test
	public void test(){
		
		int[] d1 = {1, 9, 9, 9, 9};
		int[] d2 = {9, 9};
		int[] d3 = {7, 8};
		
		PlusOne po = new PlusOne();
		assertTrue("should equal {2, 0, 0, 0, 0}", Arrays.equals(po.plusOne(d1), new int[] {2, 0, 0, 0, 0}));
		assertTrue("should equal {1, 0, 0}", Arrays.equals(po.plusOne(d2), new int[] {1, 0, 0}));
		assertTrue("should equal {7, 9}", Arrays.equals(po.plusOne(d3), new int[] {7, 9}));
		
	}
}
