package com.eop.arrays.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.eop.arrays.RemoveDuplicates;

public class RemoveDuplicatesTest {
	
	@Test
	public void test() {
		
		RemoveDuplicates rd = new RemoveDuplicates();
			
			int[] a1 = {};
			int[] a2 = {1,2,2,3};
			int[] a3 = {2};
			int[] a4 = {2,2};
			
			assertEquals("new length should be 0", rd.removeDuplicates(a1), 0);
			assertEquals("new length should be 3", rd.removeDuplicates(a2), 3);
			assertEquals("new length should be 1", rd.removeDuplicates(a3), 1);
			assertEquals("new length should be 1", rd.removeDuplicates(a4), 1);
			
	}

}
