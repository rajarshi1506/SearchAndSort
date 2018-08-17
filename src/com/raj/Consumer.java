package com.raj;

import java.util.Arrays;

import com.raj.search.SearchFactory;
import com.raj.search.SearchModes;
import com.raj.sort.SortFactory;
import com.raj.sort.SortModes;

public class Consumer {

	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 1, 3, 4, 6, 3, 5, 8, 7 , 11, 2, 2, 1, 1, 6, 7};
		arr = SortFactory.getSortType(SortModes.MERGE).sort(arr);
		System.out.println(Arrays.toString(arr));
		Integer searchIndex = SearchFactory.getSearchType(SearchModes.BINARY).search(arr, 8);
		System.out.println("index of input:::" + searchIndex);
	}

}
