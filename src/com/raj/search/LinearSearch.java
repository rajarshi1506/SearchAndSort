package com.raj.search;

public class LinearSearch implements Search {

	@Override
	public Integer search(Integer[] arr, Integer input) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == input)
				return i;
		}
		return -1;
	}

}
