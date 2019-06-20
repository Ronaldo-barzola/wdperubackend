package com.bolsaideas.springboot.backend.apirest.models.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsaideas.springboot.backend.apirest.models.dao.IHotelesDao;
import com.bolsaideas.springboot.backend.apirest.models.entity.Hoteles;
import com.bolsaideas.springboot.backend.apirest.models.services.IHotelesService;

@Service
public class HotelesServiceImpl implements IHotelesService{

	@Autowired
	private IHotelesDao hotelesDao;
	
	@Override
	public List<Hoteles> buscarHotelesId(Long id) {
		return hotelesDao.buscarHotelesId(id);
	}

}
