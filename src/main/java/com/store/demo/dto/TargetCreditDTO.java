package com.store.demo.dto;

import java.sql.Date;

import com.store.demo.model.TargetCreditEntity;

public class TargetCreditDTO {
	
	private long idTarget;
	private Date datecvv;
	private String numberCard;
	private String cvv;
	private long idUsuario;
	
    public TargetCreditDTO(long idTarget, Date datecvv, String numberCard, String cvv, long idUsuario) {
        this.idTarget = idTarget;
        this.datecvv = datecvv;
        this.numberCard = numberCard;
        this.cvv = cvv;
        this.idUsuario = idUsuario;
    }

    public TargetCreditDTO(TargetCreditEntity targetCreditEntity) {
        this.idTarget = targetCreditEntity.getIdTarget();
        this.datecvv = targetCreditEntity.getDatecvv();
        this.numberCard = targetCreditEntity.getNumberCard();
        this.cvv = targetCreditEntity.getCvv();
        this.idUsuario = targetCreditEntity.getIdUsuario();
    }
	
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
	public void setNumberCard(String numberCard) {
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
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

}
