package com.gsc.pets.DTO;


import com.gsc.pets.enums.PetsStatus;
import com.gsc.pets.enums.Porte;

public class PetsDTO {

    private long id;
    private String nome;
    private Porte porte;
    private PetsStatus status;
    private String dateNascimento;

    public PetsDTO() {
    }

    public PetsDTO(long id, String nome, Porte porte, PetsStatus status, String dateNascimento) {
        this.id = id;
        this.nome = nome;
        this.porte = porte;
        this.status = status;
        this.dateNascimento = dateNascimento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getDateNascimento() {
        return dateNascimento;
    }

    public void setDateNascimento(String dateNascimento) {
        this.dateNascimento = dateNascimento;
    }
}
