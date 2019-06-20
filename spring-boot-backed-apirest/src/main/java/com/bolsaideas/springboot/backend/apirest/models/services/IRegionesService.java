package com.bolsaideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsaideas.springboot.backend.apirest.models.entity.Regiones;

public interface IRegionesService {

	public List<Regiones> findAll();
	
	public List<Regiones> searchByName(String nombre);
	
	public Regiones findById(Long id);

}
