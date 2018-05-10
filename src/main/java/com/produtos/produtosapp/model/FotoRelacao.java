package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class FotoRelacao {
	
	private Produto produto;
	
	private Fotos foto;
	@NotNull
	private boolean principal;
	@NotNull
	private Date dataModificacao;
	
	

	public FotoRelacao() {
		super();
		dataModificacao = new Date();
	}

	public FotoRelacao(Produto produto, Fotos foto, boolean principal, Date dataModificacao) {
		super();
		this.produto = produto;
		this.foto = foto;
		this.principal = principal;
		this.dataModificacao = dataModificacao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Fotos getFoto() {
		return foto;
	}

	public void setFoto(Fotos foto) {
		this.foto = foto;
	}

	public boolean isPrincipal() {
		return principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	
}
