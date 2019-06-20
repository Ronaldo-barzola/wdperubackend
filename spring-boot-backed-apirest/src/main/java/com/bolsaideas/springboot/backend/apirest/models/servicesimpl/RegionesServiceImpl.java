package com.bolsaideas.springboot.backend.apirest.models.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsaideas.springboot.backend.apirest.models.dao.IRegionesDao;
import com.bolsaideas.springboot.backend.apirest.models.entity.Regiones;
import com.bolsaideas.springboot.backend.apirest.models.services.IRegionesService;

@Service
public class RegionesServiceImpl implements IRegionesService {

	@Autowired
	private IRegionesDao regionesDao;

	@Override
	public List<Regiones> findAll() {
		return (List<Regiones>) regionesDao.findAll();
	}

	@Override
	public List<Regiones> searchByName(String nombre) {
		return (List<Regiones>) regionesDao.searchByName(nombre);
	}

	@Override
	public Regiones findById(Long id) {
		return regionesDao.findById(id).orElse(null);
	}

}
