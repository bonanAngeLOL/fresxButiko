package com.angelol.ecommerce.dao;

import javax.transaction.Transactional;

import com.angelol.ecommerce.entities.ProductCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Transactional
@RepositoryRestResource
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{
    

}
