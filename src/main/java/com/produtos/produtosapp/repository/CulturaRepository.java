package com.produtos.produtosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.produtos.produtosapp.model.Cultura;

public interface CulturaRepository extends CrudRepository<Cultura, String> {
	
	Cultura findByculturaId(long culturaId);

}
