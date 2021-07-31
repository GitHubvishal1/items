package com.apigee.backend.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class ItemService implements ItemServiceInterface {

	// List<Items> list;
	Map<Integer, String> map;

	public ItemService() {
//		list = new ArrayList<>();
//		list.add(new Items(1, "soap"));
//		list.add(new Items(2, "toothbrush"));
//		list.add(new Items(3, "handwash"));
//		list.add(new Items(1, "wash"));

		map = new HashMap<>();
		map.put(1, "soap");
		map.put(2, "toothbrush");
		map.put(3, "wash");
	}

	@Override
	public Map<Integer, String> getItems() {
		return map;
	}

	public List<Entry<Integer, String>> getItems(int orderId) {
		return map.entrySet().stream().filter(map -> map.getKey() == orderId).collect(Collectors.toList());
		// return list.stream().filter(list -> list.getId() == orderId).collect(Collectors.toList());

	}

}
