package com.ista.springboot.web.app.services;

import java.util.List;

import com.ista.springboot.web.app.entidades.Empleados;
import com.ista.springboot.web.app.entidades.Productos;
import com.ista.springboot.web.app.entidades.Vendedor;

public interface entidadesCRUDservices {
	
	public List<Empleados> findAll();
	public Empleados save(Empleados empleado);
	public Empleados findById(int id);
	public void delete( int id);
	
	//Productos
	public List<Productos> findAllProducts();
	public Productos saveProduct(Productos producto);
	public Productos findByIdProduct(int id);
	public void delete_product( int id);
	
	//Vendedor	
	public List<Vendedor> findAllVendedor();
	public Vendedor saveVendedor(Vendedor vendedor);
	public Vendedor findByIdVendedor(int id);
	public void delete_vendedor( int id);


}
