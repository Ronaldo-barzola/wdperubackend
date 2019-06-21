package com.wdperu.apirestHoteles.entity;

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
@Table(name = "HOTELES")
public class Hoteles implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_HOTEL")
	private Long idHotel;

	@Column(name = "NOMBRE_HOTEL")
	private String nombreHotel;

	@Column(name = "NOMBRE_REGION")
	private String nombreRegion;

	@Column(name = "DIRECCION_HOTEL")
	private String direccionHotel;

	@Column(name = "PRECIO")
	private Double precio;

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombreHotel() {
		return nombreHotel;
	}

	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	public String getDireccionHotel() {
		return direccionHotel;
	}

	public void setDireccionHotel(String direccionHotel) {
		this.direccionHotel = direccionHotel;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getNombreRegion() {
		return nombreRegion;
	}

	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}
	
	

}
