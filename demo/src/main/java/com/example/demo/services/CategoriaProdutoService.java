package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.CategoriaProduto;
import com.example.demo.repositories.CategoriaProdutoRepository;


@Service
public class CategoriaProdutoService {
    @Autowired
    private CategoriaProdutoRepository CategoriaProdutoRepository;

    public List<CategoriaProduto> obterTodos(){
        return CategoriaProdutoRepository.findAll();
    }

    public CategoriaProduto obterPorId(Long id){
        return CategoriaProdutoRepository.findById(id).orElse(null);
    }

    public CategoriaProduto inserirCategoriaProduto(CategoriaProduto categoria){
        return CategoriaProdutoRepository.save(categoria);
    }

    public void excluirCategoriaProduto(Long id){
        CategoriaProdutoRepository.deleteById(id);
    }
}
