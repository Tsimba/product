package com.coreserve.product.dto;

import com.coreserve.product.modele.Fournisseur;
import com.coreserve.product.modele.enumeration.Article_Type;
import com.coreserve.product.modele.enumeration.TypePrix;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
//@ToString
//@Getter
//@Setter
@EqualsAndHashCode
//@NoArgsConstructor
//@AllArgsConstructor
public class ArticleDto implements Serializable {

    private Long id;

    private String name;

    private String code;

    private FournisseurDto fournisseur;

    private Double prix;

    private Article_Type type;

    private String conditionnement;

    private TypePrix typePrix;

    public ArticleDto() {
    }

    public ArticleDto(Long id, String name, String code, FournisseurDto fournisseur, Double prix, Article_Type type, String conditionnement, TypePrix typePrix, Date creationDate, Date modifyDate) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.fournisseur = fournisseur;
        this.prix = prix;
        this.type = type;
        this.conditionnement = conditionnement;
        this.typePrix = typePrix;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public FournisseurDto getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(FournisseurDto fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Article_Type getType() {
        return type;
    }

    public void setType(Article_Type type) {
        this.type = type;
    }

    public String getConditionnement() {
        return conditionnement;
    }

    public void setConditionnement(String conditionnement) {
        this.conditionnement = conditionnement;
    }

    public TypePrix getTypePrix() {
        return typePrix;
    }

    public void setTypePrix(TypePrix typePrix) {
        this.typePrix = typePrix;
    }
}
