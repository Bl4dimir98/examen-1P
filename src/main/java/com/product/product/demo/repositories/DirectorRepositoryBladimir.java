package com.product.product.demo.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.product.product.demo.entities.DirectorBladimir;

public interface DirectorRepositoryBladimir extends CrudRepository<DirectorBladimir, Long> {
    @SuppressWarnings("null")
    List<DirectorBladimir> findAll();
}
