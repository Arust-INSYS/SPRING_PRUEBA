package com.ista.proyectotfc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.proyectotfc.entidades.Asignacion;
import com.ista.proyectotfc.modeloDao.asignacionDao;

@Service
public class asignacionServices implements asignacionCRUDservices{
	
	@Autowired
	private asignacionDao asigDao;
	
	@Override
	@Transactional (readOnly=true)
	
	public List<Asignacion> findAllAsignacion() {
		// TODO Auto-generated method stub
		return (List<Asignacion>) asigDao.findAll();
	}

	@Override
	@Transactional 
	public Asignacion saveAsigna(Asignacion asignacion) {
		// TODO Auto-generated method stub
		return asigDao.save(asignacion);
	}

	@Override
	@Transactional (readOnly=true)
	public Asignacion findByIdAsigna(long id) {
		// TODO Auto-generated method stub
		return asigDao.findById(id).orElse(null);
	}

	@Override
	public void delete_asignacion(long id) {
		// TODO Auto-generated method stub
		asigDao.deleteById(id);
	}
	
	

}
