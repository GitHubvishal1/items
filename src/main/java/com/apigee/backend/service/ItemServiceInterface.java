package com.apigee.backend.service;

import java.util.List;
import java.util.Optional;

import com.apigee.backend.entities.Items;

public interface ItemServiceInterface {

	List<Items> getAllItems();

	Items addItems(Items items);

	Optional<Items> getItemsById(int orderId);

	void removeItems(int items);

}
