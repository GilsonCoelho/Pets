package com.gsc.pets.DTO;

public class IdadeDTO extends PetsDTO{

    private int ano;
    private int mes;
    private int dias;

    public IdadeDTO() {
    }

    public IdadeDTO(int ano, int mes, int dias) {
        this.ano = ano;
        this.mes = mes;
        this.dias = dias;
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
}
