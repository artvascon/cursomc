package com.vascompany.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vascompany.cursomc.domain.Produto;
import com.vascompany.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public Produto buscar(Integer id) {
		Produto obj = repo.findOne(id);
		return obj;
	}
}
