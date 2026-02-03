package com.loja.roupas.business;

import com.loja.roupas.infraestructure.entity.Produto;
import com.loja.roupas.infraestructure.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository repository;
    public Produto salvarNovoProduto(Produto produto){
        if (produto.getPrice() == null || produto.getPrice().compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("O preço DEVE ser maior que zero!!!");
        }
        return repository.save(produto);
    }
    public List<Produto> buscarTodos(){
        return repository.findAll();
    }
    public void deletar(Long id){
    repository.deleteById(id);
    }
    public Produto atualizar(Long id, Produto produtoAtualizado){
        Produto produtoExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        produtoExistente.setName(produtoAtualizado.getName());
        produtoExistente.setPrice(produtoAtualizado.getPrice());
        produtoExistente.setDescription(produtoAtualizado.getDescription());
        produtoExistente.setBrand(produtoAtualizado.getBrand());
        return repository.save(produtoAtualizado);
    }
}
