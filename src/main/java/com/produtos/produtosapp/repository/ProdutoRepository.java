package com.produtos.produtosapp.repository;


import org.springframework.data.repository.CrudRepository;

import com.produtos.produtosapp.model.Produto;


public interface ProdutoRepository extends CrudRepository<Produto, Long>{

	//Produto findByName(String nome);	
	
}
