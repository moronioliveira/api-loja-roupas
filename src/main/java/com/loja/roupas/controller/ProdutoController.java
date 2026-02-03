package com.loja.roupas.controller;

import com.loja.roupas.business.ProdutoService;
import com.loja.roupas.infraestructure.entity.Produto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService service;

    @PostMapping
    public ResponseEntity<Produto> cadastrar(@Valid @RequestBody Produto produto) {
        Produto produtoSalvo = service.salvarNovoProduto(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);
    }
    @GetMapping
    public ResponseEntity<List<Produto>> listarTodos (){
    List<Produto> produtos = service.buscarTodos();
    return ResponseEntity.ok(produtos);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto){
        Produto atualizado = service.atualizar(id, produto);
    return ResponseEntity.ok(atualizado);
    }

}
