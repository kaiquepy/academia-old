package com.academia.model;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoFinanceiro {
    final private List<Receita> receitas;
    final private List<Despesa> despesas;

    public GerenciamentoFinanceiro() {
        receitas = new ArrayList<>();
        despesas = new ArrayList<>();
    }

    public void registrarDespesa(Despesa despesa) {
        despesas.add(despesa);
    }

    public void registrarReceita(Receita receita) {
        receitas.add(receita);
    }

    public double calcularBalanco() {
        double totalReceitas = receitas.stream().mapToDouble(Receita::getValor).sum();
        double totalDespesas = despesas.stream().mapToDouble(Despesa::getValor).sum();
        return totalReceitas - totalDespesas;
    }

    public void exibirResumo() {
        System.out.println("Receitas: " + receitas);
        System.out.println("Despesas: " + despesas);
        System.out.println("Balanço: " + calcularBalanco());
    }
}
