package com.coreserve.product.controlleur;

import com.coreserve.product.dto.ArticleDto;
import com.coreserve.product.mappper.ArticleMapper;
import com.coreserve.product.modele.Article;
import com.coreserve.product.modele.Fournisseur;
import com.coreserve.product.service.ArticleService;
import com.coreserve.product.service.FournisseurService;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/article")
@RequiredArgsConstructor
@CommonsLog
public class ArticleControlleur {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private FournisseurService fournisseurService;


    @GetMapping("/getall")
    public ResponseEntity<List<ArticleDto>> getAllArticles() {
         return  ResponseEntity.ok(articleMapper.articleListToDtoList(articleService.getAllArticles()));
    }

    @GetMapping("/getbyid")
    public ResponseEntity<ArticleDto> getArticleById(@RequestParam Long id) {
        return  ResponseEntity.ok(articleMapper.articleToDto(articleService.getArticleById(id)));
    }

    @GetMapping("/get/category")
    public ResponseEntity<List<ArticleDto>> getbyCategory(@RequestParam String category) {
        return  ResponseEntity.ok(articleMapper.articleListToDtoList(articleService.findArticleByConditionnement(category)));
    }

    @GetMapping("/get/category/type")
    public ResponseEntity<List<ArticleDto>> getbyCategoryAndType(@RequestParam String category, @RequestParam String type) {
        return  ResponseEntity.ok(articleMapper.articleListToDtoList(articleService.findArticleByConditionnementAndType(category, type)));
    }

    @PostMapping(path = "/create")
    public ResponseEntity<ArticleDto> createArticle(@RequestBody ArticleDto articleDto) {

        Article article = articleMapper.dtoToArticle(articleDto);
        Fournisseur fournisseur = fournisseurService.getFournisseursById(article.getFournisseur().getId());
        article.setFournisseur(fournisseur);

        Article articleValue =  articleService.createArticle(article);
        ArticleDto articleDtoFinal =  articleMapper.articleToDto(articleValue);
        return  ResponseEntity.ok(articleDtoFinal);
    }


    @DeleteMapping("/delete")
    public void deleteArticle(@RequestParam Long id) {
         Article article = articleService.getArticleById(id);
         if(article != null) {
             articleService.deleteArticle(article);
         }
    }



}
