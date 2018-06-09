package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Modelo {
	
	@Id
	@GeneratedValue
	private long ModeloId;
	
	@NotNull
	private String Nome;
	
	private String CatalogoDescricao;
	
	private String Instrucao;
	
	@NotNull
	private Date dataModificacao;
	
	

	public Modelo(long modeloId, String nome, String catalogoDescricao, String instrucao, Date dataModificacao) {
		super();
		ModeloId = modeloId;
		Nome = nome;
		CatalogoDescricao = catalogoDescricao;
		Instrucao = instrucao;
		this.dataModificacao = dataModificacao;
	}

	public Modelo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getModeloId() {
		return ModeloId;
	}

	public void setModeloId(long modeloId) {
		ModeloId = modeloId;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCatalogoDescricao() {
		return CatalogoDescricao;
	}

	public void setCatalogoDescricao(String catalogoDescricao) {
		CatalogoDescricao = catalogoDescricao;
	}

	public String getInstrucao() {
		return Instrucao;
	}

	public void setInstrucao(String instrucao) {
		Instrucao = instrucao;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
		

}
