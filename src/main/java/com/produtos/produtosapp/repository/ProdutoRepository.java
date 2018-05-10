package com.produtos.produtosapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.produtosapp.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String>{
	
	Produto findByProdutoId( long produtoId);

}
