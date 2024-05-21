package com.product.product.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.product.product.demo.entities.ActorsBladimir;
import com.product.product.demo.services.ActorServiceBladimir;

@RestController
@RequestMapping("api/v1")
@CrossOrigin({ "*" })
public class ActorsControllerBladimir {
    @Autowired
    ActorServiceBladimir actorServiceBladimir;

    // CREATE
    @PostMapping(value = "/actors")
    public ActorsBladimir save(@RequestBody ActorsBladimir actorsBladimir) {
        return actorServiceBladimir.save(actorsBladimir);
    }

    // SELECT ALL
    @GetMapping(value = "/actors")
    public List<ActorsBladimir> findAllBladimir() {
        return actorServiceBladimir.findAllBladimir();
    }

    // DELETE BY NAME
    @DeleteMapping(value = "/actors/{names}")
    public String deleteByNameBladimir(@PathVariable String names) {
        actorServiceBladimir.deleteByNameBladimir(names);
        return "Actor eliminado con éxito";
    }

}
