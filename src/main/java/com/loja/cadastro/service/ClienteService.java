/**
 * 
 */
package com.loja.cadastro.service;

import java.util.List;

import com.loja.cadastro.model.Cliente;
import com.loja.cadastro.model.dto.ClienteRequestDTO;

/**
 * @author pedro.cordeiro
 *
 */
public interface ClienteService {

	public List<Cliente> allClientes();
	public Cliente clienteById(Integer codigoCliente);
	public Cliente createCliente(ClienteRequestDTO cliente);
	public Cliente updateCliente(Integer codigoCliente, Cliente cliente);
	void deleteCliente(Integer codigoCliente);

	
}
