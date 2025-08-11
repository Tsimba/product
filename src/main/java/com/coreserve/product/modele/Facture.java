package com.coreserve.product.modele;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "art_id")
    private Article article;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stk_id")
    private Stock stock;

    @Column(name = "fact_prix")
    private Double prix;

    @Column(name = "fact_remise")
    private Double remise;

    @Column(name = "fact_total")
    private Double total;

    @Column(name = "fact_tva")
    private Double tva;


}
