package com.jonathanferreira.coursemc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jonathanferreira.coursemc.domain.Cliente;
import com.jonathanferreira.coursemc.services.ClienteService;

@RestController /* Indica que é uma classe controladora REST */
@RequestMapping(value = "/clientes") /* Indica que essa classe repondera pelo endpoint "/categorias" */
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public  ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
