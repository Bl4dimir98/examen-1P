package com.product.product.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

//Esta clase representa la tabla Film en la base de datos 
@Data // Para crear los getters y setters en tiempo de compilación y codificación
@Entity // Para que sea una entidad de persistencia a la BDD
public class FilmBladimir {

    // Atributos de la tabla: delimitador de acceso, tipo de dato, nombre del
    // atributo
    // Se debe usar camelCase en las nomenglaturas
    @Id // Para identificar el id de la tabla en la BDD
    @GeneratedValue(strategy = GenerationType.AUTO) // Para generar un AutoId
    private long id;
    private String country;
    private Boolean enable;
    private String name;
    private Date release_date;

    /* Relations */
    @ManyToOne
    private CategoryBladimir category;

    @ManyToOne
    private DirectorBladimir director;

    @ManyToOne
    private ActorsBladimir actors;
}
