package com.rest.service;

import com.rest.entity.Produto;

import java.util.Optional;

/**
 * @author Daniel Mezzavilla
 */
public interface ProdutoService {
    Iterable<Produto> findAll();

    void save(Produto produto);

    Optional<Produto> findById(Long id);

    void deleteById(Long id);
}
