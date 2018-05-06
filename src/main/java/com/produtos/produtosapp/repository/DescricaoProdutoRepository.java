package com.produtos.produtosapp.repository;

import org.springframework.data.repository.CrudRepository;


import com.produtos.produtosapp.model.DescricaoProduto;

public interface DescricaoProdutoRepository extends CrudRepository<DescricaoProduto, String>{
	
	DescricaoProduto findByDescricaoProdutoId(long DescricaoProdutoId);

}
