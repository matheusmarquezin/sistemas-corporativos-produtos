package com.produtos.produtosapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "revisao")
public class Revisao implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long revisaoId;
	
	@NotNull
	private String nomeRevisao;
	@NotNull
	private Date dataRevisao;
	@NotNull
	private String enderecoEmail;
	
	private String comentarios;
	@NotNull
	private Date dataModificacao;	
	
	@ManyToOne
	@JoinColumn
	private Produto produto;

	public Revisao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comentarios == null) ? 0 : comentarios.hashCode());
		result = prime * result + ((dataModificacao == null) ? 0 : dataModificacao.hashCode());
		result = prime * result + ((dataRevisao == null) ? 0 : dataRevisao.hashCode());
		result = prime * result + ((enderecoEmail == null) ? 0 : enderecoEmail.hashCode());
		result = prime * result + ((nomeRevisao == null) ? 0 : nomeRevisao.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + (int) (revisaoId ^ (revisaoId >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Revisao other = (Revisao) obj;
		if (comentarios == null) {
			if (other.comentarios != null)
				return false;
		} else if (!comentarios.equals(other.comentarios))
			return false;
		if (dataModificacao == null) {
			if (other.dataModificacao != null)
				return false;
		} else if (!dataModificacao.equals(other.dataModificacao))
			return false;
		if (dataRevisao == null) {
			if (other.dataRevisao != null)
				return false;
		} else if (!dataRevisao.equals(other.dataRevisao))
			return false;
		if (enderecoEmail == null) {
			if (other.enderecoEmail != null)
				return false;
		} else if (!enderecoEmail.equals(other.enderecoEmail))
			return false;
		if (nomeRevisao == null) {
			if (other.nomeRevisao != null)
				return false;
		} else if (!nomeRevisao.equals(other.nomeRevisao))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (revisaoId != other.revisaoId)
			return false;
		return true;
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



	public Produto getProduto() {
		return produto;
	}



	public void setProduto(Produto produto) {
		this.produto = produto;
	}



	public Revisao(long revisaoId, String nomeRevisao, Date dataRevisao, String enderecoEmail, String comentarios,
			Date dataModificacao, Produto produto) {
		super();
		this.revisaoId = revisaoId;
		this.nomeRevisao = nomeRevisao;
		this.dataRevisao = dataRevisao;
		this.enderecoEmail = enderecoEmail;
		this.comentarios = comentarios;
		this.dataModificacao = dataModificacao;
		this.produto = produto;
	}



	@Override
	public String toString() {
		return "Revisao [revisaoId=" + revisaoId + ", nomeRevisao=" + nomeRevisao + ", dataRevisao=" + dataRevisao
				+ ", enderecoEmail=" + enderecoEmail + ", comentarios=" + comentarios + ", dataModificacao="
				+ dataModificacao + ", produto=" + produto + "]";
	}		

}
