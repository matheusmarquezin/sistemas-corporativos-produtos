package com.produtos.produtosapp.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cultura")
public class Cultura implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long culturaId;
	
	private String nome;
	
	private Date dataCadastro;

	public Cultura() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public long getCulturaId() {
		return culturaId;
	}

	public void setCulturaId(long culturaId) {
		this.culturaId = culturaId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Cultura(long culturaId, String nome, Date dataCadastro) {
		super();
		this.culturaId = culturaId;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Cultura [culturaId=" + culturaId + ", nome=" + nome + ", dataCadastro=" + dataCadastro + "]";
	}	
	
}
