package com.ecommerce.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Purchase;
import com.ecommerce.service.PurchaseService;


@RestController
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService; 
	
	@GetMapping("/purchases")
	public List<Purchase> list() {
        return purchaseService.listAll();
    }
	
  
}
