package com.raj.sort;

/**
 * 
 * @author Urjasri creates a pivot (middle element) moves all numbers greater
 *         than pivot to right moves all numbers smaller than pivot to left
 *         repeats this step recursively till the whole array is traversed
 */

public class QuickSort implements Sort {
	private Integer[] arr;

	@Override
	public Integer[] sort(Integer[] arr) {
		this.arr = arr;
		quickSort(0, arr.length - 1);
		return arr;
	}

	private void quickSort(int lowIndex, int highIndex) {
		int i = lowIndex;
		int j = highIndex;

		int pivot = arr[(lowIndex + highIndex) / 2];
		while (i <= j) {

			//check if element is smaller than pivot, if so, please move to next element
			while (arr[i] < pivot)
				i++;
			//check if element is greater than pivot, if so, please move to previous element
			while (arr[j] > pivot)
				j--;

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				// move to next index
				i++;
				// move to previous index
				j--;
			}
		}
		if (i < highIndex)
			quickSort(i, highIndex);
		if (j > lowIndex)
			quickSort(lowIndex, j);
	}

}
