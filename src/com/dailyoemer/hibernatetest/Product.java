package com.dailyoemer.hibernatetest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product")
public class Product {
 
    private Integer id;
    private String name;
    private List<ProductItem> productItems = new LinkedList<ProductItem>();
 
    public Product() {
    }
 
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return this.id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    @Column(name = "name")
    public String getName() {
        return this.name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.product")
    public List<ProductItem> getProductItems() {
        return this.productItems;
    }
 
    public void setProductItems(List<ProductItem> productItems) {
        this.productItems = productItems;
    }
}