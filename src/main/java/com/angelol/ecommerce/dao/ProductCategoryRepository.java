package com.angelol.ecommerce.dao;

import javax.transaction.Transactional;

import com.angelol.ecommerce.entities.ProductCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@Transactional
@RepositoryRestResource
@CrossOrigin
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{
    

}
