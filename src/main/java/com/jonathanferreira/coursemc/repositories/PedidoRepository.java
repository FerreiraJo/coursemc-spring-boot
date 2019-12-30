package com.jonathanferreira.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jonathanferreira.coursemc.domain.Pedido;

@Repository  
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
