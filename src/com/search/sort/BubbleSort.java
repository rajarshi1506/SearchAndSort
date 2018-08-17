package com.search.sort;

/**
 * 
 * @author Urjasri
 *
 *
 */
public class BubbleSort implements Sort {

	@Override
	public Integer[] sort(Integer[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			//compare 2 adjacent elements and swipe if required
			//repeat this step n-1 times
			//so n*(n-1) is the complexity
			for (int j = i; j < arr.length - 1; j++) {
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
