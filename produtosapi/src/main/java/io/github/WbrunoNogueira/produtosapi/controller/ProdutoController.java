package io.github.WbrunoNogueira.produtosapi.controller;

import io.github.WbrunoNogueira.produtosapi.model.Produto;
import io.github.WbrunoNogueira.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    //delete
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }

    //atualizar
    public void  atualizar(@PathVariable("id") String id,
                           @RequestBody Produto produto){
        produto.setId(id); // seta o produto
        produtoRepository.save(produto);
    }

    //PESQUISA - recebe os parâmetros para pesquisa, pel url
    @GetMapping
    public List<Produto> Buscar(@RequestParam ("nome") String nome){
        return produtoRepository.findBynome(nome);

    }
}
