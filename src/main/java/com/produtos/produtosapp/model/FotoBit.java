package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class FotoBit {
	
	@Id
	@GeneratedValue
	private long FotoId;
	
	@NotNull
	private boolean primaria;
	
	@NotNull
	private Date dataModificacao;

	public FotoBit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public FotoBit(long fotoId, boolean primaria, Date dataModificacao) {
		super();
		FotoId = fotoId;
		this.primaria = primaria;
		this.dataModificacao = dataModificacao;
	}



	public long getFotoId() {
		return FotoId;
	}

	public void setFotoId(long fotoId) {
		FotoId = fotoId;
	}

	public boolean isPrimaria() {
		return primaria;
	}

	public void setPrimaria(boolean primaria) {
		this.primaria = primaria;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	
}
