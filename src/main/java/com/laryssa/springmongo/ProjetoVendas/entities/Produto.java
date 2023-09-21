package com.laryssa.springmongo.ProjetoVendas.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Produto {

	@Id
	private String id;
	
	private String nome;
	
	private double valor;
	
	private double desconto;

	public Produto(String nome, double valor, double desconto) {
		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
