package com.eop.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindPrimes {
	
	
	/**
	 * smallest prime is 2
	 * use a boolean array to keep track of primes
	 * initially set all entries to true **
	 * the multiples of a prime < n is definitely not a prime
	 * 
	 * 
	 */
	
    public int countPrimes(int n) {
        
    	boolean[] isPrime = new boolean[n];
    	List<Integer> primes = new ArrayList<Integer>();
    	int count = 0;
    	for (int i = 2; i < n; i++){
    		isPrime[i] = true;       //important, initial condition
    	}
    	for (int i = 2; i <n; i++) {
    		if (isPrime[i]){
    			++count;
    			primes.add(i);
    			for (int j = i; j <n; j+=i){  //set false to multiples of a prime
    				isPrime[j] = false;
    			}
    		}
    	}
    	System.out.println(primes.toString());
    	return count;
    }

}
