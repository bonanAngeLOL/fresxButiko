package com.angelol.ecommerce.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer{

    @Autowired
    private EntityManager entityMan;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        exposeIdToJson(config);
    }

    public void exposeIdToJson(RepositoryRestConfiguration config){
        Set<EntityType<?>> entities = entityMan.getMetamodel().getEntities();
        List<Class> entityClasses = new ArrayList<>();
        for(EntityType type: entities){
            entityClasses.add(type.getJavaType());
        }
        Class[] domainTypes = entityClasses.toArray(new Class[0]);
        config.exposeIdsFor(domainTypes);
    }

}
