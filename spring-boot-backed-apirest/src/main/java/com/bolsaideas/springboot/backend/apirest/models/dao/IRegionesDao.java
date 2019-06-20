package com.bolsaideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bolsaideas.springboot.backend.apirest.models.entity.Regiones;

public interface IRegionesDao extends CrudRepository<Regiones, Long>{
	
	@Query("SELECT r FROM Regiones r WHERE r.nombreRegion LIKE %:nombre%")
	List<Regiones> searchByName(@Param("nombre") String nombre);

}
