package io.github.WbrunoNogueira.produtosapi.controller;

import io.github.WbrunoNogueira.produtosapi.model.Produto;
import io.github.WbrunoNogueira.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;//injeção da interface tem que ter o construtor

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido" + produto);
        var id = UUID.randomUUID().toString();  //classe do java util, para gerar hash
        produto.setId(id);

        produtoRepository.save(produto); // salva o prodito que recebe do postman
        return produto;
    }
}
