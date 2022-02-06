package com.ecommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class product {
	
	  @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name = "product_id")
	  int product_id;
	
	  @Column(name = "season")
	  String season;
	  
	  @Column(name = "brand")
	  String brand;
	  
	  @Column(name = "category")
	  String category;
	  
	  @Column(name = "price")
	  double price;
	  
	  @Column(name = "color")
	  String color;
	  
	  @Column(name = "created_date")
	  String created_date;
	  
	  @Column(name = "discount")
	  float discount;
	  
	public int getProductId() {
		return product_id;
	}
	public void setProductId(int productId) {
		this.product_id = productId;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreatedDate(String createdDate) {
		this.created_date = createdDate;
	}
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	
	
	
	public product() {
		
	}
	public product(int product_Id, String season, String brand, String category, double price, String color,
			String created_Date, float discount) {
		super();
		this.product_id = product_Id;
		this.season = season;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.color = color;
		this.created_date = created_Date;
		this.discount = discount;
	}
	
	
	  
}
