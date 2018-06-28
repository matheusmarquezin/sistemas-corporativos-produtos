package com.produtos.produtosapp.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.produtos.produtosapp.model.Produto;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config)
	{
		super.configureRepositoryRestConfiguration(config);
		config.exposeIdsFor(Produto.class);
		
	}

}
