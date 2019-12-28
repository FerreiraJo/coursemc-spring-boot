package com.jonathanferreira.coursemc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathanferreira.coursemc.domain.Categoria;
import com.jonathanferreira.coursemc.repositories.CategoriaRepository;
import com.jonathanferreira.coursemc.services.exeptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired /* o objeto sera intanciado automaticamente */
	private CategoriaRepository repo = null;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		if(obj.isEmpty()) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id : " + id + ", Tipo " + Categoria.class.getName());
		}
		return obj.orElse(null); /* caso o objeto nao exista retorna nulo */
	}
}
