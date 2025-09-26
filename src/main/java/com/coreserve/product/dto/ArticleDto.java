package com.coreserve.product.dto;

import com.coreserve.product.modele.Fournisseur;
import com.coreserve.product.modele.Prix;
import com.coreserve.product.modele.enumeration.Article_Type;
import com.coreserve.product.modele.enumeration.TypePrix;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


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

    private List<Prix> prixList;

    private Article_Type type;

    private String conditionnement;

    private TypePrix typePrix;

    @JsonProperty("isActif")
    private boolean isActif;

    private ConditionnementDto condition;

//    public ArticleDto() {
//    }

    public ArticleDto(Long id, String name, String code, FournisseurDto fournisseur, List<Prix> prixList, Article_Type type, String conditionnement, TypePrix typePrix, Date creationDate, Date modifyDate, boolean actif,
                      ConditionnementDto condition) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.fournisseur = fournisseur;
        this.prixList = prixList;
        this.type = type;
        this.conditionnement = conditionnement;
        this.typePrix = typePrix;
        this.isActif = actif;
        this.condition = condition;
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

    public List<Prix> getPrixList() {
        return prixList;
    }

    public void setPrixList(List<Prix> prixList) {
        this.prixList = prixList;
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

    public ConditionnementDto getCondition() {
        return condition;
    }

    public void setCondition(ConditionnementDto condition) {
        this.condition = condition;
    }

    public boolean isActif() {
        return isActif;
    }

    public void setActif(boolean isActif) {
        this.isActif = isActif;
    }
}
