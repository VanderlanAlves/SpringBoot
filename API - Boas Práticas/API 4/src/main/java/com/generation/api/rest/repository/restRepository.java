package com.generation.api.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.api.rest.model.restModel;



@Repository

public interface restRepository extends JpaRepository<restModel, Long> {

	public List<restModel> findAllByTituloContainingIgnoreCase (String titulo);

}
