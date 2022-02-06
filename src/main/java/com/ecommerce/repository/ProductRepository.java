package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ecommerce.model.product;

public interface ProductRepository extends CrudRepository<product, Integer>{
	
	
	public List<product>findBySeason(String season);
	
	public List<product>findByBrand(String brand);
	
	public List<product>findByCategory(String category);
	
	public List<product>findByPrice(Double price);
	
	public List<product>findByColor(String color);
	
	
	

}
