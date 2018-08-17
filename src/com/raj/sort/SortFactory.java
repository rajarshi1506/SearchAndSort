package com.raj.sort;

public class SortFactory {

	private SortFactory() {
	};

	public static Sort getSortType(SortModes mode) {
		switch (mode) {

		case BUBBLE:
			return new BubbleSort();
		case SELECTION:
			return new SelectionSort();
		case INSERTION:
			return new InsertionSort();
		case QUICK:
			return new QuickSort();
		case MERGE:
			return new MergeSort();
		default:
			return null;
		}
	}
}
