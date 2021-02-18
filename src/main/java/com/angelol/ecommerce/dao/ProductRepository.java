package com.angelol.ecommerce.dao;

import com.angelol.ecommerce.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{ }
