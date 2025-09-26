package com.coreserve.product.modele;

import com.coreserve.product.converter.ArticleTypeConverter;
import com.coreserve.product.modele.enumeration.Article_Type;
import com.coreserve.product.modele.enumeration.TypePrix;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "article")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    @Id
    @Column(name = "art_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "art_name")
    private String name;

    @Column(name = "art_code")
    private String code;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "frs_id")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Prix> prixList;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cdt_id")
    private Conditionnement condition;

    @Column(name = "art_type")
    @Convert(converter = ArticleTypeConverter.class)
    private Article_Type type;

    @Column(name = "art_conditionnement")
    private String conditionnement;

    @Column(name = "art_type_prix")
    @Enumerated(EnumType.STRING)
    private TypePrix typePrix;


    @Column(name = "art_actif")
    private boolean isActif;

    @CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date", updatable = false)
    private Date creationDate;

    @Column(name = "last_modify_date")
//    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @UpdateTimestamp
    private Date modifyDate;


    // === utilitaires ===
    public void addPrix(Prix prix) {
        prixList.add(prix);
        prix.setArticle(this); // synchronisation des 2 côtés
    }

    public void removePrix(Prix prix) {
        prixList.remove(prix);
        prix.setArticle(null);
    }


}
