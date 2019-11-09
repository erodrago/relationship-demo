package com.demo.relationships.relationshipsdemo.controller;


import com.demo.relationships.relationshipsdemo.dto.ArticleDto;
import com.demo.relationships.relationshipsdemo.models.Article;
import com.demo.relationships.relationshipsdemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticlesController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/post")
    public Article postArticle(@RequestBody ArticleDto articleDto){

        return articleService.addArtical(articleDto);
    }

    @GetMapping("/get/{id}")
    public Article getArticle(@PathVariable Long id){

        return articleService.getArticle(id);

    }

}
