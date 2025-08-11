package com.coreserve.product.repository;

import com.coreserve.product.modele.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
