package com.eop.arrays.tests;

import org.junit.Test;

import com.eop.arrays.Permutations;

public class PermutationsTest {
	
	@Test
	public void testApplyPermutation(){
		
		int[] perm = {2, 0, 3, 1};
		int[] nums = {0, 1, 2, 3};
		int[] nums2 = {6, 2, 1, 5, 4, 3, 0};
		Permutations p = new Permutations();
		p.applyPermutation(perm, nums);
		p.nextPermutation(nums2);
	}

}
