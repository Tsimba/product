package com.coreserve.product.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
public class ConditionnementDto implements Serializable {


    private Long id;

    private Long idArticle;

    private Long articleBtl;

    private Long articleCgt;

    private Long nbreBtl;


    public ConditionnementDto(){

    }

    public ConditionnementDto(Long id, Long idArticle, Long articleBtl, Long articleCgt, Long nbreBtl) {
        this.id = id;
        this.idArticle = idArticle;
        this.articleBtl = articleBtl;
        this.articleCgt = articleCgt;
        this.nbreBtl = nbreBtl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdArticle() {
        return idArticle;
    }
    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }
    public Long getArticleBtl() {
        return articleBtl;
    }
    public void setArticleBtl(Long articleBtl) {
        this.articleBtl = articleBtl;
    }
    public Long getArticleCgt() {
        return articleCgt;
    }
    public void setArticleCgt(Long articleCgt) {
        this.articleCgt = articleCgt;
    }
    public Long getNbreBtl() {
        return nbreBtl;
    }
    public void setNbreBtl(Long nbreBtl) {
        this.nbreBtl = nbreBtl;
    }



}
