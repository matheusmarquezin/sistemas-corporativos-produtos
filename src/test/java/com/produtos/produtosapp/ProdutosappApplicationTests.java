package com.produtos.produtosapp;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.produtos.produtosapp.model.Cultura;
import com.produtos.produtosapp.model.Descricao;
import com.produtos.produtosapp.model.Documento;
import com.produtos.produtosapp.model.Fotos;
import com.produtos.produtosapp.model.Ilustracao;
import com.produtos.produtosapp.model.Modelo;
import com.produtos.produtosapp.model.Produto;
import com.produtos.produtosapp.model.ProdutoCategoria;
import com.produtos.produtosapp.model.ProdutoSubCategoria;
import com.produtos.produtosapp.model.Revisao;
import com.produtos.produtosapp.model.UnidadeMedida;
import com.produtos.produtosapp.repository.CulturaRepository;
import com.produtos.produtosapp.repository.DescricaoRepository;
import com.produtos.produtosapp.repository.DocumentoRepository;
import com.produtos.produtosapp.repository.FotoRepository;
import com.produtos.produtosapp.repository.IlustracaoRepository;
import com.produtos.produtosapp.repository.ModeloRepository;
import com.produtos.produtosapp.repository.ProdutoCategoriaRepository;
import com.produtos.produtosapp.repository.ProdutoRepository;
import com.produtos.produtosapp.repository.ProdutoSubCategoriaRepository;
import com.produtos.produtosapp.repository.RevisaoRepository;
import com.produtos.produtosapp.repository.UnidadeMedidaRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutosappApplicationTests {
	
	@Autowired
	private ProdutoRepository ProdutoRepositorio;
	@Autowired
	private FotoRepository FotosRepositorio;
	@Autowired
	private UnidadeMedidaRepository UnidadeMedidaRepositorio;
	@Autowired
	private RevisaoRepository RevisaoRepositorio;
	@Autowired
	private ProdutoCategoriaRepository ProdutoCategoriaRepositorio;
	@Autowired
	private ProdutoSubCategoriaRepository ProdutoSubCategoriaRepositorio;
	@Autowired
	private ModeloRepository ModeloRepositorio;
	@Autowired
	private IlustracaoRepository IlustracaoRepositorio;
	@Autowired
	private DocumentoRepository DocumentosRepositorio;
	@Autowired
	private DescricaoRepository DescricaoRepositorio;
	@Autowired
	private CulturaRepository CulturaRepositorio;
	
	

	@Test
	public void ProdutoCreate() {		
		

		Produto produto = new Produto();
		Fotos fotos = new Fotos();
		UnidadeMedida unidadeMedida = new UnidadeMedida();
		Revisao revisao = new Revisao();
		ProdutoSubCategoria produtoSubCategoria = new ProdutoSubCategoria();
		ProdutoCategoria produtoCategoria = new ProdutoCategoria();
		Ilustracao ilustracao = new Ilustracao();
		Descricao descricao = new Descricao();
		Cultura cultura = new Cultura();
		Documento documentos = new Documento();
		Modelo modelo = new Modelo();
		Date data = new Date(System.currentTimeMillis());

		// criar
		produto.setNome("M");
		produto.setNumeroProduto("8");
		produto.setBandeira(true);
		produto.setBandeiraAcabado(false);
		produto.setCor("v");		
		produto.setNivelEstoque(6);
		produto.setPontoReordenar(2);
		produto.setCustoPadrao(5);
		produto.setPrecoVenda(5);
		produto.setTamanhoProduto("2");
		produto.setUnidadeMedidaTamanho("");
		produto.setUnidadeMedidaPeso("");
		produto.setPesoProduto(2);
		produto.setDiasParaFabricarProduto(1);
		produto.setLinhaDoProduto("M");
		produto.setClasse("H");
		produto.setEstilo("U");		
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
		
		unidadeMedida.setDataModificacao(data);
		unidadeMedida.setNome("Tamanho quadro pol");
		//unidadeMedida.setProduto(produto);
		
		revisao.setDataModificacao(data);
		revisao.setComentarios("discos retificados");
		revisao.setDataRevisao(data);
		revisao.setEnderecoEmail("mecanico1@bike.com");
		revisao.setNomeRevisao("Reparo freios");
		revisao.setProduto(produto);
		
		produtoCategoria.setDataModificacao(data);
		produtoCategoria.setNome("primeira");
		//produtoCategoria.setProdutoSubCategoria(produtoSubCategoria);
		
		produtoSubCategoria.setDataModificacao(data);
		produtoSubCategoria.setNome("pedal");
		produtoSubCategoria.setProduto(produto);
		produtoSubCategoria.setProdutoCategoria(produtoCategoria);
		
		ilustracao.setDataModificacao(data);
		ilustracao.setDiagrama("http://jcuwuwdb.wdjb.js");
	
	
		descricao.setDataCadastro(data);
		descricao.setDescricao("barulhos traseiro");
		
		
		cultura.setDataCadastro(data);
		cultura.setNome("para o barro");
		
		
		documentos.setAdministrador(12);
		documentos.setAlterarNumero(45);
		documentos.setDataModificacao(data);
		documentos.setDocumento("planta mecanica");
		documentos.setExtensaoArquivo(".pdf");
		documentos.setNivelDocumento("restrito");
		documentos.setNomeArquivo("First 10");
		documentos.setPastaDocumento(true);
		documentos.setProduto(produto);
		documentos.setResumoDocumento("correções parte transmissão");
		documentos.setRevisaoArquivo("final");
		documentos.setStatus(10);
		documentos.setTitulo("correcao de divergencias de planta");
		
		modelo.setCatalogoDescricao("19,20,30");
		modelo.setCultura(cultura);
		modelo.setDataModificacao(data);
		modelo.setDescricao(descricao);
		modelo.setIlustracoes(ilustracao);
		modelo.setInstrucao("ftp://jbudb.wnwb.sq");
		modelo.setNome("First 10");
		modelo.setProtuto(produto);	
		
		

		ProdutoRepositorio.save(produto);
		FotosRepositorio.save(fotos);
		UnidadeMedidaRepositorio.save(unidadeMedida);
		RevisaoRepositorio.save(revisao);
		ProdutoCategoriaRepositorio.save(produtoCategoria);
		ProdutoSubCategoriaRepositorio.save(produtoSubCategoria);
		CulturaRepositorio.save(cultura);
		DescricaoRepositorio.save(descricao);
		DocumentosRepositorio.save(documentos);
		IlustracaoRepositorio.save(ilustracao);
		ModeloRepositorio.save(modelo);		
		
		
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
