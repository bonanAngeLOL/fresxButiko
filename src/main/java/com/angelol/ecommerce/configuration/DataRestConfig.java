package com.angelol.ecommerce.configuration;

import com.angelol.ecommerce.entities.Product;
import com.angelol.ecommerce.entities.ProductCategory;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer{

    public void disableMethods(RepositoryRestConfiguration config, HttpMethod[] methods, Class targetClass){
        config.getExposureConfiguration().
            forDomainType(targetClass).
            withItemExposure( (metadata, httpmethods) -> httpmethods.disable(methods)).
            withCollectionExposure((metadata, httpmethods) -> httpmethods.disable(methods));
    }

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        HttpMethod[] disabled = { HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE };
        this.disableMethods(config, disabled, Product.class);
        this.disableMethods(config, disabled, ProductCategory.class);
    }
}
