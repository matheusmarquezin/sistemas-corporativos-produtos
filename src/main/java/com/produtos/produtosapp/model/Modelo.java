package com.produtos.produtosapp.model;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "modelo")
public class Modelo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long ModeloId;
	
	@NotNull
	private String Nome;
	
	private String CatalogoDescricao;
	
	private String Instrucao;
	
	@NotNull
	private Date dataModificacao;	
	
	//@OneToOne
	@Lob
	@Column(length=1000000)
	private Produto protuto;
	
	//@OneToOne(cascade = CascadeType.ALL)
	private Ilustracao ilustracoes;
	
	
	//@OneToOne(cascade = CascadeType.ALL)
	private Cultura cultura;
	
	//@OneToOne(cascade = CascadeType.ALL)
	private Descricao descricao;

	public Modelo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public long getModeloId() {
		return ModeloId;
	}
	public void setModeloId(long modeloId) {
		ModeloId = modeloId;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCatalogoDescricao() {
		return CatalogoDescricao;
	}

	public void setCatalogoDescricao(String catalogoDescricao) {
		CatalogoDescricao = catalogoDescricao;
	}

	public String getInstrucao() {
		return Instrucao;
	}

	public void setInstrucao(String instrucao) {
		Instrucao = instrucao;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public Produto getProtuto() {
		return protuto;
	}

	public void setProtuto(Produto protuto) {
		this.protuto = protuto;
	}

	public Ilustracao getIlustracoes() {
		return ilustracoes;
	}

	public void setIlustracoes(Ilustracao ilustracoes) {
		this.ilustracoes = ilustracoes;
	}

	public Cultura getCultura() {
		return cultura;
	}

	public void setCultura(Cultura cultura) {
		this.cultura = cultura;
	}

	public Descricao getDescricao() {
		return descricao;
	}

	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Modelo(long modeloId, String nome, String catalogoDescricao, String instrucao, Date dataModificacao,
			Produto protuto, Ilustracao ilustracoes, Cultura cultura, Descricao descricao) {
		super();
		this.ModeloId = modeloId;
		this.Nome = nome;
		this.CatalogoDescricao = catalogoDescricao;
		this.Instrucao = instrucao;
		this.dataModificacao = dataModificacao;
		this.protuto = protuto;
		this.ilustracoes = ilustracoes;
		this.cultura = cultura;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Modelo [ModeloId=" + ModeloId + ", Nome=" + Nome + ", CatalogoDescricao=" + CatalogoDescricao
				+ ", Instrucao=" + Instrucao + ", dataModificacao=" + dataModificacao + ", protuto=" + protuto
				+ ", ilustracoes=" + ilustracoes + ", cultura=" + cultura + ", descricao=" + descricao + "]";
	}
	

}
