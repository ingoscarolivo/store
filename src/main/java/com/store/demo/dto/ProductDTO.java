package com.store.demo.dto;

import com.store.demo.model.ProductEntity;

public class ProductDTO {
	
	  private static final long serialVersionUID = 4835606708278639517L;

	    private long idProduct;
	    private String description;
	    private String price;
		
	    
	    public ProductDTO(long idProduct, String description, String price) {
	        this.idProduct = idProduct;
	        this.description = description;
	        this.price = price;
	    }

	    public ProductDTO(ProductEntity productEntity) {
	        this.idProduct = productEntity.getIdProduct();
	        this.description = productEntity.getDescription();
	        this.price = productEntity.getPrice();
	    }
	    
	    
		public long getIdProduct() {
			return idProduct;
		}
		
		public void setIdProduct(long idProduct) {
			this.idProduct = idProduct;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

}
