package com.bolsaideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsaideas.springboot.backend.apirest.models.entity.CartaRestaurantes;

public interface ICartaRestauranteService {

	public List<CartaRestaurantes> listarCartaByIdRestaurante(Long id);
}
