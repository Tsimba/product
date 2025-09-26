package com.coreserve.product.service;

import com.coreserve.product.modele.Article;
import com.coreserve.product.modele.Prix;
import com.coreserve.product.modele.enumeration.Article_Type;
import com.coreserve.product.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    public static final Logger logger = LoggerFactory.getLogger(ArticleService.class);

    @Autowired
    private ArticleRepository articleRepository;



    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Transactional
    public  Article createArticle(Article article) {
        if(!article.getPrixList().isEmpty()){
            for(Prix prix : article.getPrixList() ){
                prix.setArticle(article);
            }
        }
        return articleRepository.save(article);
    }

    public Article getArticleById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    public void deleteArticle(Article article) {
        articleRepository.delete(article);
    }

    public List<Article> findArticleByConditionnement(String category){
        return articleRepository.findArticleByConditionnement(category);
    }

    public List<Article> findArticleByConditionnementAndType(String category, String type){

        return articleRepository.findArticleByConditionnementAndType(category, getArticleType(type));
    }

    private Article_Type getArticleType(String type) {
        switch (type) {
            case "CD":
                return Article_Type.CONDITIONNEMENT;
            case "BH":
                return Article_Type.BOISSON_HYGINIEQUE;
            case "BA":
                return Article_Type.BOISSON_ALCOOLIQUE;
            default:
                return null;
        }
    }
}
