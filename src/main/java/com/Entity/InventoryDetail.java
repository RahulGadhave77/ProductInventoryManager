package com.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory_Detail")
public class InventoryDetail {
//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int inventoryId;

	private String warehouseLocation;

	@OneToOne(mappedBy = "inventoryDetail")
	private ProductDetail productDetail;

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getWarehouseLocation() {
		return warehouseLocation;
	}

	public void setWarehouseLocation(String warehouseLocation) {
		this.warehouseLocation = warehouseLocation;
	}

	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

	@Override
	public String toString() {
		return "InventoryDetail [inventoryId=" + inventoryId + ", warehouseLocation=" + warehouseLocation
				+ ", productDetail=" + productDetail + "]";
	}

	

}
