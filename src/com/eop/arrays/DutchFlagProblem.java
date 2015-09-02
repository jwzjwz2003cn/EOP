package com.eop.arrays;

public class DutchFlagProblem {
	
	/**
	 * 
	 * 1. String with value low, medium  and high (0, 1, 2)
	 * 2. medium as pivot value
	 * 3. Keep two pointers to keep track of low and high from two end of the array
	 * 4. Iterate through array, swap the item when not equal to pivot
	 * 
	 * @param a
	 * @return
	 */
	
	private void swap(int[] a, int i, int j){
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
	
	public int[] DutchFlagPartion (int[] a) {
		
		//initialize pointers
		int pivot = 1;
		int large = a.length - 1;
		int small = 0;
		int current = 0;
		
		//main loop
		while (current < large){
			if (a[current] < pivot){
				swap (a, current++, small++);
			} else if (a[current] == pivot){
				current ++ ;
			} else {
				//current remain same
				swap (a, current, large--);
			}
		}
		
		return a;
	}
}
