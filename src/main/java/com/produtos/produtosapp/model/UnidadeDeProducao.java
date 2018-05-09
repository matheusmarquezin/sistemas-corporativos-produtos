package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class UnidadeDeProducao {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String  UnidadeDeProducaoID;
	
	@NotNull
	private String nome;
	@NotNull
	private Date dataModificacao;
	
	
	
	public UnidadeDeProducao() {
		super();
		dataModificacao = new Date();
	}
	public UnidadeDeProducao(String unidadeDeProducaoID, String nome, Date dataModificacao) {
		super();
		UnidadeDeProducaoID = unidadeDeProducaoID;
		this.nome = nome;
		this.dataModificacao = dataModificacao;
	}
	public String getUnidadeDeProducaoID() {
		return UnidadeDeProducaoID;
	}
	public void setUnidadeDeProducaoID(String unidadeDeProducaoID) {
		UnidadeDeProducaoID = unidadeDeProducaoID;
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
