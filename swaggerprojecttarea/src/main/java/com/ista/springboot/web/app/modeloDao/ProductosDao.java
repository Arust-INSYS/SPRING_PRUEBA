package com.ista.springboot.web.app.modeloDao;

import org.springframework.data.repository.CrudRepository;


import com.ista.springboot.web.app.entidades.Productos;


public interface ProductosDao extends  CrudRepository<Productos,Integer>{

}
