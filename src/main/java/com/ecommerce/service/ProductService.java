package com.ecommerce.service;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.model.product;
import com.ecommerce.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	//private String season;
	
	public List<product> listAll() {
        return (List<product>) productRepository.findAll();
    }
	
	
    public void saveProduct(product prod) {
    	productRepository.save(prod);
    }

   public product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }


    public void deleteProduct(Integer id) {
    	productRepository.deleteById(id);
    }

	public List<product> findBySeason(String season) {
		return productRepository.findBySeason(season);
	}
	
	public List<product> findByBrand(String brand) {
		return productRepository.findByBrand(brand);
	}
	
	public List<product> findByCategory(String category) {
		return productRepository.findByCategory(category);
	}
	
	public List<product> findByPrice(Double price) {
		return productRepository.findByPrice(price);
	}


	public List<product> findByColor(String color) {
		return productRepository.findByColor(color);
	}

}
