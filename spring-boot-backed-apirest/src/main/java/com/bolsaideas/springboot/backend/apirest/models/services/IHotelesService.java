package com.bolsaideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsaideas.springboot.backend.apirest.models.entity.Hoteles;

public interface IHotelesService {
	
	public List<Hoteles> buscarHotelesId(Long id);

}
