package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Ilustracao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ilustracaoId;
	
	private String diagrama;
	@NotNull
	private Date dataModificacao;
	
	
	
	public Ilustracao() {
		super();
		dataModificacao = new Date();
	}
	public Ilustracao(long ilustracaoId, String diagrama, Date dataModificacao) {
		super();
		this.ilustracaoId = ilustracaoId;
		this.diagrama = diagrama;
		this.dataModificacao = dataModificacao;
	}
	public long getIlustracaoId() {
		return ilustracaoId;
	}
	public void setIlustracaoId(long ilustracaoId) {
		this.ilustracaoId = ilustracaoId;
	}
	public String getDiagrama() {
		return diagrama;
	}
	public void setDiagrama(String diagrama) {
		this.diagrama = diagrama;
	}
	public Date getDataModificacao() {
		return dataModificacao;
	}
	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	
}
