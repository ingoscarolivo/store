package com.store.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USERS")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUser;

	@Column(name = "name")
	private String name;

	@Column(name = "email", nullable = false, length = 200)
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH },fetch = FetchType.LAZY)

	@JoinColumn(name = "idTarget")
	
	private TargetCreditEntity targetCreditEntity;
	
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH },fetch = FetchType.LAZY)

	@JoinColumn(name = "idShoppingCar")
	
	private ShoppingCartEntity shoppingCartEntity;
	
	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "UserEntity [id=" + idUser + ", name=" + name + ", email=" + email
				+ "]";
	}
}