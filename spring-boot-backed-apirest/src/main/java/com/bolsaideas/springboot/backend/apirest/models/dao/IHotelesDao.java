package com.bolsaideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bolsaideas.springboot.backend.apirest.models.entity.Hoteles;

public interface IHotelesDao extends CrudRepository<Hoteles, Long>{

	@Query("SELECT h from Hoteles h JOIN h.regiones re WHERE re.idRegion=:id")
	List<Hoteles> buscarHotelesId(@Param("id")Long id);
	
}
