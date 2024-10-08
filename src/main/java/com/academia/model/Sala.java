package com.academia.model;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int id;
    private int capacidade;
    private String modalidade;

    private static List<Sala> salas = new ArrayList<>();

    public Sala(int id, int capacidade, String modalidade) {
        this.id = id;
        this.capacidade = capacidade;
        this.modalidade = modalidade;
   
        salas.add(this);
    }

    public int getId() {
        return id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getModalidade() {
        return modalidade;
    }
    
    public static List<Sala> getSalas() {
        return salas;
    }

    @Override
    public String toString() {
        return "Sala{" + "id=" + id + ", capacidade=" + capacidade +
                ", modalidade='" + modalidade + '\'' + '}';
    }
}
