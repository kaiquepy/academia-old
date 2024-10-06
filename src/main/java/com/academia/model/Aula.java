package com.academia.model;


public class Aula {
    private String id;
    private String nome;
    private Professor professor;
    private String horario;
    private int vagasDisponiveis;

    public Aula(String id, String nome, Professor professor, String horario, int vagasDisponiveis) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.horario = horario;
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public void agendarAluno(Aluno aluno) {
        if (vagasDisponiveis > 0) {
            vagasDisponiveis--;
            System.out.println("Aluno " + aluno.getNome() + " agendado na aula.");
        } else {
            System.out.println("Não há vagas disponíveis.");
        }
    }

    public void cancelarInscricao(Aluno aluno) {
        vagasDisponiveis++;
        System.out.println("Inscrição do aluno " + aluno.getNome() + " cancelada.");
    }

    public int verificarVagas() {
        return vagasDisponiveis;
    }

    @Override
    public String toString() {
        return "Aula [id=" + id + ", nome=" + nome + ", professor=" + professor.getNome() + ", horario=" + horario + ", vagasDisponiveis=" + vagasDisponiveis + "]";
    }
}

