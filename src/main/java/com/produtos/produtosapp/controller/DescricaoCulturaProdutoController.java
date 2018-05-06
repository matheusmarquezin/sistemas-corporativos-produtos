package com.produtos.produtosapp.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.produtos.produtosapp.model.DescricaoCulturaProduto;

import com.produtos.produtosapp.repository.DescricaoCulturaProdutoRepository;

public class DescricaoCulturaProdutoController {
	
	@Autowired
	private DescricaoCulturaProdutoRepository dcp;
	
	@RequestMapping(value="/cadastrarDescricaoCulturaProdutoController", method=RequestMethod.GET)
	public String form()
	{
		return "DescricaoCulturaProdutoController/formDescricaoCulturaProdutoController";
	}
	
	@RequestMapping(value="/cadastrarDescricaoCulturaProdutoController", method=RequestMethod.POST)
	public String form(DescricaoCulturaProduto descricaoculturaproduto)
	{
		Date data = new Date(System.currentTimeMillis());
		descricaoculturaproduto.setDataCadastro(data);
		dcp.save(descricaoculturaproduto);
		//attributes.addFlashAttribute("mensagem", "Salvo com Sucesso");
		return "redirect:/cadastrarDescricaoCulturaProduto";
	}
	@RequestMapping("/DescricaoCulturaProduto")
	public ModelAndView listaDescricaoCulturaProduto() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<DescricaoCulturaProduto> descricaoCulturaProduto = dcp.findAll();
		mv.addObject("descricaoCulturaProduto", descricaoCulturaProduto);
		return mv;
	}
	@RequestMapping("/{DescricaoCulturaProdutoId}")
	public ModelAndView detalhesDescricaoCulturaProduto(@PathVariable("DescricaoCulturaProdutoId") long DescricaoCulturaProdutoId) {
		DescricaoCulturaProduto descricaoCulturaProduto = dcp.findByDescricaoCulturaProdutoId(DescricaoCulturaProdutoId);
		ModelAndView mv = new ModelAndView("cultura/detalhesCultura");
		mv.addObject("cultura", descricaoCulturaProduto);
		return mv;
	}
		
	@RequestMapping("/deletarCultura")
	public String deletarCultura( long DescricaoCulturaProdutoId )
	{
		DescricaoCulturaProduto descricaoCulturaProduto = dcp.findByDescricaoCulturaProdutoId(DescricaoCulturaProdutoId);
		dcp.delete(descricaoCulturaProduto);
		return "redirect:/descricaoCulturaProduto";
	}

}
