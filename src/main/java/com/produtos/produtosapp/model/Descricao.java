package com.produtos.produtosapp.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "descricao")
public class Descricao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long DescricaoProdutoId;	

	private String Descricao;
	
	private Date dataCadastro;

	public Descricao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public long getDescricaoProdutoId() {
		return DescricaoProdutoId;
	}

	public void setDescricaoProdutoId(long descricaoProdutoId) {
		DescricaoProdutoId = descricaoProdutoId;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
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

	public Descricao(long descricaoProdutoId, String descricao, Date dataCadastro) {
		super();
		this.DescricaoProdutoId = descricaoProdutoId;
		this.Descricao = descricao;
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Descricao [DescricaoProdutoId=" + DescricaoProdutoId + ", Descricao=" + Descricao + ", dataCadastro="
				+ dataCadastro + "]";
	}
	

}
