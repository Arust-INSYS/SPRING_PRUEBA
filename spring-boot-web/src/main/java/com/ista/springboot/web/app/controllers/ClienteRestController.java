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

import com.ista.springboot.web.app.entity.Cliente;
import com.ista.springboot.web.app.services.IClienteService;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	
	@Autowired
	private IClienteService clienteService;
	
	//LISTAR CLIENTES
	 @GetMapping ("/cliente")
	public List<Cliente> index(){
		return clienteService.findAll();
	}
	//BUSCAR CLIENTE
		 @GetMapping ("/cliente/{id}")
		 public Cliente buscar(@PathVariable long id){
				return  clienteService.findById(id);
			}
	//GUARDAR
		 @PostMapping ("/crearcliente")
		 @ResponseStatus(HttpStatus.CREATED)
		public Cliente  guardar(@RequestBody Cliente cliente){
			return clienteService.save(cliente);
		}
	
	 
	 
	 //ACTUALIZAR UTILIZAMOS EL BUSCAR Y EL SAVE
	 	 @PutMapping ("/cliente/{id}")
	 	@ResponseStatus(HttpStatus.CREATED)
	 public Cliente update (@RequestBody Cliente cliente, @PathVariable long id) {
	 		 Cliente ClienteActual = clienteService.findById(id);
	 		ClienteActual.setApellido(cliente.getApellido());
	 		ClienteActual.setNombre(cliente.getNombre());
	 		ClienteActual.setEmail(cliente.getEmail());
	 		return clienteService.save(ClienteActual);
	 		
	 }
	 	 
	 	//ELIMINAR 
		 @DeleteMapping ("/cliente/{id}")
		 @ResponseStatus(HttpStatus.NO_CONTENT)
		 public void eliminar(@PathVariable long id){
				 clienteService.delete(id);
			}	 

}
