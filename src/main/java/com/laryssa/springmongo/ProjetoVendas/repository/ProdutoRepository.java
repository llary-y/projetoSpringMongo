package com.laryssa.springmongo.ProjetoVendas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.laryssa.springmongo.ProjetoVendas.entities.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String>{

	

}
