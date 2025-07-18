package com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductDetail {

	@Id
	private int productId;

	private String productName;

	private double productPrice;

	private int productQuatity;

	private String manufacturer;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuatity() {
		return productQuatity;
	}

	public void setProductQuatity(int productQuatity) {
		this.productQuatity = productQuatity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "ProductDetail [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productQuatity=" + productQuatity + ", manufacturer=" + manufacturer + "]";
	}

}
