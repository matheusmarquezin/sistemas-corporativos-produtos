package com.produtos.produtosapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "unidadeMedida")
public class UnidadeMedida implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long unidadeMedidaId;
	
	private String nome;
	
	private Date dataModificacao;
	@OneToOne
	private Produto produto;

	public UnidadeMedida() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (unidadeMedidaId ^ (unidadeMedidaId >>> 32));
		result = prime * result + ((dataModificacao == null) ? 0 : dataModificacao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
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
		UnidadeMedida other = (UnidadeMedida) obj;
		if (unidadeMedidaId != other.unidadeMedidaId)
			return false;
		if (dataModificacao == null) {
			if (other.dataModificacao != null)
				return false;
		} else if (!dataModificacao.equals(other.dataModificacao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}



	public long getId() {
		return unidadeMedidaId;
	}
	public void setId(long id) {
		unidadeMedidaId = id;
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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UnidadeMedida(long id, String nome, Date dataModificacao, Produto produto) {
		super();
		unidadeMedidaId = id;
		this.nome = nome;
		this.dataModificacao = dataModificacao;
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "UnidadeMedida [Id=" + unidadeMedidaId + ", nome=" + nome + ", dataModificacao=" + dataModificacao + ", produto="
				+ produto + "]";
	}
	
}
