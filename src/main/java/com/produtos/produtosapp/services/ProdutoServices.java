package com.produtos.produtosapp.services;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;



import com.produtos.produtosapp.model.Produto;
import com.produtos.produtosapp.model.ProdutoExterno;
import com.produtos.produtosapp.repository.CulturaRepository;
import com.produtos.produtosapp.repository.DescricaoRepository;
import com.produtos.produtosapp.repository.DocumentoRepository;
import com.produtos.produtosapp.repository.FotoRepository;
import com.produtos.produtosapp.repository.IlustracaoRepository;
import com.produtos.produtosapp.repository.ModeloRepository;
import com.produtos.produtosapp.repository.ProdutoCategoriaRepository;
import com.produtos.produtosapp.repository.ProdutoExternoRepository;
import com.produtos.produtosapp.repository.ProdutoRepository;
import com.produtos.produtosapp.repository.ProdutoSubCategoriaRepository;
import com.produtos.produtosapp.repository.RevisaoRepository;
import com.produtos.produtosapp.repository.UnidadeMedidaRepository;


@Service
public class ProdutoServices {
	
	@Autowired
	ProdutoRepository ProdutoRepositorio;
	@Autowired
	FotoRepository FotoRepositorio;
	@Autowired
	RevisaoRepository RevisaoRepositorio;
	@Autowired
	UnidadeMedidaRepository UnidadeMedidaRepositorio;
	@Autowired
	ProdutoSubCategoriaRepository ProdutoSubCategoriaRepositorio;
	@Autowired
	ProdutoCategoriaRepository ProdutoCategoriaRepositorio;
	@Autowired
	ModeloRepository ModeloRepositorio;
	@Autowired
	IlustracaoRepository IlustracaoRepositorio;
	@Autowired
	DocumentoRepository DocumentoRepositorio;
	@Autowired
	DescricaoRepository DescricaoRepositorio;
	@Autowired
	CulturaRepository CulturaRepositorio;
	@Autowired
	ProdutoExternoRepository ProdutoExternoRepositirio;
	
	public Iterable<Produto>listarProdutos()
	{
		return ProdutoRepositorio.findAll();
	}
	
	public Iterable<ProdutoExterno>listarProdutoExterno()
	{
		return ProdutoExternoRepositirio.findAll();
	}
	
//	@GetMapping(value="/{Id}", produces="application/json")
//	public @ResponseBody Produto produto(@PathVariable(value="Id") long Id)
//	{
//		Produto cliente = ProdutoRepositorio.findOne(Id);
//		return cliente;
//	}
//	
//	@GetMapping
//	public @ResponseBody Iterable<Produto> listaProdutos()
//	{
//		Iterable<Produto> listaProdutos = ProdutoRepositorio.findAll();
//		return listaProdutos;
//		
//	}
//	@PostMapping
//	public String cadastrarCliente(@RequestBody @Valid Produto produto)
//	{
////		for(Documento contato: produto.ge)
////	{			contatoR.save(contato);
////		}
////		for(Fotos endereco: produto.getEndereco())
////		{
////			er.save(endereco);
////		}
////			
////		contatoR.flush();
////		er.flush();	
//		Date data = new Date(System.currentTimeMillis());
//		produto.setDataDisponivelVenda(data);
//		produto.setDataNaoDisponivelVenda(data);
//		produto.setDataProdutoDescontinuado(data);
//		
//		ProdutoRepositorio.save(produto);
//		
//		return "OK";
//		
//		
//	}
//	@DeleteMapping(value="/{Id}", produces="application/json")
//	public @ResponseBody String deletarProduto(@PathVariable(value="Id") long Id)
//	{
//		Produto cliente = ProdutoRepositorio.findOne(Id);
//		ProdutoRepositorio.delete(cliente);
//		return "OK";
//	}
//	

}
