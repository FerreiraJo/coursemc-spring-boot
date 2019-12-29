package com.jonathanferreira.coursemc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathanferreira.coursemc.domain.Cliente;
import com.jonathanferreira.coursemc.repositories.ClienteRepository;
import com.jonathanferreira.coursemc.services.exeptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired /* o objeto sera intanciado automaticamente */
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		if(obj.isEmpty()) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id : " + id + ", Tipo " + Cliente.class.getName());
		}
		return obj.orElse(null); /* caso o objeto nao exista retorna nulo */
	}
}
