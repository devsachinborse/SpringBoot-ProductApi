package com.devsachin.ProductAPI.dto;


import lombok.Data;

@Data
public class ProductDTO {
	private String name;
    private String description;
    private String category;
    private String brand;
	
    private float price;
	private int quantity;
	
	private boolean available;
}
