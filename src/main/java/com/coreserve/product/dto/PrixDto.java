package com.coreserve.product.dto;

import com.coreserve.product.modele.Article;
import com.coreserve.product.modele.PrixType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
public class PrixDto {

    private Long id;

    private Article article;

    private Long valeur;

    private PrixType type;

    public PrixDto(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public PrixType getType() {
        return type;
    }

    public void setType(PrixType type) {
        this.type = type;
    }

    public Long getValeur() {
        return valeur;
    }

    public void setValeur(Long valeur) {
        this.valeur = valeur;
    }
}
