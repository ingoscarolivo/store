package com.store.demo.dto;

import com.store.demo.model.ShoppingCartEntity;

public class ShoppingCarDTO {
	
	private long idShoppingCar;
	private long idUsuario;
	private long idProduct;
	private String status;
	private String totalPrice;
	
    
    public ShoppingCarDTO(long idShoppingCar, long idUsuario, long idProduct, String status, String totalPrice) {
        this.idShoppingCar = idShoppingCar;
        this.idUsuario = idUsuario;
        this.idProduct = idProduct;
        this.status = status;
        this.totalPrice = totalPrice;
    }

    public ShoppingCarDTO(ShoppingCartEntity shoppingCartEntity) {
        this.idShoppingCar = shoppingCartEntity.getIdShoppingCar();
        this.idUsuario = shoppingCartEntity.getIdUsuario();
        this.idProduct = shoppingCartEntity.geIdProcuct();
        this.status = shoppingCartEntity.getStatus();
        this.totalPrice = shoppingCartEntity.getTotalprice();
    }
    
	
	public Long getIdShoppingCar() {
		return idShoppingCar;
	}
	public void setIdShoppingCar(Long idShoppingCar) {
		this.idShoppingCar = idShoppingCar;
	}
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

}
