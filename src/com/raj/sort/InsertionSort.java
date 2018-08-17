package com.raj.sort;

/**
 * 
 * @author Urjasri
 * 1, 3, 2, 1, 6, 8, 7
 * 1 and 3 compared, no sort required
 * 3 and 2 compared, sorted
 * 1 and 2 compared, no sort required (1, 2, 3, 1, 6, 8, 7)
 * 3 and 1 compared, sorted
 * 1 and 2 compared, sorted
 * 1 and 1 compared, no sort required (1, 1, 2, 3, 6, 8, 7)
 * 3 and 6 compared, no sort
 * 6 and 8, no sort
 * 8 and 7 , sorted (1, 1, 2, 3, 6, 7, 8)
 * 
 *
 */
public class InsertionSort implements Sort {

	@Override
	public Integer[] sort(Integer[] arr) {
		for (int i = 1; i < arr.length; i++) {
			//sort subarrays as you go
			for (int j = i-1; j > 0; j--) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

}
