package com.bolsaideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "REGIONES_PERU")
public class Regiones implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_REGION")
	private Long idRegion;

	@Column(name = "NOMBRE_REGION")
	private String nombreRegion;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "ALIAS_REGION")
	private String aliasRegion;

	@OneToMany(mappedBy = "regiones", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Restaurantes> restaurantes;

	public Long getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(Long idRegion) {
		this.idRegion = idRegion;
	}

	public String getNombreRegion() {
		return nombreRegion;
	}

	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAliasRegion() {
		return aliasRegion;
	}

	public void setAliasRegion(String aliasRegion) {
		this.aliasRegion = aliasRegion;
	}

}
