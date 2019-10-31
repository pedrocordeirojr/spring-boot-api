package com.loja.cadastro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.cadastro.model.Cliente;
import com.loja.cadastro.model.dto.ClienteRequestDTO;
import com.loja.cadastro.repository.ClienteRepository;
import com.loja.cadastro.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository IClienteRepository;
	
	@Override
	public List<Cliente> allClientes() {
		return IClienteRepository.findAll();
	}

	@Override
	public Cliente clienteById(Integer codigoCliente) {
		return IClienteRepository.findById(codigoCliente).get();
	}

	@Override
	public Cliente createCliente(ClienteRequestDTO clienteRequestDTO) {
		Cliente cliente = new Cliente(clienteRequestDTO.getNome());
		return IClienteRepository.save(cliente);
	}

	@Override
	public Cliente updateCliente(Integer codigoCliente, Cliente cliente) {
		Cliente clienteDomain = IClienteRepository.findById(codigoCliente).get();
		clienteDomain.setNome(cliente.getNome());
		return IClienteRepository.save(clienteDomain);
	}

	@Override
	public void deleteCliente(Integer codigoCliente) {
		Cliente clienteDomain = IClienteRepository.findById(codigoCliente).get();
		 IClienteRepository.delete(clienteDomain);
	}

}
