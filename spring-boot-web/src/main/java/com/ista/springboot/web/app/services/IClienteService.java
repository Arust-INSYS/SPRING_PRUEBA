package com.ista.springboot.web.app.services;

import java.util.List;

import com.ista.springboot.web.app.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	public Cliente save(Cliente cliente);
	public Cliente findById(Long id);
	public void delete( Long id);
	
	

}
