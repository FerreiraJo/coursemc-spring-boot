package com.jonathanferreira.coursemc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jonathanferreira.coursemc.domain.Categoria;
import com.jonathanferreira.coursemc.domain.Cidade;
import com.jonathanferreira.coursemc.domain.Cliente;
import com.jonathanferreira.coursemc.domain.Endereco;
import com.jonathanferreira.coursemc.domain.Estado;
import com.jonathanferreira.coursemc.domain.Produto;
import com.jonathanferreira.coursemc.domain.enums.TipoCliente;
import com.jonathanferreira.coursemc.repositories.CategoriaRepository;
import com.jonathanferreira.coursemc.repositories.CidadeRepository;
import com.jonathanferreira.coursemc.repositories.ClienteRepository;
import com.jonathanferreira.coursemc.repositories.EnderecoRepository;
import com.jonathanferreira.coursemc.repositories.EstadoRepository;
import com.jonathanferreira.coursemc.repositories.ProdutoRepository;

@SpringBootApplication
public class CoursemcApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository endeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CoursemcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Mouse", 80.00);
		Produto p3 = new Produto(null, "Impressora", 800.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));	
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "11111111", TipoCliente.PESSOAFISICA);
		
		cli1.getTelefones().addAll(Arrays.asList("40028922", "41212828"));
		
		Endereco e1 = new Endereco(null, "Ruas Flores", "144", "apto 303", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Av. Matos", "150", "Sala 800", "Centro", "38244545", cli1, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		endeRepository.saveAll(Arrays.asList(e1, e2));
	}

}
