package com.bolsaideas.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsaideas.springboot.backend.apirest.models.entity.CartaRestaurantes;
import com.bolsaideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsaideas.springboot.backend.apirest.models.entity.Hoteles;
import com.bolsaideas.springboot.backend.apirest.models.entity.Regiones;
import com.bolsaideas.springboot.backend.apirest.models.entity.Restaurantes;
import com.bolsaideas.springboot.backend.apirest.models.entity.Turismo;
import com.bolsaideas.springboot.backend.apirest.models.services.ICartaRestauranteService;
import com.bolsaideas.springboot.backend.apirest.models.services.IClienteService;
import com.bolsaideas.springboot.backend.apirest.models.services.IHotelesService;
import com.bolsaideas.springboot.backend.apirest.models.services.IRegionesService;
import com.bolsaideas.springboot.backend.apirest.models.services.IRestauranteService;
import com.bolsaideas.springboot.backend.apirest.models.services.ITurismoService;

//@CrossOrigin(origins = { "http://localhost/wdperu/map/principal/prueba" })
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;

	@Autowired
	private IRegionesService regionesService;

	@Autowired
	private IRestauranteService restauranteService;

	@Autowired
	private IHotelesService hotelesService;

	@Autowired
	private ITurismoService turismoService;

	@Autowired
	private ICartaRestauranteService cartaService;

	@GetMapping(value = "/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Cliente>> listadoClientes() {
		return new ResponseEntity<List<Cliente>>(clienteService.findAll(), HttpStatus.OK);
	}

	@GetMapping(value = "/regiones", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Regiones>> listRegiones() {
		return new ResponseEntity<List<Regiones>>(regionesService.findAll(), HttpStatus.OK);
	}

	@GetMapping(value = "/regionesnombre/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Regiones>> searchByName(@PathVariable String nombre) {
		return new ResponseEntity<List<Regiones>>(regionesService.searchByName(nombre), HttpStatus.OK);
	}

	@GetMapping(value = "/regionbyid/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Regiones> regionbyid(@PathVariable Long id) {
		return new ResponseEntity<Regiones>(regionesService.findById(id), HttpStatus.OK);
	}

	@GetMapping(value = "/restaurantebyid/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Restaurantes>> restauranteById(@PathVariable Long id) {
		return new ResponseEntity<List<Restaurantes>>(restauranteService.buscarRestaurantes(id), HttpStatus.OK);
	}

	@GetMapping(value = "/hotelesbyid/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Hoteles>> hotelesById(@PathVariable Long id) {
		return new ResponseEntity<List<Hoteles>>(hotelesService.buscarHotelesId(id), HttpStatus.OK);
	}

	@GetMapping(value = "/turismobyid/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Turismo>> turismoById(@PathVariable Long id) {
		return new ResponseEntity<List<Turismo>>(turismoService.listarTurismoById(id), HttpStatus.OK);
	}

	
	@GetMapping(value = "/cartabyid/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CartaRestaurantes>> cartaById(@PathVariable Long id) {
		return new ResponseEntity<List<CartaRestaurantes>>(cartaService.listarCartaByIdRestaurante(id), HttpStatus.OK);
	}
	

	// @GetMapping("/clientes/{id}")
	// public Cliente show(@PathVariable Long id) {
	// return clienteService.finById(id);
	// }
	//
	
	 @PostMapping("/saveCli")
	 @ResponseStatus(HttpStatus.CREATED)
	 public Cliente create(@RequestBody Cliente cliente) {
	 return clienteService.save(cliente);
	 }
	//
	// @PutMapping("/clientes/{id}")
	// @ResponseStatus(HttpStatus.CREATED)
	// public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
	// Cliente clienteActual = clienteService.finById(id);
	// clienteActual.setApellido(cliente.getApellido());
	// clienteActual.setNombre(cliente.getNombre());
	// clienteActual.setEmail(cliente.getEmail());
	// return clienteService.save(clienteActual);
	// }
	//
	// @DeleteMapping("/clientes/{id}")
	// @ResponseStatus(HttpStatus.NO_CONTENT)
	// public void delete(@PathVariable Long id) {
	// clienteService.delete(id);
	//
	// }
}
