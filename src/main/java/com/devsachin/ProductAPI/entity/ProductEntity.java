package com.devsachin.ProductAPI.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Products")
public class ProductEntity {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String description;
	private String category;
	private String brand;
	
	private float price;
	private int quantity;
	
	@Column(name="stock")
	private boolean available;
	
	private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
