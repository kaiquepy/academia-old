package com.academia.model;


public class Funcionario extends Pessoa {
    private String usuario;
    private String senha;

    public Funcionario(String nome, String cpf, String usuario, String senha) {
        super(nome, cpf);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }

    @Override
    public void exibirDados() {
        System.out.println("Funcionário: " + getNome() + " - CPF: " + getCpf());
    }

    @Override
    public String toString() {
        return "Funcionario [usuario=" + usuario + ", " + super.toString() + "]";
    }
}

