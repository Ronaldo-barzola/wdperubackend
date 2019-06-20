package com.bolsaideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsaideas.springboot.backend.apirest.models.entity.Restaurantes;

public interface IRestauranteService {

	public List<Restaurantes> findById(Long id); 
	
	public List<Restaurantes> buscarRestaurantes(Long id);
}
