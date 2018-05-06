package com.produtos.produtosapp.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class DescricaoCulturaProduto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long DescricaoCulturaProdutoId;
	
	private Date dataCadastro;
	
	@OneToMany
	private List<Cultura> cultura;
	
	@OneToMany
	private List<DescricaoProduto> descricaoproduto;
	

	public long getDescricaoCulturaProdutoId() {
		return DescricaoCulturaProdutoId;
	}

	public void setDescricaoCulturaProdutoId(long descricaoCulturaProdutoId) {
		DescricaoCulturaProdutoId = descricaoCulturaProdutoId;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<Cultura> getCultura() {
		return cultura;
	}

	public void setCultura(List<Cultura> cultura) {
		this.cultura = cultura;
	}

	public List<DescricaoProduto> getDescricaoproduto() {
		return descricaoproduto;
	}

	public void setDescricaoproduto(List<DescricaoProduto> descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}

	
}
