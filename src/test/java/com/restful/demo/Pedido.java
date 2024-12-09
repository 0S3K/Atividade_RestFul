package com.restful.demo;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCliente;

    @ElementCollection
    private List<Long> idsProdutos;
}

