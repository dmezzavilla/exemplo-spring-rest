package com.rest.service;

import com.rest.entity.Produto;

import java.util.Optional;

public interface ProdutoService {


    public Iterable<Produto> findAll();


    public void save(Produto produto);


    public Optional<Produto> findById(Long id);


    public void deleteById(Long id);
}
