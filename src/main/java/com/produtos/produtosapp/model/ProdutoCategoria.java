package com.produtos.produtosapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ProdutoCategoria {


		
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private String  ProdutoCategoriaID;
		
		@NotNull
		private String nome;
		@NotNull
		private Date dataModificacao;
		
		
				
		public ProdutoCategoria() {
			super();
			dataModificacao = new Date();
		}
		public ProdutoCategoria(String produtoCategoriaID, String nome, Date dataModificacao) {
			super();
			ProdutoCategoriaID = produtoCategoriaID;
			this.nome = nome;
			this.dataModificacao = dataModificacao;
		}
		public String getProdutoCategoriaID() {
			return ProdutoCategoriaID;
		}
		public void setProdutoCategoriaID(String produtoCategoriaID) {
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
