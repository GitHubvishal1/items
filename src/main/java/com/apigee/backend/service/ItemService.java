package com.apigee.backend.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apigee.backend.entities.Items;
import com.apigee.backend.repository.DaoInterface;

@Service
@Transactional
public class ItemService implements ItemServiceInterface {

	@Autowired
	private DaoInterface dao;

	@Override
	public List<Items> getAllItems() {
		return dao.findAll();
	}

	@Override
	public Optional<Items> getItemsById(int orderId) {
		return dao.findById(orderId);
	}
	
	@Override
	public void removeItems(int items) {
		dao.deleteById(items);
	}

	@Override
	public Items addItems(Items items) {
		return dao.save(items);
	}

}
