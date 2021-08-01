package com.apigee.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apigee.backend.entities.Items;

@Repository
public interface DaoInterface extends JpaRepository<Items, Integer>{
}
