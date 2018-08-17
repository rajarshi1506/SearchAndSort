package com.raj.sort;

public class MergeSort implements Sort {

	Integer[] arr;
	Integer[] tempArr;

	@Override
	public Integer[] sort(Integer[] arr) {
		this.arr = arr;
		//create empty array of same size
		this.tempArr = new Integer[arr.length];

		mergeSort(0, arr.length - 1);
		return arr;
	}

	private void mergeSort(int lowIndex, int highIndex) {

		//check if more than one element, then break and merge
		if (lowIndex < highIndex) {
			int midIndex = (lowIndex + highIndex) / 2;
			//call on part 1
			mergeSort(lowIndex, midIndex);
			//call on part 2
			mergeSort(midIndex + 1, highIndex);
			//merge 2 parts
			mergeParts(lowIndex, midIndex, highIndex);
		}

	}

	private void mergeParts(int lowIndex, int midIndex, int highIndex) {
		// copy part to temp array(same index in both arrays)
		for (int i = lowIndex; i <= highIndex; i++) {
			tempArr[i] = arr[i];
		}
		// start index of part 1
		int i = lowIndex;
		// start index of part 2
		int j = midIndex + 1;
		// index of final array
		int k = lowIndex;

		while (i <= midIndex && j <= highIndex) {
			if (tempArr[i] <= tempArr[j]) {
				// assign smaller number from part 1
				arr[k] = tempArr[i];
				i++;
			} else {

				// assign smaller number from part 2
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		// to handle greater numbers in part 1 than all numbers in part 2
		// as the above loop always returns false, so will not be copied to correct
		// place in final array
		// so need this step
		while (i <= midIndex) {
			arr[k] = tempArr[i];
			i++;
			k++;
		}

	}
}
