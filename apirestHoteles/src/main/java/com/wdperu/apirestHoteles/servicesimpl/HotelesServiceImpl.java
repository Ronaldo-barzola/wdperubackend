package com.wdperu.apirestHoteles.servicesimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdperu.apirestHoteles.dao.IHotelesDao;
import com.wdperu.apirestHoteles.entity.Hoteles;
import com.wdperu.apirestHoteles.service.IHotelesService;

@Service
public class HotelesServiceImpl implements IHotelesService{

	@Autowired
	private IHotelesDao hotelesDao;

	@Override
	public List<Hoteles> buscarHotelesNombreRegion(String nombre) {
		return hotelesDao.buscarHotelesNombreRegion(nombre);
	}

	@Override
	public List<Hoteles> findAll() {
		return (List<Hoteles>) hotelesDao.findAll();
	}
	
	

}
