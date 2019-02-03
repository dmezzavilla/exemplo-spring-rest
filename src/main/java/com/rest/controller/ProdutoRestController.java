package com.rest.controller;

import com.rest.entity.Produto;
import com.rest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author Daniel Mezzavilla
 */
@RestController
@RequestMapping("/")
public class ProdutoRestController {

    private final
    ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoRestController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public Iterable<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @PostMapping(consumes = "application/json", produces = "text/plain")
    public void save(Produto produto) {
        produtoRepository.save(produto);
    }

    @GetMapping("/find/{id}")
    public Optional<Produto> findById(@PathVariable Long id) {
        return produtoRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }


}
