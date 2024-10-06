package com.academia.model;

import java.util.List;


public class Professor extends Pessoa {
    private String especialidade;
    private List<String> horarioDisponivel;

    public Professor(String nome, String cpf, String especialidade, List<String> horarioDisponivel) {
        super(nome, cpf);
        this.especialidade = especialidade;
        this.horarioDisponivel = horarioDisponivel;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<String> getHorarioDisponivel() {
        return horarioDisponivel;
    }

    public void setHorarioDisponivel(List<String> horarioDisponivel) {
        this.horarioDisponivel = horarioDisponivel;
    }

    public void agendarAula(String horario, Aula aula) {
        // Lógica para agendar aula
    }

    public void cancelarAula(String id) {
        // Lógica para cancelar aula
    }

    @Override
    public void exibirDados() {
        System.out.println("Professor: " + getNome() + " - Especialidade: " + especialidade);
    }
}

