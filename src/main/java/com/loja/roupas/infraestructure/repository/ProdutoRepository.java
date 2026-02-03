package com.loja.roupas.infraestructure.repository;

import com.loja.roupas.infraestructure.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}

