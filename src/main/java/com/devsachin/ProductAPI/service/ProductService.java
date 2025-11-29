package com.devsachin.ProductAPI.service;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsachin.ProductAPI.ProductRepository;
import com.devsachin.ProductAPI.dto.ProductDTO;
import com.devsachin.ProductAPI.entity.ProductEntity;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	//getall
	public List<ProductEntity> getAllProducts(){
		return productRepository.findAll();
	}
	
	//getbyid
	public ProductEntity getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}
	
	//create product
	public ProductEntity createProduct(ProductDTO productDTO) {
		
		ProductEntity product = new ProductEntity();
		product.setName(productDTO.getName());
		product.setDescription(productDTO.getDescription());
		product.setCategory(productDTO.getCategory());
		product.setBrand(productDTO.getBrand());
		product.setPrice(productDTO.getPrice());
		product.setQuantity(productDTO.getQuantity());
		product.setAvailable(productDTO.isAvailable());
		product.setCreatedAt(LocalDateTime.now());
		product.setUpdatedAt(LocalDateTime.now());
		
		return productRepository.save(product);
		
	}
	
	//update
	public ProductEntity UpdateProduct(Long id, ProductDTO productDTO) {
		ProductEntity exixtingProEntity = productRepository.findById(id).orElse(null);
		
		if(exixtingProEntity == null) {
			return null;
		}
		
		exixtingProEntity.setName(productDTO.getName());
		exixtingProEntity.setDescription(productDTO.getDescription());
		exixtingProEntity.setCategory(productDTO.getCategory());
		exixtingProEntity.setBrand(productDTO.getBrand());
		exixtingProEntity.setPrice(productDTO.getPrice());
		exixtingProEntity.setQuantity(productDTO.getQuantity());
		exixtingProEntity.setAvailable(productDTO.isAvailable());
		exixtingProEntity.setUpdatedAt(LocalDateTime.now());
		
		return productRepository.save(exixtingProEntity);
	}
	
	//delete
	public boolean deleteProduct(Long id) {
		if(!productRepository.existsById(id)) {
			return false;
		}
		
		productRepository.deleteById(id);
		return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
