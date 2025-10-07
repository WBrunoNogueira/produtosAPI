package io.github.WbrunoNogueira.produtosapi.repository;

import io.github.WbrunoNogueira.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    List<Produto> findBynome(String nome);  // cria a assinatura da lista no reposytory
}
