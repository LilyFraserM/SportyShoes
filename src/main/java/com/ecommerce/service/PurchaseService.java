package com.ecommerce.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.model.Purchase;
import com.ecommerce.model.product;
import com.ecommerce.repository.PurchaseRepository;
 


@Service
@Transactional
public class PurchaseService {

	 @Autowired
	 private PurchaseRepository purchaseRepository;

	 public List<Purchase> listAll() {
	        return purchaseRepository.findAll();
	    }
	 
		public void savePurchase(Purchase purchase) {
			purchaseRepository.save(purchase);
		}

	 
}

