package com.academia.model;

import java.util.HashMap;
import java.util.Map;


public class EstoqueLoja {
    final private Map<Produto, Integer> produtos;

    public EstoqueLoja() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.put(produto, quantidade);
    }

    public void removerProduto(String idProduto) {
        produtos.entrySet().removeIf(entry -> entry.getKey().getId() == Integer.parseInt(idProduto));
    }

    public void listarProdutos() {
        produtos.forEach((produto, quantidade) -> {
            System.out.println(produto.toString() + " - Quantidade: " + quantidade);
        });
    }

    public boolean verificarDisponibilidade(String idProduto) {
        return produtos.entrySet().stream().anyMatch(entry -> entry.getKey().getId() == Integer.parseInt(idProduto) && entry.getValue() > 0);
    }
}
