package com.rest.repository;

import com.rest.entity.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Daniel Mezzavilla
 */
@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
