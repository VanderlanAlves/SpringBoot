package com.escola.alunos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="postagem")
public class Postagem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	@NotNull
	public String nome; 
	
	@NotNull
	public boolean matriculado;
}
