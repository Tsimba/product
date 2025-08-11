package com.coreserve.product.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "stock")
@Getter
@Setter
public class Stock {
    @Id
    @Column(name = "stk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stk_nombre")
    private int nombre;

    @Column(name = "stk_conditionnement")
    private String conditionnement;


}
