package com.laryssa.springmongo.ProjetoVendas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laryssa.springmongo.ProjetoVendas.entities.Produto;
import com.laryssa.springmongo.ProjetoVendas.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public Produto criar (Produto produto) {
		return repository.save(produto);
	}
	
	public Produto atualizar (String id, Produto produto) {
		return repository.save(produto);
	}
	
	public Optional<Produto> obterPorId (String id) {
		return repository.findById(id);
	}
	
	public Iterable<Produto> obterTodos (Produto produto) {
		return repository.findAll();
	}
	
	public void excluirPorId (String id) {
		repository.deleteById(id);
		
	}
	
	
}
