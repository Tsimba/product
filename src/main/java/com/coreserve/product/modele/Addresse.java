package com.coreserve.product.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "addresse")
@Getter
@Setter
public class Addresse {

    @Id
    @Column(name = "addr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "addr_street")
    private String street;

    @Column(name = "addr_city")
    private String city;

    @Column(name = "addr_code_postal")
    private String codePostal;


}
