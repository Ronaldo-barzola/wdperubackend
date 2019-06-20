package com.bolsaideas.springboot.backend.apirest.models.servicesimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsaideas.springboot.backend.apirest.models.dao.ITurismoDao;
import com.bolsaideas.springboot.backend.apirest.models.entity.Turismo;
import com.bolsaideas.springboot.backend.apirest.models.services.ITurismoService;

@Service
public class TurismoServiceImpl implements ITurismoService{

	@Autowired
	private ITurismoDao turismoDao;
	
	@Override
	public List<Turismo> listarTurismoById(Long id) {
		return turismoDao.listarTurismoById(id);
	}

}
