package com.coreserve.product.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "conditionnement")
@Getter
@Setter
public class Conditionnement {
    @Id
    @Column(name = "cdt_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cdt_name")
    private String name;

    @Column(name = "cdt_code")
    private String code;

    @Column(name = "cdt_type")
    private String type;


}
