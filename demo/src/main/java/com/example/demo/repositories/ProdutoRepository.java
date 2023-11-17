package com.example.demo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
    List<Produto> findByCategoriaProdutoId(Long categoriaProdutoId);
}
