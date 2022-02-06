package com.ecommerce.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;

@RestController
public class ProductController {



	@Autowired
	ProductService service;
	
	// retrieve all products from database
	@GetMapping("/products")
	public List<product> list()
	{
		
		return service.listAll();
	}
	
	// insert new product into product table
	@PostMapping("/products")
	public void addProduct(@RequestBody product prod)
	{
		service.saveProduct(prod);
	}
	
	//get particular product by their ID
	@GetMapping("/products/{id}")
	public ResponseEntity<product> getProduct(@PathVariable Integer id)
	{
		try {
			product prod= service.getProduct(id);
			return new ResponseEntity<product>(prod,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<product>(HttpStatus.NOT_FOUND);
		}
	}
	
	//get particular product by their season
		@GetMapping("/products/season/{season}")
		public List<product> findBySeason(@PathVariable String season)
		{
			try {
				List<product> prod= service.findBySeason(season);
				return prod;
			} catch (NoSuchElementException e) {
				return (List<product>) new ResponseEntity<product>(HttpStatus.NOT_FOUND);
			}
		}
		

		
		//get particular product by their brand
		
		@GetMapping("/products/brand/{brand}")
		public List<product> findByBrand(@PathVariable String brand)
		{
			try {
				List<product> prod= service.findByBrand(brand);
				return prod;
			} catch (NoSuchElementException e) {
				return (List<product>) new ResponseEntity<product>(HttpStatus.NOT_FOUND);
			}
		}		

		//get particular product by their category
		@GetMapping("/products/category/{category}")
		public List<product> findByCategory(@PathVariable String category)
		{
			try {
				List<product> prod= service.findByCategory(category);
				return prod;
			} catch (NoSuchElementException e) {
				return (List<product>) new ResponseEntity<product>(HttpStatus.NOT_FOUND);
			}
		}	
		
		//get particular product by their price
		@GetMapping("/products/price/{price}")
		public List<product> findByPrice(@PathVariable Double price)
		{
			try {
				List<product> prod= service.findByPrice(price);
				return prod;
			} catch (NoSuchElementException e) {
				return (List<product>) new ResponseEntity<product>(HttpStatus.NOT_FOUND);
			}
		}	
		
		//get particular product by their color
		@GetMapping("/products/color/{color}")
		public List<product> findByColor(@PathVariable String color)
		{
			try {
				List<product> prod= service.findByColor(color);
				return prod;
			} catch (NoSuchElementException e) {
				return (List<product>) new ResponseEntity<product>(HttpStatus.NOT_FOUND);
			}
		}
		
	
	// update existing product
	@PutMapping("products/{id}")
	public ResponseEntity<?> update(@RequestBody product prod, @PathVariable Integer id){
	
		try {
			product prodExists = service.getProduct(id);
			service.saveProduct(prod);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	// delete particular student from database
	@DeleteMapping("products/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		service.deleteProduct(id);
	}
}
