package com.bolsaideas.springboot.backend.apirest.models.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsaideas.springboot.backend.apirest.models.dao.IRestauranteDao;
import com.bolsaideas.springboot.backend.apirest.models.entity.Restaurantes;
import com.bolsaideas.springboot.backend.apirest.models.services.IRestauranteService;

@Service
public class RestauranteServiceImpl implements IRestauranteService {

	@Autowired
	private IRestauranteDao restauranteDao;

	@SuppressWarnings("unchecked")

	@Override
	public List<Restaurantes> findById(Long id) {
		return (List<Restaurantes>) restauranteDao.findById(id).orElse(null);

	}
//
	@Override
	public List<Restaurantes> buscarRestaurantes(Long id) {
		return (List<Restaurantes>)restauranteDao.buscarRestaurantesId(id);
	}

}
