package com.eop.arrays.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.eop.arrays.JumpGame;

public class JumpGameTest {

	@Test
	public void test() {
		
		JumpGame jg = new JumpGame();
		int[] a = {0, 1};
		assertFalse("should be false", jg.canJump(a));
		int[] b = {2,3,1,1,4};
		assertTrue("should be true", jg.canJump(b));
		
	}
}
