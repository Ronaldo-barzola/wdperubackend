package com.bolsaideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsaideas.springboot.backend.apirest.models.entity.Turismo;

public interface ITurismoService {

	public List<Turismo> listarTurismoById(Long id);
}
