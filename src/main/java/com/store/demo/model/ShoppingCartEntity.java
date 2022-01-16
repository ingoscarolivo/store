package com.store.demo.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_SHOPPINGCARTS")
public class ShoppingCartEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idShoppingCar;

	@Column(name = "idUsuario")
	private long idUsuario;

	@Column(name = "idProduct")
	private long idProduct;

	@Column(name = "status")
	private String status;

	@Column(name = "totalPrice")
	private String totalPrice;
	
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH },fetch = FetchType.LAZY)

	@JoinColumn(name = "idProduct")
	
	private ProductEntity productEntity;
	
	public Long getIdShoppingCar() {
		return idShoppingCar;
	}

	public void setIdShoppingCar(Long idShoppingCar) {
		this.idShoppingCar = idShoppingCar;
	}

	
	public long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdusuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public long geIdProcuct() {
		return idProduct;
	}
	
	public void setIdProcuct(long idProduct) {
		this.idProduct = idProduct;
	}	
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	
	
	public String getTotalprice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}	
	

}
