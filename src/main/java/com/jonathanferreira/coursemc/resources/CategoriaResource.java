package com.jonathanferreira.coursemc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController /* Indica que é uma classe controladora REST */
@RequestMapping(value = "/categorias") /* Indica que essa classe repondera pelo endpoint "/categorias" */
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public  String listar() {
		return "REST funcionando!";
	}

}
