package com.Repository;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Entity.ProductDetail;
import com.Utility.ProductUtility;

public class ProductRepo {

	Scanner sc = new Scanner(System.in);

	public void addProduct() {

		ProductDetail product = new ProductDetail();

		System.out.println("Enter the Id ");
		int productId = sc.nextInt();
		product.setProductId(productId);

		System.out.println("Enter Product Name");
		String productName = sc.next();
		product.setProductName(productName);

		System.out.println("Enter Product Price");
		double productPrice = sc.nextDouble();
		product.setProductPrice(productPrice);

		System.out.println("Enter Product Quantity");
		int productQuantity = sc.nextInt();
		product.setProductQuatity(productQuantity);

		System.out.println("Enter product manufacture");
		String productManufacture = sc.next();
		product.setManufacturer(productManufacture);

		SessionFactory factory = ProductUtility.getfactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.persist(product);

		transaction.commit();
		session.close();

	}

	public void getAllProduct() {

		SessionFactory factory = ProductUtility.getfactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		List<ProductDetail> productList = session.createQuery("select p from ProductDetail p", ProductDetail.class)
				.getResultList();
		
		productList.stream().forEach(k -> System.out.println(k));
		
		transaction.commit();
		session.close();

	}
	
	public void updateProduct() {
		SessionFactory factory = ProductUtility.getfactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		System.out.println("Enter product Id ");
		int productId = sc.nextInt();
		ProductDetail product = session.find(ProductDetail.class, productId);
		
		System.out.println("Enter Product Quantity");
		int productQuantity = sc.nextInt();
		product.setProductQuatity(productQuantity);
		
		transaction.commit();
		session.close();
	}
	
	public void deleteProduct() {
		SessionFactory factory = ProductUtility.getfactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.println("Enter Product Id");
		int producId = sc.nextInt();
		ProductDetail product =session.find(ProductDetail.class, producId);
		
		session.remove(product);
		
		transaction.commit();
		session.close();
	}

}
