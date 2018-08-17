package com.raj.search;

public class SearchFactory {

	private SearchFactory() {
	};

	public static Search getSearchType(SearchModes mode) {
		switch (mode) {
		case LINEAR:
			return new LinearSearch();
		case BINARY:
			return new BinarySearch();
		}
		return null;
	}

}
