package com.eop.arrays.tests;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.eop.arrays.DutchFlagProblem;

public class DutchFlagProblemTest {

	@Test
	public void test(){
		DutchFlagProblem dfp = new DutchFlagProblem();
		int[] a = {0, 1, 2, 2, 0, 1, 1, 0, 2};
		int[] b = dfp.DutchFlagPartion(a);
		System.out.println(Arrays.toString(b));
		int[] c = {0, 0, 0, 1, 1, 1, 2, 2, 2};
		assertTrue("b should be sorted", Arrays.equals(b, c));
	}
}
