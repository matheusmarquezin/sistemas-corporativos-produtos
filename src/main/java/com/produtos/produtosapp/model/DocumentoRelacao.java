package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class DocumentoRelacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long documentoRelacaoId;
	@NotNull
	private Documento documento;
	@NotNull
	private Date dataModificacao;
	
	
	public DocumentoRelacao() {
		super();
		dataModificacao = new Date();
	}
	public DocumentoRelacao(long documentoRelacaoId, Documento documento, Date dataModificacao) {
		super();
		this.documentoRelacaoId = documentoRelacaoId;
		this.documento = documento;
		this.dataModificacao = dataModificacao;
	}
	public long getDocumentoRelacaoId() {
		return documentoRelacaoId;
	}
	public void setDocumentoRelacaoId(long documentoRelacaoId) {
		this.documentoRelacaoId = documentoRelacaoId;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public Date getDataModificacao() {
		return dataModificacao;
	}
	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

}
