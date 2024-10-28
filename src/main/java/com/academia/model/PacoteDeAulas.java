package com.academia.model;

import java.util.ArrayList;
import java.util.List;

public class PacoteDeAulas extends Aula {
    private List<Aula> aulas = new ArrayList<>();

    public PacoteDeAulas(String id, String nome, Professor professor) {
        super(id, nome, professor, "N/A", Integer.MAX_VALUE); // Vagas ilimitadas para pacotes
    }

    public void addAula(Aula aula) {
        aulas.add(aula);
    }

    public void removeAula(Aula aula) {
        aulas.remove(aula);
    }

    @Override
    public void agendarAluno(Aluno aluno) {
        System.out.println("Agendando aluno " + aluno.getNome() + " em todas as aulas do pacote: " + getNome());
        for (Aula aula : aulas) {
            aula.agendarAluno(aluno);
        }
    }

    @Override
    public void cancelarInscricao(Aluno aluno) {
        System.out.println("Cancelando inscrição do aluno " + aluno.getNome() + " de todas as aulas do pacote: " + getNome());
        for (Aula aula : aulas) {
            aula.cancelarInscricao(aluno);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pacote: ").append(getNome()).append("\n");
        for (Aula aula : aulas) {
            sb.append("  - ").append(aula.toString()).append("\n");
        }
        return sb.toString();
    }
}
