package com.loja.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoCliente;
	
	

	@Column(name="nome")
	private String nome;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome) {
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}
	

}
