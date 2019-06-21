package com.wdperu.apirestHoteles.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;

import com.wdperu.apirestHoteles.entity.Hoteles;

public interface IHotelesDao extends CrudRepository<Hoteles, Long>{

	@Query("SELECT h from Hoteles h WHERE h.nombreRegion LIKE %:nombre%")
	List<Hoteles> buscarHotelesNombreRegion(@Param("nombre")String nombre);
	
	
	  
	
}
