package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Produto;

import com.example.demo.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos(){
        return produtoRepository.findAll();
    }
    
    public Produto inserirProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto editarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void excluirProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    public List<Produto> obterProdutoPorCategoria(Long categoriaId){
        return produtoRepository.findByCategoriaProdutoId(categoriaId);
    }

}
