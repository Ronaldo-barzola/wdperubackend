package com.bolsaideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TURISMO")
public class Turismo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TURISMO")
	private Long idTurismo;
	
	@Column(name="NOMBRE_TURISMO")
	private String nombreTurismo;
	
	@Column(name="UBICACION")
	private String ubicaconTurismo;
	
	@ManyToOne()
	@JoinColumn(name="ID_REGION")
	private Regiones regiones;

	public Long getIdTurismo() {
		return idTurismo;
	}

	public void setIdTurismo(Long idTurismo) {
		this.idTurismo = idTurismo;
	}

	public String getNombreTurismo() {
		return nombreTurismo;
	}

	public void setNombreTurismo(String nombreTurismo) {
		this.nombreTurismo = nombreTurismo;
	}

	public String getUbicaconTurismo() {
		return ubicaconTurismo;
	}

	public void setUbicaconTurismo(String ubicaconTurismo) {
		this.ubicaconTurismo = ubicaconTurismo;
	}

	public Regiones getRegiones() {
		return regiones;
	}

	public void setRegiones(Regiones regiones) {
		this.regiones = regiones;
	}
	
	
	
	
}
