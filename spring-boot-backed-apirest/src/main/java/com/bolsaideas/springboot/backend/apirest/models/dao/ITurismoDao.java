package com.bolsaideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bolsaideas.springboot.backend.apirest.models.entity.Turismo;

public interface ITurismoDao extends CrudRepository<Turismo, Long> {

	@Query("SELECT t FROM Turismo t JOIN t.regiones re WHERE re.idRegion=:id")
	List<Turismo> listarTurismoById(@Param("id") Long id);

}
