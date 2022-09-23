package com.ista.springboot.web.app.modeloDao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.web.app.entidades.Empleados;
import com.ista.springboot.web.app.entidades.Vendedor;


public interface vendedorDao extends  CrudRepository<Vendedor,Integer>{

}
