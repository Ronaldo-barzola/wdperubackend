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
@Table(name="CARTA_RESTAURANTES")
public class CartaRestaurantes implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CARTA_RESTAURANTE")
	private Long idCartaRestaurante;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "PRECIO")
	private Double precio;

	@JoinColumn(name = "ID_RESTAURANTE")
	@ManyToOne()
	private Restaurantes restaurantes;

	public Long getIdCartaRestaurante() {
		return idCartaRestaurante;
	}

	public void setIdCartaRestaurante(Long idCartaRestaurante) {
		this.idCartaRestaurante = idCartaRestaurante;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Restaurantes getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(Restaurantes restaurantes) {
		this.restaurantes = restaurantes;
	}
	
	

}
