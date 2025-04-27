package com.springdemo.spring_mvc_thymeleaf_0.repository;

import com.springdemo.spring_mvc_thymeleaf_0.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
