package com.product.product.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.product.product.demo.entities.DirectorBladimir;
import com.product.product.demo.services.DirectorServiceBladimir;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("api/v1")
@CrossOrigin({ "*" })
public class DirectorControllerBladimir {

    @Autowired
    private DirectorServiceBladimir directorService;

    // API - Create Director
    @PostMapping(value = "/directors")
    public DirectorBladimir save(@RequestBody DirectorBladimir director) {
        return directorService.save(director);
    }

    // API - Find All Directors
    @GetMapping(value = "/directors")
    public List<DirectorBladimir> findAll() {
        return directorService.findAll();
    }

    // API - Find Director By Id
    @GetMapping(value = "/directors/{id}")
    public DirectorBladimir findById(@PathVariable long id) {
        return directorService.findById(id);
    }

    // API - Delete Director
    @DeleteMapping(value = "/directors/{id}")
    public void deleteById(@PathVariable long id) {
        directorService.deleteById(id);
    }

    // API - Update Director
    @PutMapping(value = "/directors/{id}")
    public DirectorBladimir update(@RequestBody DirectorBladimir director) {
        return directorService.save(director);
    }

    // API - Parcial Update
    @PatchMapping(value = "/directors/{id}")
    public ResponseEntity<DirectorBladimir> updateById(@PathVariable long id, @RequestBody DirectorBladimir director) {
        return directorService.updateById(id, director);
    };
}