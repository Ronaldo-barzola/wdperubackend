package com.bolsaideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESTAURANTES")
public class Restaurantes implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_RESTAURANTE")
	private Long idRestaurante;

	@Column(name = "DESCRIPCION_RESTAURANTE")
	private String descripcionRestaurante;

	@Column(name = "DIRECCION_RESTAURANTE")
	private String direccionRestaurante;

	@Column(name = "HORARIO_ATENCION")
	private String horarioAtencion;

	@ManyToOne()
	@JoinColumn(name = "ID_REGION")
	private Regiones regiones;

	@Column(name = "TIPO_COMIDA")
	private String tipoComida;

	public Long getIdRestaurante() {
		return idRestaurante;
	}

	public void setIdRestaurante(Long idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	public String getDescripcionRestaurante() {
		return descripcionRestaurante;
	}

	public void setDescripcionRestaurante(String descripcionRestaurante) {
		this.descripcionRestaurante = descripcionRestaurante;
	}

	public String getDireccionRestaurante() {
		return direccionRestaurante;
	}

	public void setDireccionRestaurante(String direccionRestaurante) {
		this.direccionRestaurante = direccionRestaurante;
	}

	public String getHorarioAtencion() {
		return horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public Regiones getRegiones() {
		return regiones;
	}

	public void setRegiones(Regiones regiones) {
		this.regiones = regiones;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

}
