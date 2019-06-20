package com.bolsaideas.springboot.backend.apirest.models.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsaideas.springboot.backend.apirest.models.dao.ICartaRestaurantesDao;
import com.bolsaideas.springboot.backend.apirest.models.entity.CartaRestaurantes;
import com.bolsaideas.springboot.backend.apirest.models.services.ICartaRestauranteService;

@Service
public class CartaRestauranteServiceImpl implements ICartaRestauranteService {

	@Autowired
	private ICartaRestaurantesDao cartaRestaurantesDao;

	@Override
	public List<CartaRestaurantes> listarCartaByIdRestaurante(Long id) {
		return cartaRestaurantesDao.listarCartaByIdRestaurante(id);
	}

}
