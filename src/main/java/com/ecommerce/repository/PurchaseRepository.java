package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer>{

}
