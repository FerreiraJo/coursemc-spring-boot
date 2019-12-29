package com.jonathanferreira.coursemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jonathanferreira.coursemc.domain.Estado;

@Repository  
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
