package com.raj.search;

public class BinarySearch implements Search {

	@Override
	public Integer search(Integer[] arr, Integer input) {
		int start = 0;
		int end = arr.length ;

		while (start < end) {
			int mid = (start + end -1) / 2;
			if (input == arr[mid])
				return mid;
			else if (input > arr[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}

}
