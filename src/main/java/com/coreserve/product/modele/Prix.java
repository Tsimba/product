package com.coreserve.product.modele;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prix_art_id")
    @JsonBackReference
    private Article article;

    @ManyToOne
    @JoinColumn(name = "prix_type_id")
    private PrixType type;

    @Column(name = "prix_valeur")
    private Long valeur;







}
