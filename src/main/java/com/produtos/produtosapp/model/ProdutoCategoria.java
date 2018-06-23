package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "produtoCategoria")
public class ProdutoCategoria {
		@Id
		@GeneratedValue		
		private long ProdutoCategoriaID;
		
		@NotNull
		private String nome;
		@NotNull
		private Date dataModificacao;
		@OneToOne
		private ProdutoSubCategoria  produtoSubCategoria;
		
		
		
		public ProdutoCategoria() {
			super();
			// TODO Auto-generated constructor stub
		}	
		

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (ProdutoCategoriaID ^ (ProdutoCategoriaID >>> 32));
			result = prime * result + ((dataModificacao == null) ? 0 : dataModificacao.hashCode());
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((produtoSubCategoria == null) ? 0 : produtoSubCategoria.hashCode());
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
			ProdutoCategoria other = (ProdutoCategoria) obj;
			if (ProdutoCategoriaID != other.ProdutoCategoriaID)
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
			if (produtoSubCategoria == null) {
				if (other.produtoSubCategoria != null)
					return false;
			} else if (!produtoSubCategoria.equals(other.produtoSubCategoria))
				return false;
			return true;
		}



		public long getProdutoCategoriaID() {
			return ProdutoCategoriaID;
		}

		public void setProdutoCategoriaID(long produtoCategoriaID) {
			ProdutoCategoriaID = produtoCategoriaID;
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

		public ProdutoSubCategoria getProdutoSubCategoria() {
			return produtoSubCategoria;
		}


		public void setProdutoSubCategoria(ProdutoSubCategoria produtoSubCategoria) {
			this.produtoSubCategoria = produtoSubCategoria;
		}

		public ProdutoCategoria(long produtoCategoriaID, String nome, Date dataModificacao,
				ProdutoSubCategoria produtoSubCategoria) {
			super();
			ProdutoCategoriaID = produtoCategoriaID;
			this.nome = nome;
			this.dataModificacao = dataModificacao;
			this.produtoSubCategoria = produtoSubCategoria;
		}

		@Override
		public String toString() {
			return "ProdutoCategoria [ProdutoCategoriaID=" + ProdutoCategoriaID + ", nome=" + nome
					+ ", dataModificacao=" + dataModificacao + ", produtoSubCategoria=" + produtoSubCategoria + "]";
		}	
		
			
}
