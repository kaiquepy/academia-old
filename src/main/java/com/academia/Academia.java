package com.academia;

import com.academia.model.*;

import java.util.Arrays;

/**
 *
 * @author Kaique Vieria
 * @author Kayky Nery
 * @version 1.0
 */
public class Academia {
    public static void main(String[] args) {
//        // Teste da Classe Produto
//        Produto produto1 = new Produto(1, "Suplemento Whey", 150.00, "Whey Protein Isolado");
//        Produto produto2 = new Produto(2, "Camiseta Fitness", 50.00, "Camiseta dry-fit");
//        
//        System.out.println("Teste Produto:");
//        System.out.println(produto1);
//        System.out.println(produto2);
//        
//        // Teste da Classe EstoqueLoja
//        EstoqueLoja estoque = new EstoqueLoja();
//        estoque.adicionarProduto(produto1, 10);
//        estoque.adicionarProduto(produto2, 20);
//        
//        System.out.println("\nProdutos no Estoque:");
//        estoque.listarProdutos();
//        
//        System.out.println("\nVerificando disponibilidade:");
//        System.out.println("Produto 1 disponível: " + estoque.verificarDisponibilidade("1"));
//        System.out.println("Produto 3 disponível: " + estoque.verificarDisponibilidade("3"));
//        
//        estoque.removerProduto("1");
//        System.out.println("\nApós remover Produto 1:");
//        estoque.listarProdutos();
//        
//        // Teste da Classe Aluno
//        Aluno aluno1 = new Aluno("João Silva", "123.456.789-00", "Plano Mensal");
//        aluno1.realizarPagamento(100);
//        
//        System.out.println("\nTeste Aluno:");
//        aluno1.exibirDados();
//        System.out.println("Status: " + aluno1.verificarStatus());
//        
//        aluno1.atualizarDados("3499-1234", "Plano Anual");
//        aluno1.exibirDados();
//        
//        // Teste da Classe Funcionario
//        Funcionario funcionario1 = new Funcionario("Maria Souza", "987.654.321-00", "maria.souza", "senha123");
//        
//        System.out.println("\nTeste Funcionário:");
//        funcionario1.exibirDados();
//        
//        System.out.println("Autenticação:");
//        System.out.println("Tentativa 1 (correta): " + funcionario1.autenticar("maria.souza", "senha123"));
//        System.out.println("Tentativa 2 (incorreta): " + funcionario1.autenticar("maria.souza", "senhaErrada"));
//        
//        // Teste da Classe Professor
//        Professor professor1 = new Professor("Carlos Pereira", "111.222.333-44", "Yoga", Arrays.asList("09:00", "18:00"));
//        
//        System.out.println("\nTeste Professor:");
//        professor1.exibirDados();
//        
//        // Teste da Classe Aula
//        Aula aula1 = new Aula("A001", "Yoga Avançado", professor1, "09:00", 5);
//        
//        System.out.println("\nTeste Aula:");
//        System.out.println(aula1);
//        
//        aula1.agendarAluno(aluno1);
//        aula1.agendarAluno(aluno1);
//        aula1.agendarAluno(aluno1);
//        
//        System.out.println("Vagas restantes: " + aula1.verificarVagas());
//        aula1.cancelarInscricao(aluno1);
//        System.out.println("Vagas após cancelamento: " + aula1.verificarVagas());
//        
//        // Teste da Classe Despesa
//        Despesa despesa1 = new Despesa("Compra de Equipamentos", 5000.00, "01/10/2024");
//        System.out.println("\nTeste Despesa:");
//        despesa1.registrarDespesa();
//        
//        // Teste da Classe Receita
//        Receita receita1 = new Receita("Mensalidade", 2000.00, "01/10/2024");
//        System.out.println("\nTeste Receita:");
//        receita1.registrarReceita();
//        
//        // Teste da Classe GerenciamentoFinanceiro
//        GerenciamentoFinanceiro financeiro = new GerenciamentoFinanceiro();
//        financeiro.registrarReceita(receita1);
//        financeiro.registrarDespesa(despesa1);
//        
//        System.out.println("\nTeste GerenciamentoFinanceiro:");
//        financeiro.exibirResumo();
//        
//        // Teste da Classe SistemaAcademia
//        SistemaAcademia academia = new SistemaAcademia();
//        academia.adicionarAluno(aluno1);
//        academia.adicionarProfessor(professor1);
//        academia.adicionarAula(aula1);
//        
//        System.out.println("\nTeste SistemaAcademia:");
//        academia.removerAluno("123.456.789-00");
//        academia.removerProfessor("111.222.333-44");
        Professor professor1 = new Professor("Carlos Pereira", "111.222.333-44", "Yoga", Arrays.asList("09:00", "18:00"));
        AulaComponent zumba = new Aula("1", "Zumba", professor1, "08:00", 10, 30.0f);
        AulaComponent spinning = new Aula("2", "Spinning", professor1, "09:00", 5, 35.0f);

        // Criando um pacote de aulas
        PacoteDeAulas pacoteFitness = new PacoteDeAulas("Pacote Fitness");
        pacoteFitness.adicionarAula(zumba);
        pacoteFitness.adicionarAula(spinning);

        // Exibindo detalhes
        pacoteFitness.exibirDetalhes();
        System.out.println("Preço total do pacote: " + pacoteFitness.getPreco());

        // Agendando um aluno
        Aluno aluno1 = new Aluno("João Silva", "123.456.789-00", "Plano Mensal");
        pacoteFitness.agendarAluno(aluno1);

        // Cancelando inscrição
        pacoteFitness.cancelarInscricao(aluno1);
    }
}
