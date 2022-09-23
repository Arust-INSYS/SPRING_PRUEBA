package com.ista.springboot.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.web.app.entidades.Empleados;
import com.ista.springboot.web.app.entidades.Productos;
import com.ista.springboot.web.app.entidades.Vendedor;
import com.ista.springboot.web.app.modeloDao.ProductosDao;
import com.ista.springboot.web.app.modeloDao.empleadosDao;
import com.ista.springboot.web.app.modeloDao.vendedorDao;


@Service
public class entidadesServices implements  entidadesCRUDservices{
	@Autowired
	private empleadosDao empDao;
	
	@Override
	@Transactional (readOnly=true)
	
	public List<Empleados> findAll() {
		// TODO Auto-generated method stub
		return (List<Empleados>) empDao.findAll();
	}

	@Override
	@Transactional 
	public Empleados save(Empleados emp) {
		// TODO Auto-generated method stub
		return empDao.save(emp);
	}
	
	
	@Override
	@Transactional (readOnly=true)
	public 	Empleados findById(int id) {
		// TODO Auto-generated method stub
		return empDao.findById(id).orElse(null);
	}

	@Override
	@Transactional 
	public void delete(int id) {
		// TODO Auto-generated method stub
		empDao.deleteById(id);
		
	}
	
	//PRODUCTOS
	@Autowired
	private ProductosDao proDao;

	@Override
	public List<Productos> findAllProducts() {
		// TODO Auto-generated method stub
		return (List<Productos>) proDao.findAll();
	}
	//Guardar

	@Override
	public Productos saveProduct(Productos producto) {
		// TODO Auto-generated method stub
		return proDao.save(producto);
	}

	@Override
	public Productos findByIdProduct(int id) {
		// TODO Auto-generated method stub
		return proDao.findById(id).orElse(null);
	}

	@Override
	public void delete_product(int id) {
		// TODO Auto-generated method stub
		proDao.deleteById(id);
		
	}
	
	
	//VENDEDOR
	@Autowired
	private vendedorDao venDao;

	@Override
	public List<Vendedor> findAllVendedor() {
		// TODO Auto-generated method stub
		return (List<Vendedor>) venDao.findAll();
	}

	@Override
	public Vendedor saveVendedor(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return venDao.save(vendedor);
	}

	@Override
	public Vendedor findByIdVendedor(int id) {
		// TODO Auto-generated method stub
		return venDao.findById(id).orElse(null);
	}

	@Override
	public void delete_vendedor(int id) {
		// TODO Auto-generated method stub
		venDao.deleteById(id);
	}

}
