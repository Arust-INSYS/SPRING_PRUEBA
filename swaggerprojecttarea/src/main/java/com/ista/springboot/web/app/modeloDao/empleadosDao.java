package com.ista.springboot.web.app.modeloDao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.web.app.entidades.Empleados;


public interface empleadosDao extends  CrudRepository<Empleados,Integer>{

}
