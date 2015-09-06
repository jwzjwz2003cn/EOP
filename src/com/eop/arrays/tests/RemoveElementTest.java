package com.eop.arrays.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.eop.arrays.RemoveElement;

public class RemoveElementTest {
	
	@Test
	public void test(){
		
		RemoveElement re = new RemoveElement();
		
		int[] a1 = {1,2,3,4,5};
		int[] a2 = new int[0];
		int[] a3 = {4,5};
		int[] a4 = {5};
		
		assertEquals("new length = 4", re.removeElement(a1, 2), 4);
		assertEquals("new length = 0", re.removeElement(a2, 0), 0);
		assertEquals("new length = 1", re.removeElement(a3, 4), 1);
		assertEquals("new length = 0", re.removeElement(a4, 5), 0);
		
	}

}
