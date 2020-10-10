package com.generation.LojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.LojaDeGames.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria>findAllByCategoriaContainingIgnoreCase (String categoria);
	
	public List<Categoria>getByDescricaoCategoria (String descricaoCategoria);
}