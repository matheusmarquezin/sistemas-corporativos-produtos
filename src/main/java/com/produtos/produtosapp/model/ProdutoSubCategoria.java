package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class ProdutoSubCategoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer ProdutoSubCategoriaID;
		
	
	@NotNull
	private String nome;
	@NotNull
	private Date dataModificacao;
	
	
	
	
	
	public ProdutoSubCategoria() {
		super();
		dataModificacao = new Date();
	}
	public ProdutoSubCategoria(Integer produtoSubCategoriaID, String nome, Date dataModificacao) {
		super();
		ProdutoSubCategoriaID = produtoSubCategoriaID;
		this.nome = nome;
		this.dataModificacao = dataModificacao;
	}
	public Integer getProdutoSubCategoriaID() {
		return ProdutoSubCategoriaID;
		
	}
	public void setProdutoSubCategoriaID(Integer produtoSubCategoriaID) {
		ProdutoSubCategoriaID = produtoSubCategoriaID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataModificacao() {
		return dataModificacao;
	}
	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	
	
	

}
