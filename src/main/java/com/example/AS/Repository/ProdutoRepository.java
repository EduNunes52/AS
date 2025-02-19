package com.example.AS.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.AS.Model.Produto;


public class ProdutoRepository {
    private List<Produto> produtos = new ArrayList<>();
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public List<Produto> listarProdutos() {
        return produtos;
    }
    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

}