package com.jonathanferreira.coursemc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathanferreira.coursemc.domain.Pedido;
import com.jonathanferreira.coursemc.repositories.PedidoRepository;
import com.jonathanferreira.coursemc.services.exeptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired /* o objeto sera intanciado automaticamente */
	private PedidoRepository repo = null;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		if(obj.isEmpty()) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id : " + id + ", Tipo " + Pedido.class.getName());
		}
		return obj.orElse(null); /* caso o objeto nao exista retorna nulo */
	}
}
