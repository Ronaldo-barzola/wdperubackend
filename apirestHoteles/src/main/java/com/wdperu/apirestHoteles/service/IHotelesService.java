package com.wdperu.apirestHoteles.service;
import java.util.List;

import com.wdperu.apirestHoteles.entity.Hoteles;


public interface IHotelesService {
	
	public List<Hoteles> buscarHotelesNombreRegion(String nombre);
	
	public List<Hoteles> findAll();

}
