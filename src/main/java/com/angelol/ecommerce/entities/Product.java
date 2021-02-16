package com.angelol.ecommerce.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="f_product")
@Data
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String sku;

    private String name;

    private String description;

    private BigDecimal unitPrice;

    private String imageUrl;

    private boolean active;

    private Date dateCreated;

    private Date lastUpdate;

}
