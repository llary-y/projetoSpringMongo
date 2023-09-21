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

import com.laryssa.springmongo.ProjetoVendas.entities.Cliente;
import com.laryssa.springmongo.ProjetoVendas.service.ClienteService;

@RestController
@RequestMapping ("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@PostMapping ("/criar")
	public Cliente criar (@RequestBody Cliente cliente) {
		return this.service.criar(cliente);
	}
	
	@GetMapping ("/obterTodos")
	public Iterable<Cliente> obterTodos(@RequestBody Cliente cliente) {
		return this.service.obterTodos(cliente);
	}
	
	@GetMapping ("/{id}")
	public Optional<Cliente> obterPorId (@PathVariable String id){
		return this.service.obterPorId(id);
	}
	
	@PutMapping ("/{id}")
	public Cliente atualizar (@PathVariable String id, @RequestBody Cliente cliente) {
		return this.service.atualizar(id, cliente);
	}
	
	@DeleteMapping ("/{id}")
	public void excluir (@PathVariable String id) {
		this.service.excluir(id);
	}
}
