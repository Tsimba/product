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

    @Column(name = "cdt_art_id")
    private Long idArticle;

    @Column(name = "cdt_id_art_btl")
    private Long articleBtl;

    @Column(name = "cdt_id_art_cgt")
    private Long articleCgt;

    @Column(name = "cdt_nbr_btl")
    private Long nbreBtl;


}
