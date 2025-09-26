package com.coreserve.product.modele;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "prixtype")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PrixType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prix_type_id")
    private Long id;


    @Column(name = "prix_type_code")
    private String code;   // ACHAT, VENTE, GROS

    @Column(name = "prix_type_libelle")
    private String libelle;
}
