package com.uniesp.ecommerce.services;

import com.uniesp.ecommerce.entities.Produto;
import com.uniesp.ecommerce.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto obterProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto cadastrarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
}
