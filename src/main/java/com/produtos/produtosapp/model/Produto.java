package com.produtos.produtosapp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long produtoId;
	
	@NotNull
	private String nome;
	@NotNull
	private String numeroProduto;
	@NotNull
	private boolean bandeira;
	@NotNull
	private boolean bandeiraAcabado;
	
	private String Cor;
	@NotNull
	private int nivelEstoque;
	@NotNull
	private int pontoReordenar;
	@NotNull
	private double custoPadrao;
	@NotNull
	private double precoVenda;
	
	private String tamanhoProduto;
	
	private String unidadeMedidaTamanho;
	
	private String unidadeMedidaPeso;
	
	private double pesoProduto;
	@NotNull
	private int diasParaFabricarProduto;
	
	private String linhaDoProduto;
	
	private String classe;
	
	private String estilo;
	@NotNull
	private Date dataDisponivelVenda;
	
	private Date dataNaoDisponivelVenda;
	
	private Date dataProdutoDescontinuado;
	@NotNull
	private Date dataModificacao;
	
//	@ManyToMany
//	private FotoRelacao fotoRelacao;
 	
	@OneToMany
	List<Revisao> revisao;
	
	@OneToMany
	public List<Revisao> getRevisao() {
		return revisao;
	}

	public void setRevisao(List<Revisao> revisao) {
		this.revisao = revisao;
	}

	public Produto() {
		super();
		dataModificacao = new Date();
	}

	public Produto(long produtoId, String nome, String numeroProduto, boolean bandeira, boolean bandeiraAcabado,
			String cor, int nivelEstoque, int pontoReordenar, double custoPadrao, double precoVenda,
			String tamanhoProduto, String unidadeMedidaTamanho, String unidadeMedidaPeso, double pesoProduto,
			int diasParaFabricarProduto, String linhaDoProduto, String classe, String estilo, Date dataDisponivelVenda,
			Date dataNaoDisponivelVenda, Date dataProdutoDescontinuado, Date dataModificacao) {
		super();
		this.produtoId = produtoId;
		this.nome = nome;
		this.numeroProduto = numeroProduto;
		this.bandeira = bandeira;
		this.bandeiraAcabado = bandeiraAcabado;
		Cor = cor;
		this.nivelEstoque = nivelEstoque;
		this.pontoReordenar = pontoReordenar;
		this.custoPadrao = custoPadrao;
		this.precoVenda = precoVenda;
		this.tamanhoProduto = tamanhoProduto;
		this.unidadeMedidaTamanho = unidadeMedidaTamanho;
		this.unidadeMedidaPeso = unidadeMedidaPeso;
		this.pesoProduto = pesoProduto;
		this.diasParaFabricarProduto = diasParaFabricarProduto;
		this.linhaDoProduto = linhaDoProduto;
		this.classe = classe;
		this.estilo = estilo;
		this.dataDisponivelVenda = dataDisponivelVenda;
		this.dataNaoDisponivelVenda = dataNaoDisponivelVenda;
		this.dataProdutoDescontinuado = dataProdutoDescontinuado;
		this.dataModificacao = dataModificacao;
	}

	public long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(long produtoId) {
		this.produtoId = produtoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroProduto() {
		return numeroProduto;
	}

	public void setNumeroProduto(String numeroProduto) {
		this.numeroProduto = numeroProduto;
	}

	public boolean isBandeira() {
		return bandeira;
	}

	public void setBandeira(boolean bandeira) {
		this.bandeira = bandeira;
	}

	public boolean isBandeiraAcabado() {
		return bandeiraAcabado;
	}

	public void setBandeiraAcabado(boolean bandeiraAcabado) {
		this.bandeiraAcabado = bandeiraAcabado;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public int getNivelEstoque() {
		return nivelEstoque;
	}

	public void setNivelEstoque(int nivelEstoque) {
		this.nivelEstoque = nivelEstoque;
	}

	public int getPontoReordenar() {
		return pontoReordenar;
	}

	public void setPontoReordenar(int pontoReordenar) {
		this.pontoReordenar = pontoReordenar;
	}

	public double getCustoPadrao() {
		return custoPadrao;
	}

	public void setCustoPadrao(double custoPadrao) {
		this.custoPadrao = custoPadrao;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getTamanhoProduto() {
		return tamanhoProduto;
	}

	public void setTamanhoProduto(String tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	}

	public String getUnidadeMedidaTamanho() {
		return unidadeMedidaTamanho;
	}

	public void setUnidadeMedidaTamanho(String unidadeMedidaTamanho) {
		this.unidadeMedidaTamanho = unidadeMedidaTamanho;
	}

	public String getUnidadeMedidaPeso() {
		return unidadeMedidaPeso;
	}

	public void setUnidadeMedidaPeso(String unidadeMedidaPeso) {
		this.unidadeMedidaPeso = unidadeMedidaPeso;
	}

	public double getPesoProduto() {
		return pesoProduto;
	}

	public void setPesoProduto(double pesoProduto) {
		this.pesoProduto = pesoProduto;
	}

	public int getDiasParaFabricarProduto() {
		return diasParaFabricarProduto;
	}

	public void setDiasParaFabricarProduto(int diasParaFabricarProduto) {
		this.diasParaFabricarProduto = diasParaFabricarProduto;
	}

	public String getLinhaDoProduto() {
		return linhaDoProduto;
	}

	public void setLinhaDoProduto(String linhaDoProduto) {
		this.linhaDoProduto = linhaDoProduto;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public Date getDataDisponivelVenda() {
		return dataDisponivelVenda;
	}

	public void setDataDisponivelVenda(Date dataDisponivelVenda) {
		this.dataDisponivelVenda = dataDisponivelVenda;
	}

	public Date getDataNaoDisponivelVenda() {
		return dataNaoDisponivelVenda;
	}

	public void setDataNaoDisponivelVenda(Date dataNaoDisponivelVenda) {
		this.dataNaoDisponivelVenda = dataNaoDisponivelVenda;
	}

	public Date getDataProdutoDescontinuado() {
		return dataProdutoDescontinuado;
	}

	public void setDataProdutoDescontinuado(Date dataProdutoDescontinuado) {
		this.dataProdutoDescontinuado = dataProdutoDescontinuado;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
}
