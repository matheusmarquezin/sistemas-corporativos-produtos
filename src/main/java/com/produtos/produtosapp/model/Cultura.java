package com.produtos.produtosapp.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Cultura implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long culturaId;
	
	private String nome;
	
	private Date dataCadastro;
	
	@OneToOne
	private DescricaoCultura descricaoculturaproduto;

	
	
	public DescricaoCultura getDescricaoculturaproduto() {
		return descricaoculturaproduto;
	}

	public void setDescricaoculturaproduto(DescricaoCultura descricaoculturaproduto) {
		this.descricaoculturaproduto = descricaoculturaproduto;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
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
	
}
