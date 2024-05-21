package com.product.product.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.product.product.demo.entities.FilmBladimir;
import com.product.product.demo.repositories.FilmRepositoryBladimir;

@Service
public class FilmServiceBladimir {

    // Atributos: delimitador de acceso, tipo de dato, nombre del atributo
    @Autowired // Para que pueda incrustar
    private FilmRepositoryBladimir filmRepository;

    // CRUD
    // Método: delimitador de acceso, tipo de dato que retorna, nombre del método o
    // Create Film
    public FilmBladimir save(FilmBladimir film) {
        return filmRepository.save(film); // Guarda y retorna a la BDD
    }

    // Read All Films
    public List<FilmBladimir> findAll() {
        return filmRepository.findAll();
    }

    // Read Film By ID
    public FilmBladimir findById(long id) {
        return filmRepository.findById(id).orElse(null);
    }

    // Delete Film
    public void deleteById(long id) {
        filmRepository.deleteById(id);
    }

    // Parcial Update
    public ResponseEntity<FilmBladimir> updateById(long id, FilmBladimir filmUpdate) {
        try {
            FilmBladimir filmExist = findById(id);
            // Comprueba que el id exista
            if (filmExist == null) {
                return ResponseEntity.notFound().build();
            }
            // Update each field
            if (filmUpdate.getCountry() != null)
                filmExist.setCountry(filmUpdate.getCountry());
            if (filmUpdate.getName() != null)
                filmExist.setName(filmUpdate.getName());
            if (filmUpdate.getRelease_date() != null)
                filmExist.setRelease_date(filmUpdate.getRelease_date());
            if (filmUpdate.getEnable() != null)
                filmExist.setEnable(filmUpdate.getEnable());
            // Save data
            FilmBladimir filmSave = save(filmExist);
            return ResponseEntity.ok(filmSave);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    };
}