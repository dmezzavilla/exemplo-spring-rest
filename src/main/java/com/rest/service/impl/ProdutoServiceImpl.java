package com.rest.service.impl;

import com.rest.entity.Produto;
import com.rest.repository.ProdutoRepository;
import com.rest.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Iterable<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @Override
    public void save(Produto produto) {
        produtoRepository.save(produto);

    }

    @Override
    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }
}
