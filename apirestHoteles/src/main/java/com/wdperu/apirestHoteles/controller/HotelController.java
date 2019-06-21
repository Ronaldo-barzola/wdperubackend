package com.wdperu.apirestHoteles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdperu.apirestHoteles.entity.Hoteles;
import com.wdperu.apirestHoteles.service.IHotelesService;

@RestController
@RequestMapping("/api")
public class HotelController {
	
	@Autowired
	private IHotelesService hotelesService;
	
	@GetMapping(value = "/hoteles/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Hoteles>> listadoClientes(@PathVariable String nombre) {
		return new ResponseEntity<List<Hoteles>>(hotelesService.buscarHotelesNombreRegion(nombre), HttpStatus.OK);
		
	}

}
