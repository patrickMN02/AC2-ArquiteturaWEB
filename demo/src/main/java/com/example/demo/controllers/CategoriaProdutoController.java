package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CategoriaProduto;
import com.example.demo.services.CategoriaProdutoService;

@RestController
@RequestMapping("/categorias")
public class CategoriaProdutoController {
    @Autowired
    private CategoriaProdutoService categoriaService;

    @GetMapping
    public List<CategoriaProduto> obterTodasCategorias() {
        return categoriaService.obterTodos();
    }

    @GetMapping("/{id}")
    public CategoriaProduto obterCategoriaPorId(@PathVariable Long id) {
        return categoriaService.obterPorId(id);
    }

    @PostMapping
    public CategoriaProduto inserirCategoria(@RequestBody CategoriaProduto categoria) {
        return categoriaService.inserirCategoriaProduto(categoria);
    }

    @DeleteMapping("/{id}")
    public void excluirCategoria(@PathVariable Long id) {
        categoriaService.excluirCategoriaProduto(id);
    }
}
