package com.coreserve.product.mappper;

import com.coreserve.product.dto.ArticleDto;
import com.coreserve.product.modele.Article;
import com.coreserve.product.modele.Fournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,  uses = {FournisseurMapper.class})
public interface ArticleMapper {
    ArticleMapper INSTANCE = Mappers.getMapper(ArticleMapper.class);

    Article dtoToArticle(ArticleDto dto);

    ArticleDto articleToDto(Article article);

    List<Article> dtoToArticleList(List<ArticleDto> dtoList);

    List<ArticleDto> articleListToDtoList(List<Article> articleList);
}
