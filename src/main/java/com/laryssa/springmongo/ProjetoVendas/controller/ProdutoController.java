package com.laryssa.springmongo.ProjetoVendas.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laryssa.springmongo.ProjetoVendas.entities.Produto;
import com.laryssa.springmongo.ProjetoVendas.service.ProdutoService;

@RestController
@RequestMapping ("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@PostMapping ("/criar")
	public Produto criar (@RequestBody Produto produto) {
		return this.service.criar(produto);
	}
	
	@GetMapping ("/{id}")
	public Optional<Produto> obterPorId (@PathVariable String id) {
		return this.service.obterPorId(id);
	}
	
	@GetMapping ("/obterProdutos")
	public Iterable<Produto> obterTodos (@RequestBody Produto produto) {
		return this.service.obterTodos(produto);
	}
	
	@PutMapping ("/{id}")
	public Produto atualizar (@PathVariable String id, @RequestBody Produto produto) {
		return this.service.atualizar(id, produto);
	}
	
	@DeleteMapping ("/{id}")
	public void excluir (@PathVariable String id)  {
		this.service.excluirPorId(id);
	}
	
}
 