package com.dailyoemer.hibernatetest;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ProductItemPk implements Serializable {
 
    private static final long serialVersionUID = 1L;
	
    private Item item;
    private Product product;
    private Language language;
    
    @ManyToOne
    public Item getItem() {
        return item;
    }
 
    public void setItem(Item item) {
        this.item = item;
    }
 
    @ManyToOne
    public Product getProduct() {
        return product;
    }
 
    public void setProduct(Product product) {
        this.product = product;
    }
    
    @ManyToOne
    public Language getLanguage() {
        return language;
    }
 
    public void setLanguage(Language language) {
        this.language = language;
    }
 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
 
        ProductItemPk that = (ProductItemPk) o;
 
        if (item != null ? !item.equals(that.item) : that.item != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) 
        	return false;
        if (product != null ? !product.equals(that.product) : that.product != null)
            return false;
 
        return true;
    }
 
    public int hashCode() {
        int result;
        result = (item != null ? item.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}