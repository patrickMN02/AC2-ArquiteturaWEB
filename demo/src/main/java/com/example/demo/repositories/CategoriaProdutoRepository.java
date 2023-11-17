package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.CategoriaProduto;

public interface CategoriaProdutoRepository extends JpaRepository<CategoriaProduto, Long>{
    
    @Query("select cp from CategoriaProduto cp left join fetch cp.produtos p where cp.id = :id ")
    CategoriaProduto findCategoriaProdutoFetchProdutos(@Param("id") Long id);
}