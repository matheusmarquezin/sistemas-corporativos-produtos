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
@Table(name = "documento")
public class Documento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
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
    @JoinColumn
	private Produto produto;

	public Documento() {
		super();
		// TODO Auto-generated constructor stub
	}
		

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + administrador;
		result = prime * result + alterarNumero;
		result = prime * result + ((dataModificacao == null) ? 0 : dataModificacao.hashCode());
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + (int) (documentoId ^ (documentoId >>> 32));
		result = prime * result + ((extensaoArquivo == null) ? 0 : extensaoArquivo.hashCode());
		result = prime * result + ((nivelDocumento == null) ? 0 : nivelDocumento.hashCode());
		result = prime * result + ((nomeArquivo == null) ? 0 : nomeArquivo.hashCode());
		result = prime * result + (pastaDocumento ? 1231 : 1237);
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + ((resumoDocumento == null) ? 0 : resumoDocumento.hashCode());
		result = prime * result + ((revisaoArquivo == null) ? 0 : revisaoArquivo.hashCode());
		result = prime * result + status;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Documento other = (Documento) obj;
		if (administrador != other.administrador)
			return false;
		if (alterarNumero != other.alterarNumero)
			return false;
		if (dataModificacao == null) {
			if (other.dataModificacao != null)
				return false;
		} else if (!dataModificacao.equals(other.dataModificacao))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (documentoId != other.documentoId)
			return false;
		if (extensaoArquivo == null) {
			if (other.extensaoArquivo != null)
				return false;
		} else if (!extensaoArquivo.equals(other.extensaoArquivo))
			return false;
		if (nivelDocumento == null) {
			if (other.nivelDocumento != null)
				return false;
		} else if (!nivelDocumento.equals(other.nivelDocumento))
			return false;
		if (nomeArquivo == null) {
			if (other.nomeArquivo != null)
				return false;
		} else if (!nomeArquivo.equals(other.nomeArquivo))
			return false;
		if (pastaDocumento != other.pastaDocumento)
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (resumoDocumento == null) {
			if (other.resumoDocumento != null)
				return false;
		} else if (!resumoDocumento.equals(other.resumoDocumento))
			return false;
		if (revisaoArquivo == null) {
			if (other.revisaoArquivo != null)
				return false;
		} else if (!revisaoArquivo.equals(other.revisaoArquivo))
			return false;
		if (status != other.status)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Documento(long documentoId, String nivelDocumento, String titulo, int administrador, boolean pastaDocumento,
			String nomeArquivo, String extensaoArquivo, String revisaoArquivo, int alterarNumero, int status,
			String resumoDocumento, String documento, Date dataModificacao, Produto produto) {
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
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Documento [documentoId=" + documentoId + ", nivelDocumento=" + nivelDocumento + ", titulo=" + titulo
				+ ", administrador=" + administrador + ", pastaDocumento=" + pastaDocumento + ", nomeArquivo="
				+ nomeArquivo + ", extensaoArquivo=" + extensaoArquivo + ", revisaoArquivo=" + revisaoArquivo
				+ ", alterarNumero=" + alterarNumero + ", status=" + status + ", resumoDocumento=" + resumoDocumento
				+ ", documento=" + documento + ", dataModificacao=" + dataModificacao + ", produto=" + produto + "]";
	}	
	
}
