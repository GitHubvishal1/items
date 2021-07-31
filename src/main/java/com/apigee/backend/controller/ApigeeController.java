package com.apigee.backend.controller;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apigee.backend.service.ItemService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/orders") // optional
public class ApigeeController {

	@Autowired
	private ItemService service;

	@GetMapping("/") //http://localhost:5050/orders/
	public Map<Integer, String> getItems() {
		return this.service.getItems();
	}

	@GetMapping("/{tid}") // http://localhost:5050/orders/1
	public List<Entry<Integer, String>> getItemById(@PathVariable("tid") int orderId) {
		return this.service.getItems(orderId);
	}

}
