package com.rest.repository;

import com.rest.entity.Dollar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Daniel Mezzavilla
 */
@Repository
public interface DollarRepository extends CrudRepository<Dollar, Long> {

}
