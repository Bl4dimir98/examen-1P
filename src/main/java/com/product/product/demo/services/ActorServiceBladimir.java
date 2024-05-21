package com.product.product.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.product.product.demo.entities.ActorsBladimir;
import com.product.product.demo.repositories.ActorsRepositoryBladimir;
import jakarta.transaction.Transactional;

@Service
public class ActorServiceBladimir {
    @Autowired
    private ActorsRepositoryBladimir actorsRepositoryBladimir;

    // Create Actors
    public ActorsBladimir save(ActorsBladimir actorsBladimir) {
        return actorsRepositoryBladimir.save(actorsBladimir);
    }

    // Read All Actors
    public List<ActorsBladimir> findAllBladimir() {
        return actorsRepositoryBladimir.findAll();
    }

    // Delete By Name
    @Transactional
    public void deleteByNameBladimir(String names) {
        actorsRepositoryBladimir.deleteByNames(names);
    };
}
