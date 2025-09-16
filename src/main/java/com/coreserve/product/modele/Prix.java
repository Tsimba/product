package com.coreserve.product.modele;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "prix")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Prix {
    @Id
    @Column(name = "prix_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "prix_art_id")
    private Long name;

    @Column(name = "prix_type")
    private String type;

    @Column(name = "prix_valeur")
    private Long valeur;







}
