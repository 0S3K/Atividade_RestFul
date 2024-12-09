package com.restful.demo;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String contato;
}


