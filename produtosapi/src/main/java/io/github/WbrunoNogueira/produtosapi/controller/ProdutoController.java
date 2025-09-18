package io.github.WbrunoNogueira.produtosapi.controller;

import io.github.WbrunoNogueira.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido" + produto);
        return produto;
    }
}
