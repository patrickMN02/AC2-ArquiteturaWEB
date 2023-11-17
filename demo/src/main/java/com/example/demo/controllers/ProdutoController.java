package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Produto;
import com.example.demo.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> obterTodosProdutos() {
        return produtoService.obterTodos();
    }

    @PostMapping
    public Produto inserirProduto(@RequestBody Produto produto) {
        return produtoService.inserirProduto(produto);
    }

    @PutMapping
    public Produto editarProduto(@RequestBody Produto produto) {
        return produtoService.editarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable Long id) {
        produtoService.excluirProduto(id);
    }

    @GetMapping("/porCategoria/{categoriaId}")
    public List<Produto> obterProdutosPorCategoria(@PathVariable Long categoriaId) {
        return produtoService.obterProdutoPorCategoria(categoriaId);
    }
}
