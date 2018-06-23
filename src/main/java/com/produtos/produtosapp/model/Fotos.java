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
@Table(name = "fotos")
public class Fotos implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long fotoId;
	
	private String imagemPequena;
	
	private String nomeImagemPequena;
	
	private String imagemGrande;
	
	private String nomeImagemGrande;
	
	private boolean principal;
	@NotNull
	private Date dataModificacao;
	
	@ManyToOne
    @JoinColumn
	private Produto produto;	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataModificacao == null) ? 0 : dataModificacao.hashCode());
		result = prime * result + (int) (fotoId ^ (fotoId >>> 32));
		result = prime * result + ((imagemGrande == null) ? 0 : imagemGrande.hashCode());
		result = prime * result + ((imagemPequena == null) ? 0 : imagemPequena.hashCode());
		result = prime * result + ((nomeImagemGrande == null) ? 0 : nomeImagemGrande.hashCode());
		result = prime * result + ((nomeImagemPequena == null) ? 0 : nomeImagemPequena.hashCode());
		result = prime * result + (principal ? 1231 : 1237);
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
		Fotos other = (Fotos) obj;
		if (dataModificacao == null) {
			if (other.dataModificacao != null)
				return false;
		} else if (!dataModificacao.equals(other.dataModificacao))
			return false;
		if (fotoId != other.fotoId)
			return false;
		if (imagemGrande == null) {
			if (other.imagemGrande != null)
				return false;
		} else if (!imagemGrande.equals(other.imagemGrande))
			return false;
		if (imagemPequena == null) {
			if (other.imagemPequena != null)
				return false;
		} else if (!imagemPequena.equals(other.imagemPequena))
			return false;
		if (nomeImagemGrande == null) {
			if (other.nomeImagemGrande != null)
				return false;
		} else if (!nomeImagemGrande.equals(other.nomeImagemGrande))
			return false;
		if (nomeImagemPequena == null) {
			if (other.nomeImagemPequena != null)
				return false;
		} else if (!nomeImagemPequena.equals(other.nomeImagemPequena))
			return false;
		if (principal != other.principal)
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}

	public long getFotoId() {
		return fotoId;
	}

	public void setFotoId(long fotoId) {
		this.fotoId = fotoId;
	}

	public String getImagemPequena() {
		return imagemPequena;
	}

	public void setImagemPequena(String imagemPequena) {
		this.imagemPequena = imagemPequena;
	}

	public String getNomeImagemPequena() {
		return nomeImagemPequena;
	}

	public void setNomeImagemPequena(String nomeImagemPequena) {
		this.nomeImagemPequena = nomeImagemPequena;
	}

	public String getImagemGrande() {
		return imagemGrande;
	}

	public void setImagemGrande(String imagemGrande) {
		this.imagemGrande = imagemGrande;
	}

	public String getNomeImagemGrande() {
		return nomeImagemGrande;
	}

	public void setNomeImagemGrande(String nomeImagemGrande) {
		this.nomeImagemGrande = nomeImagemGrande;
	}

	public boolean isPrincipal() {
		return principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
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

	public Fotos(long fotoId, String imagemPequena, String nomeImagemPequena, String imagemGrande,
			String nomeImagemGrande, boolean principal, Date dataModificacao, Produto produto) {
		super();
		this.fotoId = fotoId;
		this.imagemPequena = imagemPequena;
		this.nomeImagemPequena = nomeImagemPequena;
		this.imagemGrande = imagemGrande;
		this.nomeImagemGrande = nomeImagemGrande;
		this.principal = principal;
		this.dataModificacao = dataModificacao;
		this.produto = produto;
	}

	public Fotos() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Fotos [fotoId=" + fotoId + ", imagemPequena=" + imagemPequena + ", nomeImagemPequena="
				+ nomeImagemPequena + ", imagemGrande=" + imagemGrande + ", nomeImagemGrande=" + nomeImagemGrande
				+ ", principal=" + principal + ", dataModificacao=" + dataModificacao + ", produto=" + produto + "]";
	}
		
}
