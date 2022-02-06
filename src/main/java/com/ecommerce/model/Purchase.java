package com.ecommerce.model;


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  


@Entity
@Table(name= "purchase_items")   
public class Purchase { 


	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "purchase_id")
	private int purchaseId;
	
	@Column(name = "product_id")
	private int productId;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "qty")
	private int qty;

	

	public long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	

	public void setQty(int qty) {
		this.qty = qty;
	}

	

	public Purchase(int purchaseId, int productId, int userId, BigDecimal price, int qty) {
		super();
		this.purchaseId = purchaseId;
		this.productId = productId;
		this.userId = userId;
		this.price = price;
		this.qty = qty;
		
	}

	public Purchase() {
		
	}


	
	

}
