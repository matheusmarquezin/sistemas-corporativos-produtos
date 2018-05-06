package com.produtos.produtosapp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DescricaoProduto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long DescricaoProdutoId;
	
	@ManyToOne
	private DescricaoCulturaProduto descricaoculturaproduto;

	private String Descricao;
	
	private Date dataCadastro;

	public long getDescricaoProdutoId() {
		return DescricaoProdutoId;
	}

	public void setDescricaoProdutoId(long descricaoProdutoId) {
		DescricaoProdutoId = descricaoProdutoId;
	}

	public DescricaoCulturaProduto getDescricaoculturaproduto() {
		return descricaoculturaproduto;
	}

	public void setDescricaoculturaproduto(DescricaoCulturaProduto descricaoculturaproduto) {
		this.descricaoculturaproduto = descricaoculturaproduto;
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
}
