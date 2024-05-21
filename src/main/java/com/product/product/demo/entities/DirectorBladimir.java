package com.product.product.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class DirectorBladimir {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String dni;
    private Boolean enable;
    private String fullNames;
    private String lastNames;
}
