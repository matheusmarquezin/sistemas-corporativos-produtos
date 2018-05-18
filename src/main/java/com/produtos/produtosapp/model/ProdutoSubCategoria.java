package com.produtos.produtosapp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class ProdutoSubCategoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long ProdutoSubCategoriaID;
			
	@NotNull
	private String nome;
	@NotNull
	private Date dataModificacao;
	
	@OneToMany
	private List<ProdutoCategoria> produtoCategoria;
	
	@ManyToOne
	private Produto produto;	
	
	
	public List<ProdutoCategoria> getProdutoCategoria() {
		return produtoCategoria;
	}
	public void setProdutoCategoria(List<ProdutoCategoria> produtoCategoria) {
		this.produtoCategoria = produtoCategoria;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public void setProdutoSubCategoriaID(long produtoSubCategoriaID) {
		ProdutoSubCategoriaID = produtoSubCategoriaID;
	}
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
	public long getProdutoSubCategoriaID() {
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
