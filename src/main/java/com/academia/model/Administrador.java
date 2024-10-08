package com.academia.model;

public class Administrador extends Funcionario {

    public Administrador(String nome, String cpf, String usuario, String senha) {
        super(nome, cpf, usuario, senha);
    }
    
@Override
    public String toString() {
        return "Administrador [Nome: " + getNome() + ", CPF: " + getCpf() + 
               ", Usuário: " + getUsuario() + "]";
    }
}
