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
@Table(name = "animal")
public class Pets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;


	@Column(unique=true)
	private String nome;

	private String especie;
	private Porte porte;
	private PetsStatus status;
	@Column(columnDefinition = "date")
	private Date dateNascimento;

	public Pets() {
	}

	public Pets(long id, String nome, String especie, Porte porte, PetsStatus status, Date dateNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.porte = porte;
		this.status = status;
		this.dateNascimento = dateNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public PetsStatus getStatus() {
		return status;
	}

	public void setStatus(PetsStatus status) {
		this.status = status;
	}

	public Date getDateNascimento() {
		return dateNascimento;
	}

	public void setDateNascimento(Date dateNascimento) {
		this.dateNascimento = dateNascimento;
	}

	public long getId() {
		return id;
	}
	
	

}
