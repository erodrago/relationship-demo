package com.demo.relationships.relationshipsdemo.repository;


import com.demo.relationships.relationshipsdemo.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    Article findByTitle(String title);
}
