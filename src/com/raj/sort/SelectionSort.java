package com.raj.sort;

/**
 * 
 * @author Urjasri get the smallest and put it in first index of unsorted
 *         subarray repeat the same step starting from the next index till the
 *         end of the array n*(n-1)complexity
 */
public class SelectionSort implements Sort {

	@Override
	public Integer[] sort(Integer[] arr) {

		// loop n times
		for (int j = 0; j < arr.length; j++) {
			int smallestIndex = j;
			// loop n-1 to 1 times
			for (int i = j; i < arr.length - 1; i++) {

				// get the smallest element
				if (arr[smallestIndex] > arr[i + 1]) {
					smallestIndex = i + 1;
				}
			}

			// swipe the first element of the unsorted sub array with the smallest value
			if (smallestIndex != j) {
				int temp = arr[j];
				arr[j] = arr[smallestIndex];
				arr[smallestIndex] = temp;
			}
		}
		return arr;
	}

}
