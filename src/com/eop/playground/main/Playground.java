package com.eop.playground.main;

public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(a & (a-1)));
		System.out.println(Integer.toBinaryString(a & ~(a-1)));
	}

}
