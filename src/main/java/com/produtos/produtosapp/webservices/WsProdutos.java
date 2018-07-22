package com.produtos.produtosapp.webservices;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.produtos.produtosapp.model.ProdutoExterno;

@Component
public class WsProdutos {

	private final RestTemplate rest = new RestTemplate();
	private final String srvProdutos = "http://localhost:8081/produtos";
	
	public ProdutoExterno buscarProdutoPorId(Long produtoId)
	{
		Map<String, Long> params = new HashMap<>();
		params.put("id", produtoId);
		return rest.getForObject(srvProdutos + "/{id}?projection=produtoExterno", ProdutoExterno.class, params);
		
	}
}
