package com.loja.roupas.infraestructure.repository;

import com.loja.roupas.business.ProdutoService;
import com.loja.roupas.infraestructure.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Optional<Produto> findByName(String nome);
    List<Produto> findAllByOrderIdAsc();
    }



