package com.gsc.pets.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.gsc.pets.enums.PetsStatus;
import com.gsc.pets.enums.Porte;

@Entity
@Table
public class Pets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(unique=true)
	private String nome;
	private Porte porte;
	private PetsStatus status;
	private Date dateNascimento;

}
