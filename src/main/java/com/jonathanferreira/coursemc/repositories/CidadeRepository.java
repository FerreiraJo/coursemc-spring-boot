package com.jonathanferreira.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jonathanferreira.coursemc.domain.Cidade;

@Repository  
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
