package com.ista.proyectotfc.services;

import java.util.List;

import com.ista.proyectotfc.entidades.Asignacion;

public interface asignacionCRUDservices {
	
	//
		public List<Asignacion> findAllAsignacion();
		public Asignacion saveAsigna(Asignacion asignacion);
		public Asignacion findByIdAsigna(long id);
		public void delete_asignacion( long id);

}
