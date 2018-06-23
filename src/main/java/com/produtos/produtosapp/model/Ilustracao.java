package com.produtos.produtosapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ilustracao")
public class Ilustracao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long ilustracaoId;
	
	private String diagrama;
	@NotNull
	private Date dataModificacao;
	public Ilustracao() {
		super();
		// TODO Auto-generated constructor stub
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Ilustracao [ilustracaoId=" + ilustracaoId + ", diagrama=" + diagrama + ", dataModificacao="
				+ dataModificacao + "]";
	}



	public Ilustracao(long ilustracaoId, String diagrama, Date dataModificacao) {
		super();
		this.ilustracaoId = ilustracaoId;
		this.diagrama = diagrama;
		this.dataModificacao = dataModificacao;
	}
	
	
	
	
}
