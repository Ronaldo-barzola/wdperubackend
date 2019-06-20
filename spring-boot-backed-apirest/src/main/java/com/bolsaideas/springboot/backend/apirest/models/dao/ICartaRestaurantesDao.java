package com.bolsaideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bolsaideas.springboot.backend.apirest.models.entity.CartaRestaurantes;

public interface ICartaRestaurantesDao extends CrudRepository<CartaRestaurantes, Long> {

	@Query("SELECT ct FROM CartaRestaurantes ct JOIN ct.restaurantes r WHERE r.idRestaurante=:id")
	List<CartaRestaurantes> listarCartaByIdRestaurante(@Param("id") Long id);

}
