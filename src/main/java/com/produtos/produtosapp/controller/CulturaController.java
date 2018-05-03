package com.produtos.produtosapp.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.produtos.produtosapp.model.Cultura;
import com.produtos.produtosapp.repository.CulturaRepository;

@Controller
public class CulturaController {
	
	@Autowired
	private CulturaRepository cr;
	
	@RequestMapping(value="/cadastrarCultura", method=RequestMethod.GET)
	public String form()
	{
		return "cultura/formCultura";
	}
	
	@RequestMapping(value="/cadastrarCultura", method=RequestMethod.POST)
	public String form(Cultura cultura)
	{
		Date data = new Date(System.currentTimeMillis());
		cultura.setDataCadastro(data);
		cr.save(cultura);
		return "redirect:/cadastrarCultura";
	}
	@RequestMapping("/culturas")
	public ModelAndView listaCulturas() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Cultura> culturas = cr.findAll();
		mv.addObject("culturas", culturas);
		return mv;
	}
	@RequestMapping("/{culturaId}")
	public ModelAndView detalhesCultura(@PathVariable("culturaId") long culturaId) {
		Cultura cultura = cr.findByculturaId(culturaId);
		ModelAndView mv = new ModelAndView("cultura/detalhesCultura");
		mv.addObject("cultura", cultura);
		return mv;
	}
	
	//nao ta fumegando
	
	@RequestMapping("/deletar/{culturaId}")
	public ModelAndView deletarCultura(@PathVariable("culturaId") long culturaId )
	{
		Cultura cultura = cr.findByculturaId(culturaId);
		ModelAndView mv = new ModelAndView("index");
		cr.delete(cultura);
		return mv;
	}

}
