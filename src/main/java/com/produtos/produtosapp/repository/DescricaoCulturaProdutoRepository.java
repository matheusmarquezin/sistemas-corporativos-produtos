package com.produtos.produtosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.produtos.produtosapp.model.DescricaoCulturaProduto;


public interface DescricaoCulturaProdutoRepository extends CrudRepository<DescricaoCulturaProduto, String>  {
	
	
	DescricaoCulturaProduto findByDescricaoCulturaProdutoId(long DescricaoCulturaProdutoId);

	

}
