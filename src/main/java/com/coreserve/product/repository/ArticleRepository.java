package com.coreserve.product.repository;

import com.coreserve.product.modele.Article;
import com.coreserve.product.modele.enumeration.Article_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {


    @Query(value = "" +
            "SELECT distinct a " +
            "from Article a " +
            "WHERE a.conditionnement = :category "
    )
    List<Article> findArticleByConditionnement(@Param("category") String category);

    @Query(value = "" +
            "SELECT distinct a " +
            "from Article a " +
            "WHERE a.conditionnement = :category " +
            "and a.type = :type"
    )
    List<Article> findArticleByConditionnementAndType(@Param("category") String category, @Param("type") Article_Type type);


}
