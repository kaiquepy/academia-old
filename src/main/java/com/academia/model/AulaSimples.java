package com.academia.model;

public class AulaSimples extends Aula {

    public AulaSimples(String id, String nome, Professor professor, String horario, int vagasDisponiveis) {
        super(id, nome, professor, horario, vagasDisponiveis);
    }

    @Override
    public void agendarAluno(Aluno aluno) {
        if (getVagasDisponiveis() > 0) {
            setVagasDisponiveis(getVagasDisponiveis() - 1);
            System.out.println("Aluno " + aluno.getNome() + " agendado na aula: " + getNome());
        } else {
            System.out.println("Não há vagas disponíveis para " + getNome());
        }
    }

    @Override
    public void cancelarInscricao(Aluno aluno) {
        setVagasDisponiveis(getVagasDisponiveis() + 1);
        System.out.println("Inscrição do aluno " + aluno.getNome() + " cancelada na aula: " + getNome());
    }
}
