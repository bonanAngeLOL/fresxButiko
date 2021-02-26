package com.angelol.ecommerce.config;

import java.math.BigDecimal;

import com.angelol.ecommerce.dao.ProductCategoryRepository;
import com.angelol.ecommerce.dao.ProductRepository;
import com.angelol.ecommerce.entities.Product;
import com.angelol.ecommerce.entities.ProductCategory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class LoadDB{
    
    private static final Logger log = LoggerFactory.getLogger(LoadDB.class);

    //@Bean
    CommandLineRunner startDB(ProductRepository product, ProductCategoryRepository category){
        long sProd = product.count();
        long sCat = category.count();

        ProductCategory categoryA = new ProductCategory(new Long(1),"A");
        ProductCategory categoryB = new ProductCategory(new Long(2), "B");
        ProductCategory categoryC = new ProductCategory(new Long(3), "C");


        if(sProd == 0 && sCat == 0){
            return args -> {
            };
        }
        return args -> { };
    }
}
