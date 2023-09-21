package com.laryssa.springmongo.ProjetoVendas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.laryssa.springmongo.ProjetoVendas.entities.Cliente;
import com.laryssa.springmongo.ProjetoVendas.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public Cliente criar (Cliente cliente) {
		return repository.save(cliente);
	}
	
	public Iterable<Cliente> obterTodos (Cliente cliente) {
		return repository.findAll();
	}
	
	public Optional<Cliente> obterPorId (String id){
		return repository.findById(id);
	}
	
	public Cliente atualizar (String id, Cliente cliente) {
		return repository.save(cliente);
	}

	public void excluir (String id) {
		repository.deleteById(id);
	}
}
