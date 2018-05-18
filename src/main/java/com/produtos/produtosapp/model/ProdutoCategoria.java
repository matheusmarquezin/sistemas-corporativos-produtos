package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class ProdutoCategoria {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)		
		private long ProdutoCategoriaID;
		
		@NotNull
		private String nome;
		@NotNull
		private Date dataModificacao;
		@ManyToOne
		private ProdutoSubCategoria  produtoSubCategoria;		
				
				
		public ProdutoSubCategoria getProdutoSubCategoria() {
			return produtoSubCategoria;
		}
		public void setProdutoSubCategoria(ProdutoSubCategoria produtoSubCategoria) {
			this.produtoSubCategoria = produtoSubCategoria;
		}
		public ProdutoCategoria(long produtoCategoriaID, String nome, Date dataModificacao) {
			super();
			ProdutoCategoriaID = produtoCategoriaID;
			this.nome = nome;
			this.dataModificacao = dataModificacao;
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
			
}
