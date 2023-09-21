package com.laryssa.springmongo.ProjetoVendas.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Cliente {

	@Id
	private String id;
	
	private String nome;
	
	private String cpf;
		
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
