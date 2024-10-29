package com.academia.model;

public interface AulaComponent {
    void exibirDetalhes();
    float getPreco();
    Professor getProfessor();
    void agendarAluno(Aluno aluno);
    void cancelarInscricao(Aluno aluno);
}
