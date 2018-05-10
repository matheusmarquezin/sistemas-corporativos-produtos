package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class ModeloIlustracao {
	
	private Modelo modelo;
	
	private Ilustracao ilustracao;
	@NotNull
	private Date dataModificacao;
	
	

	public ModeloIlustracao() {
		super();
		dataModificacao = new Date();
	}

	public ModeloIlustracao(Modelo modelo, Ilustracao ilustracao, Date dataModificacao) {
		super();
		this.modelo = modelo;
		this.ilustracao = ilustracao;
		this.dataModificacao = dataModificacao;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Ilustracao getIlustracao() {
		return ilustracao;
	}

	public void setIlustracao(Ilustracao ilustracao) {
		this.ilustracao = ilustracao;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	
}
