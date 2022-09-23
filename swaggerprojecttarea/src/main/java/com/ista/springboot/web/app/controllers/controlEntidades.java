package com.ista.springboot.web.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.springboot.web.app.entidades.Empleados;
import com.ista.springboot.web.app.entidades.Productos;
import com.ista.springboot.web.app.entidades.Vendedor;
import com.ista.springboot.web.app.services.entidadesCRUDservices;



@RestController
@RequestMapping("/api")

public class controlEntidades {
	@Autowired
	private entidadesCRUDservices empleadoService;
	
	//LISTAR CLIENTES
	 @GetMapping ("/empleado")
	public List<Empleados> index(){
		return empleadoService.findAll();
	}
	//BUSCAR CLIENTE
		 @GetMapping ("/empleado/{id}")
		 public Empleados buscar(@PathVariable int id){
				return  empleadoService.findById(id);
			}
	//GUARDAR
		 @PostMapping ("/crearempleado")
		 @ResponseStatus(HttpStatus.CREATED)
		public Empleados  guardar(@RequestBody Empleados empl){
			return empleadoService.save(empl);
		}
	
	 
	 
	 //ACTUALIZAR UTILIZAMOS EL BUSCAR Y EL SAVE
	 	 @PutMapping ("/empleado/{id}")
	 	@ResponseStatus(HttpStatus.CREATED)
	 public Empleados update (@RequestBody Empleados employ, @PathVariable int id) {
	 		Empleados empActual = empleadoService.findById(id);
	 		
	 		empActual.setNombre(employ.getNombre());
	 		empActual.setApellido(employ.getApellido());
	 		empActual.setCi(employ.getCi());
	 		empActual.setFecha_n(employ.getFecha_n());
	 		empActual.setDireccion(employ.getDireccion());
	 		empActual.setSexo(employ.getSexo());
	 		empActual.setSalario(employ.getSalario());
	 		empActual.setSuperci(employ.getSuperci());
	 		empActual.setDno(employ.getDno());
	 		return empleadoService.save(empActual);
	 		
	 }
	 	 
	 	//ELIMINAR 
		 @DeleteMapping (value="/empleado/{id}")
		 @ResponseStatus(HttpStatus.NO_CONTENT)
		 public void eliminar(@PathVariable int id){
			 empleadoService.delete(id);
			}
		 
		 ///CRUD PRODUCTOS
		 @Autowired
		 private entidadesCRUDservices productServices;
			
			//LISTAR CLIENTES
			 @GetMapping ("/producto")
			public List<Productos> listar(){
				return productServices.findAllProducts();
			}
			//BUSCAR CLIENTE
				 @GetMapping ("/producto/{id}")
				 public Productos buscar_producto(@PathVariable int id){
						return  productServices.findByIdProduct(id);
					}
			//GUARDAR
				 @PostMapping ("/crearproducto")
				 @ResponseStatus(HttpStatus.CREATED)
				public Productos  guardar_Producto(@RequestBody Productos pro){
					return productServices.saveProduct(pro);
				}
			
			 
			 
			 //ACTUALIZAR UTILIZAMOS EL BUSCAR Y EL SAVE
			 	 @PutMapping ("/producto/{id}")
			 	@ResponseStatus(HttpStatus.CREATED)
			 public Productos update (@RequestBody Productos product, @PathVariable int id) {
			 		Productos proActual = productServices.findByIdProduct(id);
			 		
			 		proActual.setNombre(product.getNombre());
			 		proActual.setDescripcion(product.getDescripcion());
			 		proActual.setCosto(product.getCosto());
			 		proActual.setStock(product.getStock());
			 		
			 		
			 		return productServices.saveProduct(proActual);
			 		
			 }
			 	 
			 	//ELIMINAR 
				 @DeleteMapping (value="/producto/{id}")
				 @ResponseStatus(HttpStatus.NO_CONTENT)
				 public void eliminar_producto(@PathVariable int id){
					 productServices.delete_product(id);
					}
				 
				 //VENDEDOR_CRUD
				
				 
				 
				 @Autowired
				 private entidadesCRUDservices vendedorServices;
					
					//LISTAR CLIENTES
					 @GetMapping ("/vendedor")
					public List<Vendedor> listar_vendedor(){
						return vendedorServices.findAllVendedor();
					}
					//BUSCAR CLIENTE
						 @GetMapping ("/vendedor/{id}")
						 public Vendedor buscar_vendedor(@PathVariable int id){
								return  vendedorServices.findByIdVendedor(id);
							}
					//GUARDAR
						 @PostMapping ("/crearvendedor")
						 @ResponseStatus(HttpStatus.CREATED)
						public Vendedor  guardar_vendedor(@RequestBody Vendedor vende){
							return vendedorServices.saveVendedor(vende);
						}
					
					 
					 
					 //ACTUALIZAR UTILIZAMOS EL BUSCAR Y EL SAVE
					 	 @PutMapping ("/vendedor/{id}")
					 	@ResponseStatus(HttpStatus.CREATED)
					 public Vendedor update (@RequestBody Vendedor vendedor, @PathVariable int id) {
					 		Vendedor vendeActual = vendedorServices.findByIdVendedor(id);
	
					 		
					 		vendeActual.setNombre(vendedor.getNombre());
					 		vendeActual.setApellidos(vendedor.getApellidos());
					 		vendeActual.setDireccion(vendedor.getDireccion());
					 		vendeActual.setTelefono(vendedor.getTelefono());
					 		vendeActual.setEmail(vendedor.getEmail());
					 		
					 		
					 		
					 		return vendedorServices.saveVendedor(vendeActual);
					 		
					 }
					 	 
					 	//ELIMINAR 
						 @DeleteMapping (value="/vendedor/{id}")
						 @ResponseStatus(HttpStatus.NO_CONTENT)
						 public void eliminar_vendedor(@PathVariable int id){
							 vendedorServices.delete_vendedor(id);
							}
}
