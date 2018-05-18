package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotNull;

@Entity
public class Revisao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long revisaoId;
	
	@ManyToOne
	private Produto produto;
	
	@NotNull
	private String nomeRevisao;
	@NotNull
	private Date dataRevisao;
	@NotNull
	private String enderecoEmail;
	
	private String comentarios;
	@NotNull
	private Date dataModificacao;	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Revisao() {
		super();
		dataModificacao = new Date();
	}
	public Revisao(long revisaoId, String nomeRevisao, Date dataRevisao, String enderecoEmail, String comentarios,
			Date dataModificacao) {
		super();
		this.revisaoId = revisaoId;
		this.nomeRevisao = nomeRevisao;
		this.dataRevisao = dataRevisao;
		this.enderecoEmail = enderecoEmail;
		this.comentarios = comentarios;
		this.dataModificacao = dataModificacao;
	}
	public long getRevisaoId() {
		return revisaoId;
	}
	public void setRevisaoId(long revisaoId) {
		this.revisaoId = revisaoId;
	}
	public String getNomeRevisao() {
		return nomeRevisao;
	}
	public void setNomeRevisao(String nomeRevisao) {
		this.nomeRevisao = nomeRevisao;
	}
	public Date getDataRevisao() {
		return dataRevisao;
	}
	public void setDataRevisao(Date dataRevisao) {
		this.dataRevisao = dataRevisao;
	}
	public String getEnderecoEmail() {
		return enderecoEmail;
	}
	public void setEnderecoEmail(String enderecoEmail) {
		this.enderecoEmail = enderecoEmail;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public Date getDataModificacao() {
		return dataModificacao;
	}
	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

}
