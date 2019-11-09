package com.demo.relationships.relationshipsdemo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "content")
    private String content;




    public Article() {
    }

    public Article(String title, String description, String keywords,
                   String content) {
        this.title = title;
        this.description = description;
        this.keywords = keywords;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}