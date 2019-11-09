package com.demo.relationships.relationshipsdemo.service;

import com.demo.relationships.relationshipsdemo.dto.CategoryDto;
import com.demo.relationships.relationshipsdemo.models.Article;
import com.demo.relationships.relationshipsdemo.models.Category;
import com.demo.relationships.relationshipsdemo.repository.ArticleRepository;
import com.demo.relationships.relationshipsdemo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ArticleRepository articleRepository;

    public Category addCategory(CategoryDto categoryDto){

        Category category = new Category();
        category.setName(categoryDto.getName());

        Set<Article> articleList = new HashSet<>();

        for(Long oneArticle: categoryDto.getArticleName()){
            Optional<Article> article = articleRepository.findById(oneArticle);

            if(article.isPresent()) {

                articleList.add(article.get());
            }
        }

        category.setArticles(articleList);

        category = categoryRepository.save(category);

        return category;


    }

    public Category getCategory(Long id){

        Optional<Category> category = categoryRepository.findById(id);

        return category.get();


    }
}
