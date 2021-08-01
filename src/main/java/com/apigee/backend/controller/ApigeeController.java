package com.apigee.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apigee.backend.entities.Items;
import com.apigee.backend.service.ItemServiceInterface;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ApigeeController {

	@Autowired
	private ItemServiceInterface service;

	@GetMapping("/") //http://localhost:5050/orders/
	public List<Items> getItems() {
		return this.service.getAllItems();
	}
	
	@GetMapping("/get/{tid}") // http://localhost:5050/orders/1
	public Optional<Items> getItemById(@PathVariable("tid") int orderId) {
		return this.service.getItemsById(orderId);
	}

	@PostMapping("/add") // http://localhost:5050/Employee/addEmployee
	public Items addEmployee(@RequestBody Items items) {
		return service.addItems(items);
	}
	
	@DeleteMapping("/delete/{tid}") // http://localhost:5050/Employee/deleteEmployee/1
	public String deleteEmployee(@PathVariable("tid") int items) {
		service.removeItems(items);
		return "deleted successfully";
	}

}
