package com.eop.primitive.types;

public class Parity {
	/**
	 * given an integer assuming unsigned, return true 
	 * if number of 1s is odd 
	 * @param a
	 * @return
	 * 
	 * use xor operator ^
	 * 0^0 = 1^1 = 0 
	 * 0^1 = 1^0 = 1
	 * 
	 */
	public boolean parity(long a) {
		
		int parity = 0;
		System.out.println(Long.toBinaryString(a));
		while (a != 0){
			parity ^= (a & 1); 
			a >>= 1;
		}
		return parity == 1;
		
	}

}
