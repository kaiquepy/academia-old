package com.academia.model;


public class Aluno extends Pessoa {
    private String plano;
    private double saldoDevedor;

    public Aluno(String nome, String cpf, String plano) {
        super(nome, cpf);
        this.plano = plano;
        this.saldoDevedor = 0;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void realizarPagamento(double valor) {
        this.saldoDevedor -= valor;
    }

    public void atualizarDados(String telefone, String plano) {
        setTelefone(telefone);
        this.plano = plano;
    }

    public String verificarStatus() {
        return saldoDevedor > 0 ? "Em dívida" : "Pagamento em dia";
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluno: " + getNome() + " - CPF: " + getCpf() + " - Plano: " + plano);
    }

    @Override
    public String toString() {
        return "Aluno [plano=" + plano + ", saldoDevedor=" + saldoDevedor + ", " + super.toString() + "]";
    }
}

