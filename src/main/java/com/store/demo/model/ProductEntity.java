package com.store.demo.model;

import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PRODUCTS")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduct;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private String price;

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		byte[] decodedBytes = Base64.getUrlDecoder().decode(price);
		String decodedPrice = new String(decodedBytes);
		return decodedPrice;
	}

	public void setPrice(String price) {
		this.price =  Base64.getEncoder().encodeToString(price.getBytes());
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + idProduct + ", name=" + description + ", price=" + price
				+ "]";
	}
}