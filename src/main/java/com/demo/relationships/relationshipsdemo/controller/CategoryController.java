package com.demo.relationships.relationshipsdemo.controller;

import com.demo.relationships.relationshipsdemo.dto.CategoryDto;
import com.demo.relationships.relationshipsdemo.models.Category;
import com.demo.relationships.relationshipsdemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/post")
    public Category postCategory(@RequestBody CategoryDto categoryDto){

        return categoryService.addCategory(categoryDto);

    }

    @GetMapping("/get/{id}")
    public Category getCategory(@PathVariable Long id){

        return categoryService.getCategory(id);

    }

}
