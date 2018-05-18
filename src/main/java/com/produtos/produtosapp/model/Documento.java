package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Documento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long documentoId;
	
	private String nivelDocumento;
	@NotNull
	private String titulo;
	@NotNull
	private int administrador;
	@NotNull
	private boolean pastaDocumento;
	@NotNull
	private String nomeArquivo;
	@NotNull
	private String extensaoArquivo;
	@NotNull
	private String revisaoArquivo;
	@NotNull
	private int alterarNumero;
	@NotNull
	private int status;
	
	private String resumoDocumento;
	
	private String documento;
	@NotNull
	private Date dataModificacao;
	
	@ManyToOne
	private Produto produto;	
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Documento() {
		super();
		dataModificacao = new Date();
	}

	public Documento(long documentoId, String nivelDocumento, String titulo, int administrador, boolean pastaDocumento,
			String nomeArquivo, String extensaoArquivo, String revisaoArquivo, int alterarNumero, int status,
			String resumoDocumento, String documento, Date dataModificacao) {
		super();
		this.documentoId = documentoId;
		this.nivelDocumento = nivelDocumento;
		this.titulo = titulo;
		this.administrador = administrador;
		this.pastaDocumento = pastaDocumento;
		this.nomeArquivo = nomeArquivo;
		this.extensaoArquivo = extensaoArquivo;
		this.revisaoArquivo = revisaoArquivo;
		this.alterarNumero = alterarNumero;
		this.status = status;
		this.resumoDocumento = resumoDocumento;
		this.documento = documento;
		this.dataModificacao = dataModificacao;
	}

	public long getDocumentoId() {
		return documentoId;
	}

	public void setDocumentoId(long documentoId) {
		this.documentoId = documentoId;
	}

	public String getNivelDocumento() {
		return nivelDocumento;
	}

	public void setNivelDocumento(String nivelDocumento) {
		this.nivelDocumento = nivelDocumento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAdministrador() {
		return administrador;
	}

	public void setAdministrador(int administrador) {
		this.administrador = administrador;
	}

	public boolean isPastaDocumento() {
		return pastaDocumento;
	}

	public void setPastaDocumento(boolean pastaDocumento) {
		this.pastaDocumento = pastaDocumento;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getExtensaoArquivo() {
		return extensaoArquivo;
	}

	public void setExtensaoArquivo(String extensaoArquivo) {
		this.extensaoArquivo = extensaoArquivo;
	}

	public String getRevisaoArquivo() {
		return revisaoArquivo;
	}

	public void setRevisaoArquivo(String revisaoArquivo) {
		this.revisaoArquivo = revisaoArquivo;
	}

	public int getAlterarNumero() {
		return alterarNumero;
	}

	public void setAlterarNumero(int alterarNumero) {
		this.alterarNumero = alterarNumero;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getResumoDocumento() {
		return resumoDocumento;
	}

	public void setResumoDocumento(String resumoDocumento) {
		this.resumoDocumento = resumoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

}
