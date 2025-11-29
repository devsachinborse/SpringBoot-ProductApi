package com.devsachin.ProductAPI.controller;

import java.util.List;

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

import com.devsachin.ProductAPI.dto.ProductDTO;
import com.devsachin.ProductAPI.entity.ProductEntity;
import com.devsachin.ProductAPI.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductEntity>> getAllProducts(){
		return ResponseEntity.ok(productService.getAllProducts());
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<ProductEntity> getProductById(@PathVariable Long id){
		ProductEntity product = productService.getProductById(id);
		if(product == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(product);
	}
	
	@PostMapping("/product")
	public ResponseEntity<ProductEntity> createProduct(@RequestBody ProductDTO productDTO){
		ProductEntity product =  productService.createProduct(productDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}
	
	@PutMapping("/product/{id}")
	public ResponseEntity<ProductEntity>updateProduct( @PathVariable Long id, @RequestBody ProductDTO productDTO){
		
		ProductEntity updateProduct = productService.UpdateProduct(id, productDTO);
		if(updateProduct == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(updateProduct);
	}
	
	
	@DeleteMapping("product/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long id){
		
		boolean deletedProduct = productService.deleteProduct(id);
		
		if(!deletedProduct) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.noContent().build();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
