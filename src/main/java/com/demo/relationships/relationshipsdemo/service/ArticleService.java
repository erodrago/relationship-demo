package com.demo.relationships.relationshipsdemo.service;

import com.demo.relationships.relationshipsdemo.dto.ArticleDto;
import com.demo.relationships.relationshipsdemo.dto.CategoryDto;
import com.demo.relationships.relationshipsdemo.models.Article;
import com.demo.relationships.relationshipsdemo.models.Category;
import com.demo.relationships.relationshipsdemo.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;


    public Article addArtical(ArticleDto articleDto){

        Article article =new Article();

        article.setContent(articleDto.getContent());
        article.setDescription(articleDto.getDescription());
        article.setKeywords(articleDto.getKeywords());
        article.setTitle(articleDto.getTitle());

        article = articleRepository.save(article);

        return article;
    }

    public Article getArticle(Long id){

        Optional<Article> article = articleRepository.findById(id);

        return article.get();


    }
}
