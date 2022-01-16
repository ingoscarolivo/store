package com.store.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_TARGET_CREDIT_ENTITY")
public class TargetCreditEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTarget;

	@Column(name = "datecvv")
	private Date datecvv;

	@Column(name = "numberCard")
	private String numberCard;
	
	@Column(name = "cvv")
	private String cvv;
	
	@Column(name = "idUsuario")
	private long idUsuario;
	
	public Long getIdTarget() {
		return idTarget;
	}

	public void setIdTarget(Long idTarget) {
		this.idTarget = idTarget;
	}

	public Date getDatecvv() {
		return datecvv;
	}

	public void setDatecvv(Date datecvv) {
		this.datecvv = datecvv;
	}
	

	public String getNumberCard() {
		return numberCard;
	}

	public void setNumbercard(String numberCard) {
		this.numberCard = numberCard;
	}
	
	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdusuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}	
	
}