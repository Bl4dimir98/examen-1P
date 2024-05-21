package com.product.product.demo.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.product.product.demo.entities.ActorsBladimir;

public interface ActorsRepositoryBladimir extends CrudRepository<ActorsBladimir, Long> {
    @SuppressWarnings("null")
    // FOR FIND ALL
    List<ActorsBladimir> findAll();

    // DELETE BY NAME
    void deleteByNames(String names);
}
