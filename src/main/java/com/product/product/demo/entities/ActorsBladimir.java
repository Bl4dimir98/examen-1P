package com.product.product.demo.entities;

import java.util.Date;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class ActorsBladimir {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date birthday;
    private Boolean enable;
    private String names;
    private Integer phone;
}
