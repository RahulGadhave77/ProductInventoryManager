package com.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductDetail {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int productId;

	private String productName;

	private double productPrice;

	private int productQuatity;

	private String manufacturer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "inventory_id")
	private InventoryDetail inventoryDetail ;

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

	
	public InventoryDetail getInventoryDetail() {
		return inventoryDetail;
	}

	public void setInventoryDetail(InventoryDetail inventoryDetail) {
		this.inventoryDetail = inventoryDetail;
	}

	@Override
	public String toString() {
		return "ProductDetail [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productQuatity=" + productQuatity + ", manufacturer=" + manufacturer
				+ ", inventoryDetail=" + inventoryDetail + "]";
	}

}
