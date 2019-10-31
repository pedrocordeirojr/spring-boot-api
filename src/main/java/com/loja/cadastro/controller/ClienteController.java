package com.loja.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.cadastro.model.Cliente;
import com.loja.cadastro.model.dto.ClienteRequestDTO;
import com.loja.cadastro.service.impl.ClienteServiceImpl;


@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteServiceImpl clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> allClientes(){		
		return ResponseEntity.ok().body(clienteService.allClientes());
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Cliente> createCliente(@RequestBody ClienteRequestDTO cliente){
		return ResponseEntity.ok().body(clienteService.createCliente(cliente));
	}

}
