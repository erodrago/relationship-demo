package com.demo.relationships.relationshipsdemo.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "category", schema = "public")
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "article_id")
    private Article articles;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }


    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Article getArticles() {
        return articles;
    }

    public void setArticles(Article articles) {
        this.articles = articles;
    }
}
