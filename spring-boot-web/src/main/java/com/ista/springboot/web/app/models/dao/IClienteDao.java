package com.ista.springboot.web.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.web.app.entity.Cliente;

public interface IClienteDao extends  CrudRepository<Cliente,Long>{

}
