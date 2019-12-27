package com.jonathanferreira.coursemc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jonathanferreira.coursemc.domain.Categoria;
import com.jonathanferreira.coursemc.repositories.CategoriaRepository;

@SpringBootApplication
public class CoursemcApplication implements CommandLineRunner{
	
	@Autowired
	public CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CoursemcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));	
		
	}

}
