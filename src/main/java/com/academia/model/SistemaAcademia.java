package com.academia.model;

import java.util.ArrayList;
import java.util.List;


public class SistemaAcademia {
    final private List<Aluno> alunos;
    final private List<Professor> professores;
    final private List<Aula> aulas;
    final private List<Despesa> despesas;
    final private List<Receita> receitas;

    public SistemaAcademia() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        aulas = new ArrayList<>();
        despesas = new ArrayList<>();
        receitas = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(String cpf) {
        alunos.removeIf(aluno -> aluno.getCpf().equals(cpf));
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void removerProfessor(String cpf) {
        professores.removeIf(professor -> professor.getCpf().equals(cpf));
    }

    public void adicionarAula(Aula aula) {
        aulas.add(aula);
    }

    public void cancelarAula(String id) {
        aulas.removeIf(aula -> aula.getId().equals(id));
    }
}
