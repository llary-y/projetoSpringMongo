package com.laryssa.springmongo.ProjetoVendas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.laryssa.springmongo.ProjetoVendas.entities.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String>{

}
