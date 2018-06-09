package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UnidadeMedida {
	
	@Id
	private String Id;
	
	private String nome;
	
	private Date dataModificacao;

	public UnidadeMedida() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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

	@Override
	public String toString() {
		return "UnidadeMedida [Id=" + Id + ", nome=" + nome + ", dataModificacao=" + dataModificacao + "]";
	}
	
	
}
