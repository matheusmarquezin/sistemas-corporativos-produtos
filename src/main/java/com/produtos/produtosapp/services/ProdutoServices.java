package com.produtos.produtosapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.produtosapp.model.Produto;
import com.produtos.produtosapp.repository.ProdutoRepository;


@RestController
@RequestMapping("/produto")
public class ProdutoServices {
	
	@Autowired
	ProdutoRepository Pr;
	
	@GetMapping(value="/{Id}", produces="application/json")
	public @ResponseBody Produto produto(@PathVariable(value="Id") String Id)
	{
		Produto cliente = Pr.findOne(Id);
		return cliente;
	}
	

}
