package com.rest.controller;

import com.rest.entity.Produto;
import com.rest.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author Daniel Mezzavilla
 */
@RestController
@RequestMapping("/")
public class ProdutoRestController {

    private final ProdutoService produtoService;

    @Autowired
    public ProdutoRestController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public Iterable<Produto> findAll() {
        return produtoService.findAll();
    }

    @PostMapping
    public void save(@RequestBody Produto produto) {
        produtoService.save(produto);
    }

    @GetMapping("/find/{id}")
    public Optional<Produto> findById(@PathVariable Long id) {
        return produtoService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        produtoService.deleteById(id);
    }


}
