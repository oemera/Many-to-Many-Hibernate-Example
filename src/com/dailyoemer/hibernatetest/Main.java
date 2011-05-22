package com.dailyoemer.hibernatetest;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Main {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Product.class);
		@SuppressWarnings("unchecked")
		List<Product> products = criteria.list();
		
		for(Product p : products) {
			for(ProductItem item : p.getProductItems()) {
				System.out.println("product name: " + item.getProduct().getName());
				System.out.println("item name: " + item.getItem().getName());
				System.out.println("language name: " + item.getLanguage().getName());
			}
		}
	}

}
