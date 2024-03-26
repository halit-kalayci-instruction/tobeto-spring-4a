package com.tobeto.java4a.controllers;

import com.tobeto.java4a.entities.Category;
import com.tobeto.java4a.services.abstracts.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Single Responsibility Principle ✅✅
@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
    // Hiç bir controller repository injekte etmemeli!
    private CategoryService categoryService;

    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Category category)
    {
        categoryService.add(category);
    }

    @PutMapping
    public void update(@RequestBody Category category)
    {
        categoryService.update(category);
    }

    @DeleteMapping
    public void delete(@RequestParam int id)
    {
        categoryService.delete(id);
    }
}
