package com.vascompany.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vascompany.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
