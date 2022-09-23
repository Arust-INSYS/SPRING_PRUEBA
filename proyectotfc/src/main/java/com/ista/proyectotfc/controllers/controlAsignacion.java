package com.ista.proyectotfc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.proyectotfc.entidades.Asignacion;
import com.ista.proyectotfc.services.asignacionServices;



@RestController
@RequestMapping("/api")
public class controlAsignacion {
	
	@Autowired
	private asignacionServices asigService;
	
	//LISTAR ASIGNACION
		 @GetMapping ("/listaasignacion")
		public List<Asignacion> index(){
			return asigService.findAllAsignacion();
		}
		//BUSCAR ASIGNACION
		 @GetMapping ("/asignacion/{id}")
		 public Asignacion buscar(@PathVariable long id){
				return  asigService.findByIdAsigna(id);
			}
		 
		//GUARDAR
		 @PostMapping ("/crearasignacion")
		 @ResponseStatus(HttpStatus.CREATED)
		public Asignacion  guardar(@RequestBody Asignacion asig){
			return asigService.saveAsigna(asig);
		}

}
