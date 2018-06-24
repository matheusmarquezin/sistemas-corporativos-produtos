package com.produtos.produtosapp.model;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "produtoSubCategoria")
public class ProdutoSubCategoria implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue	
	private long ProdutoSubCategoriaID;
			
	@NotNull
	private String nome;
	@NotNull
	private Date dataModificacao;
	
	@OneToOne
	ProdutoCategoria produtoCategoria;
	
	@ManyToOne
	private Produto produto;	
	

	public ProdutoSubCategoria() {
		super();
		// TODO Auto-generated constructor stub
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ProdutoSubCategoriaID ^ (ProdutoSubCategoriaID >>> 32));
		result = prime * result + ((dataModificacao == null) ? 0 : dataModificacao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + ((produtoCategoria == null) ? 0 : produtoCategoria.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoSubCategoria other = (ProdutoSubCategoria) obj;
		if (ProdutoSubCategoriaID != other.ProdutoSubCategoriaID)
			return false;
		if (dataModificacao == null) {
			if (other.dataModificacao != null)
				return false;
		} else if (!dataModificacao.equals(other.dataModificacao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (produtoCategoria == null) {
			if (other.produtoCategoria != null)
				return false;
		} else if (!produtoCategoria.equals(other.produtoCategoria))
			return false;
		return true;
	}

	public long getProdutoSubCategoriaID() {
		return ProdutoSubCategoriaID;
	}


	public void setProdutoSubCategoriaID(long produtoSubCategoriaID) {
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


	public ProdutoCategoria getProdutoCategoria() {
		return produtoCategoria;
	}


	public void setProdutoCategoria(ProdutoCategoria produtoCategoria) {
		this.produtoCategoria = produtoCategoria;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public ProdutoSubCategoria(long produtoSubCategoriaID, String nome, Date dataModificacao,
			ProdutoCategoria produtoCategoria, Produto produto) {
		super();
		ProdutoSubCategoriaID = produtoSubCategoriaID;
		this.nome = nome;
		this.dataModificacao = dataModificacao;
		this.produtoCategoria = produtoCategoria;
		this.produto = produto;
	}


	@Override
	public String toString() {
		return "ProdutoSubCategoria [ProdutoSubCategoriaID=" + ProdutoSubCategoriaID + ", nome=" + nome
				+ ", dataModificacao=" + dataModificacao + ", produtoCategoria=" + produtoCategoria + ", produto="
				+ produto + "]";
	}	

}
