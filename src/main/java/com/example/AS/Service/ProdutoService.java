package com.example.AS.Service;

import java.util.List;

import com.example.AS.Model.Produto;
import com.example.AS.Repository.ProdutoRepository;


public class ProdutoService {
    private ProdutoRepository produtoRepository = new ProdutoRepository();

    public void cadastrarProduto(Produto produto) {
        produtoRepository.adicionarProduto(produto);
    }
    public List<Produto> obterTodosProdutos() {
        return produtoRepository.listarProdutos();
    }
    public Produto obterProdutoPorId(int id) {
        return produtoRepository.buscarProdutoPorId(id);
    }

}