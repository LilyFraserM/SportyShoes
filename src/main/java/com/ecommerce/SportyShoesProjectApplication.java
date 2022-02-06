package com.ecommerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.model.product;
import com.ecommerce.repository.ProductRepository;


@SpringBootApplication
public class SportyShoesProjectApplication {
	//@Autowired
	//ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesProjectApplication.class, args);
		
		//ProductRepository.findBySeason(season);
		//List<product> allProd = ProductRepository.getAllProducts();
		
		//productRepository.getProductBySeason()
	}
	
}
