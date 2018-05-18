package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Fotos {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long fotoId;
	
	private String imagemPequena;
	
	private String nomeImagemPequena;
	
	private String imagemGrande;
	
	private String nomeImagemGrande;
	@NotNull
	private Date dataModificacao;
	
	@ManyToOne
	private Produto produto;
	

	public Fotos() {
		super();
		dataModificacao = new Date();
	}

	public Fotos(long fotoId, String imagenPequena, String nomeImagemPequena, String imagemGrande,
			String nomeImagemGrande, Date dataModificacao) {
		super();
		this.fotoId = fotoId;
		this.imagemPequena = imagenPequena;
		this.nomeImagemPequena = nomeImagemPequena;
		this.imagemGrande = imagemGrande;
		this.nomeImagemGrande = nomeImagemGrande;
		this.dataModificacao = dataModificacao;
	}

	public long getFotoId() {
		return fotoId;
	}

	public void setFotoId(long fotoId) {
		this.fotoId = fotoId;
	}

	public String getImagenPequena() {
		return imagemPequena;
	}

	public void setImagenPequena(String imagenPequena) {
		this.imagemPequena = imagenPequena;
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

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	
}
