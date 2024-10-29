package com.academia.model;

public interface AulaComponent {
    void exibirDetalhes();
    float getPreco();
    void agendarAluno(Aluno aluno);
    void cancelarInscricao(Aluno aluno);
}
