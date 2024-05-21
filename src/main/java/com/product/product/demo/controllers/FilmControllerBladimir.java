package com.product.product.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.product.product.demo.entities.FilmBladimir;
import com.product.product.demo.services.FilmServiceBladimir;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController // Una clase que actúa como Rest (get,post,put,delete), peticiones Http
@RequestMapping("api/v1") // Permite escuchar la ruta
@CrossOrigin({ "*" }) // Ayuda a manejar orígenes cruzados, desde el front, por ejemplo
public class FilmControllerBladimir {

    // Insertar el servicio
    @Autowired
    private FilmServiceBladimir filmService;

    // Metod: Delimitador de acceso, tipo de dato que retorna, nombre del
    // API - Create Film
    @PostMapping(value = "/films") // Sub ruta para saber cuando guardar
    public FilmBladimir save(@RequestBody FilmBladimir film) { // Para Json RequestBody tiene toda la info
        return filmService.save(film);
    }

    // API - Find All Films
    @GetMapping(value = "/films")
    public List<FilmBladimir> findAll() {
        return filmService.findAll();
    }

    // API - Find Film By Id
    @GetMapping("/films/{id}")
    public FilmBladimir findById(@PathVariable long id) {
        return filmService.findById(id);
    }

    // API - Delete film
    @DeleteMapping("/films/{id}")
    public void deleteById(@PathVariable long id) {
        filmService.deleteById(id);
    }

    // API - Update Film
    @PutMapping("/films/{id}")
    public FilmBladimir update(@RequestBody FilmBladimir film) {
        return filmService.save(film);
    }

    // API - Parcial Update
    @PatchMapping("/films/{id}")
    public ResponseEntity<FilmBladimir> updateById(@PathVariable long id, @RequestBody FilmBladimir film) {
        return filmService.updateById(id, film);
    };
}
