package com.produtos.produtosapp;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.produtos.produtosapp.model.Fotos;
import com.produtos.produtosapp.model.Produto;
import com.produtos.produtosapp.repository.FotoRepository;
import com.produtos.produtosapp.repository.ProdutoRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutosappApplicationTests {
	
	@Autowired
	private ProdutoRepository ProdutoRepositorio;
	@Autowired
	private FotoRepository FotosRepositorio;
	

	@Test
	public void ProdutoCreate() {
		
		

		Produto produto = new Produto();
		Fotos fotos = new Fotos();
		Date data = new Date(System.currentTimeMillis());

		// criar
		produto.setNome("Monark");
		produto.setNumeroProduto("834384839483");
		produto.setBandeira(true);
		produto.setBandeiraAcabado(false);
		produto.setCor("verde");		
		produto.setNivelEstoque(6);
		produto.setPontoReordenar(2);
		produto.setCustoPadrao(5000.00);
		produto.setPrecoVenda(5990.50);
		produto.setTamanhoProduto("29");
		produto.setUnidadeMedidaTamanho("Polegadas");
		produto.setUnidadeMedidaPeso("Kg");
		produto.setPesoProduto(26.06);
		produto.setDiasParaFabricarProduto(14);
		produto.setLinhaDoProduto("Montanha");
		produto.setClasse("High");
		produto.setEstilo("Universal");		
		produto.setDataDisponivelVenda(data);
		produto.setDataNaoDisponivelVenda(data);
		produto.setDataProdutoDescontinuado(data);
		produto.setDataModificacao(data);
		
		fotos.setDataModificacao(data);
		fotos.setImagemGrande("http://jbwefhebubewvb");
		fotos.setImagemPequena("http://jbshkdbhdbwed");
		fotos.setNomeImagemGrande("bike");
		fotos.setNomeImagemPequena("bikemini");
		fotos.setPrincipal(true);
		fotos.setProduto(produto);
		

		ProdutoRepositorio.save(produto);
		FotosRepositorio.save(fotos);
		
		String teste = produto.getNome();
		
		
		System.out.println(teste);		
		

		// listar
		for (Produto objeto : ProdutoRepositorio.findAll()) {
			System.out.println("\n" + "Produto ID: " + objeto.getProdutoId() + "\n" + "Nome: " + objeto.getNome() + "\n"
					+ "Numero do Produto  :" + objeto.getNumeroProduto() + "\n" + "Cor Produto : " + objeto.getCor()
					+ "\n" + "Nivel Estoque : " + objeto.getNivelEstoque() + "\n" + "Nivel de Estoque Minimo : "
					+ objeto.getPontoReordenar() + "\n" + "Custo Padrao : " + objeto.getCustoPadrao() + "\n"
					+ "Preco Venda : " + objeto.getPrecoVenda() + "\n" + "Tamanho Produto : "
					+ objeto.getTamanhoProduto() + "\n" + "Unidade Medida : " + objeto.getUnidadeMedidaTamanho() + "\n"
					+ "Unidade Medida Peso : " + objeto.getUnidadeMedidaPeso() + "\n" + "Peso Produto : "
					+ objeto.getPesoProduto() + "\n" + "Dias Para Fabricar Produto : "
					+ objeto.getDiasParaFabricarProduto() + "\n" + "Linha de Seguimento : " + objeto.getLinhaDoProduto()
					+ "\n" + "Classe do Produto : " + objeto.getClasse() + "\n" + "Estilo Produto : "
					+ objeto.getEstilo() + "\n" + "Data Disponivel Venda : " + objeto.getDataDisponivelVenda() + "\n"
					+ "Data nao disponivel : " + objeto.getDataNaoDisponivelVenda() + "\n"
					+ "Data descontinuado Produto : " + objeto.getDataProdutoDescontinuado() + "\n"
					+ "Data Modificação : " + objeto.getDataModificacao() + "\n");
		}

//		// deletar
//		long i = 7;
//		Produto produtodelete = ProdutoRepositorio.findOne(i);
//		ProdutoRepositorio.delete(produtodelete);
//
//		// alterar
//		long l = 7;
//		produto = ProdutoRepositorio.findOne(l);
//		produto.setCor("azul");
//		ProdutoRepositorio.save(produto);

	}
}
