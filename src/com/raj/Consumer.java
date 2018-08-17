package com.raj;

import com.raj.search.SearchFactory;
import com.raj.search.SearchModes;

public class Consumer {

	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 1, 2, 3, 4 };
		Integer searchIndex = SearchFactory.getSearchType(SearchModes.BINARY).search(arr, 30);
		System.out.println("index of input:::" + searchIndex);
	}

}
