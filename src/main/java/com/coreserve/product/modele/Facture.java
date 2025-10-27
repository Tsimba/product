package com.coreserve.product.modele;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "facture")
@Getter
@Setter
public class Facture {

    @Id
    @Column(name = "fact_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fact_reference")
    private String reference;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "art_id")
    private List<Article> article;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

//    @Column(name = "fact_prix")
//    private Double prix;

    @Column(name = "fact_remise")
    private Double remise;

    @Column(name = "fact_total")
    private Double total;

    @Column(name = "fact_tva")
    private Double tva;


}
