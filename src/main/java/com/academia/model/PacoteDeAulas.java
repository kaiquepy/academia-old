package com.academia.model;

import java.util.ArrayList;
import java.util.List;

public class PacoteDeAulas implements AulaComponent {
    private String nome;
    private List<AulaComponent> components = new ArrayList<>();
    
    public PacoteDeAulas(String nome) {
        this.nome = nome;
    }
    
    public void adicionarAula(AulaComponent componente) {
        components.add(componente);
    }
    
    public void removerAula(AulaComponent componente) {
        components.remove(componente);
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Pacode de Aulas: " + this.nome);
        for (AulaComponent componente : components) {
            componente.exibirDetalhes();
        }
    }
    
    @Override
    public float getPreco() {
        return (float) components.stream().mapToDouble(AulaComponent::getPreco).sum();
    }
    
    @Override
    public void agendarAluno(Aluno aluno) {
        for (AulaComponent componente : components) {
            componente.agendarAluno(aluno);
        }
    }
    
    @Override
    public void cancelarInscricao(Aluno aluno) {
        for (AulaComponent componente : components) {
            componente.cancelarInscricao(aluno);
        }
    }
}
