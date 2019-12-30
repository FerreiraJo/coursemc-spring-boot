package com.jonathanferreira.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jonathanferreira.coursemc.domain.Pagamento;

@Repository  
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
