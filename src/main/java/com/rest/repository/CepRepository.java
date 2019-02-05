package com.rest.repository;

import com.rest.entity.Cep;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Daniel Mezzavilla
 */
@Repository
public interface CepRepository extends CrudRepository<Cep, Long> {
}
