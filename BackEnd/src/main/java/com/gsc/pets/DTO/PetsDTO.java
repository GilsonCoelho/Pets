package com.gsc.pets.DTO;


import com.gsc.pets.enums.PetsStatus;
import com.gsc.pets.enums.Porte;

import java.util.Date;

public class PetsDTO {

    private long id;
    private String nome;

    private String especie;
    private Porte porte;
    private PetsStatus status;
    private Date dateNascimento;

    private int ano;
    private int mes;
    private int dias;

    public PetsDTO() {
    }

    public PetsDTO(long id, String nome, String especie, Porte porte, PetsStatus status, Date dateNascimento) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.porte = porte;
        this.status = status;
        this.dateNascimento = dateNascimento;
    }

    public PetsDTO(long id, String nome, String especie, Porte porte, PetsStatus status, Date date, Integer ano, Integer mes, Integer dias) {
        String text;
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.porte = porte;
        this.status = status;
        this.dateNascimento = date;
        this.ano = ano;
        this.mes = mes;
        this.dias = dias;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "PetsDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", porte=" + porte +
                ", status=" + status +
                ", ano=" + ano +
                ", mes=" + mes +
                ", dias=" + dias +
                '}';
    }
}
