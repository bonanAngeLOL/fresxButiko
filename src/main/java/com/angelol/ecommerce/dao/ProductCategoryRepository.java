package com.angelol.ecommerce.dao;

import com.angelol.ecommerce.entities.ProductCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
@RepositoryRestResource(path="categories", collectionResourceRel = "productCategory")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{}
