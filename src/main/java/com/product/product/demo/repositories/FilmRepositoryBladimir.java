package com.product.product.demo.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.product.product.demo.entities.FilmBladimir;

//Representa el repositorio, es una interface
//La interface hereda de CRUDRepository y recibe como parámetros 
//la clase entidad y el tipo de dato de la clave primaria
public interface FilmRepositoryBladimir extends CrudRepository<FilmBladimir, Long> {
    @SuppressWarnings("null")
    List<FilmBladimir> findAll();
}
