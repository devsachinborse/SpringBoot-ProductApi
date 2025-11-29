package com.devsachin.ProductAPI;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsachin.ProductAPI.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

}
