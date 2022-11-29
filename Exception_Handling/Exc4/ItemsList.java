package com.yash.exc4;

import java.util.Map;

public class ItemsList {
	
	private static Map<Integer, Item> itemsMap;

	public static Map<Integer, Item> getItemsMap() {
		return itemsMap;
	}

	public void setItemsMap(Map<Integer, Item> itemsMap) {
		ItemsList.itemsMap = itemsMap;
	}
}
