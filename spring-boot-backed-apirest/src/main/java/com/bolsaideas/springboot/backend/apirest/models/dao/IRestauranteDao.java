package com.bolsaideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bolsaideas.springboot.backend.apirest.models.entity.Restaurantes;

public interface IRestauranteDao extends CrudRepository<Restaurantes, Long> {

	@Query("SELECT r FROM Restaurantes r JOIN r.regiones re WHERE re.idRegion=:id")
	List<Restaurantes> buscarRestaurantesId(@Param("id") Long id);
	

}
