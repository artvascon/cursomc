package com.vascompany.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vascompany.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
