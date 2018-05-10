package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Modelo {
	
	private long modeloId;
	@NotNull
	private String nome;
	
	private String descricaoCatalogo;
	
	private String instrucoes;
	@NotNull
	private Date dataModificacao;
	
	
	

	public Modelo() {
		super();
		dataModificacao = new Date();
	}

	public Modelo(long modeloId, String nome, String descricaoCatalogo, String instrucoes, Date dataModificacao) {
		super();
		this.modeloId = modeloId;
		this.nome = nome;
		this.descricaoCatalogo = descricaoCatalogo;
		this.instrucoes = instrucoes;
		this.dataModificacao = dataModificacao;
	}

	public long getModeloId() {
		return modeloId;
	}

	public void setModeloId(long modeloId) {
		this.modeloId = modeloId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricaoCatalogo() {
		return descricaoCatalogo;
	}

	public void setDescricaoCatalogo(String descricaoCatalogo) {
		this.descricaoCatalogo = descricaoCatalogo;
	}

	public String getInstrucoes() {
		return instrucoes;
	}

	public void setInstrucoes(String instrucoes) {
		this.instrucoes = instrucoes;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	
	
}
