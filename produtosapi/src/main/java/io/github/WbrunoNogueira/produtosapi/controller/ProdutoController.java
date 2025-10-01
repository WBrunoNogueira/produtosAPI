package io.github.WbrunoNogueira.produtosapi.controller;

import io.github.WbrunoNogueira.produtosapi.model.Produto;
import io.github.WbrunoNogueira.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

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

    //metodo endpoint responsavel por obter os dados pelo ID
    @GetMapping("{id}")
    public Produto obterPorID(@PathVariable("id") String id){
        return produtoRepository.findById(id).orElse(null); // retorna o metodo por id e se não tiver retorna nulo
    }
}
