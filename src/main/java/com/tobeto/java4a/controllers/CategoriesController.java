package com.tobeto.java4a.controllers;

import com.tobeto.java4a.entities.Category;
import com.tobeto.java4a.services.abstracts.CategoryService;
import com.tobeto.java4a.services.dtos.CategoryForAddDto;
import com.tobeto.java4a.services.dtos.CategoryForListingDto;
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
    public List<CategoryForListingDto> getAll() {
        return categoryService.getAll();
    }

    @PostMapping
    public void add(@RequestBody CategoryForAddDto dto)
    {
        categoryService.add(dto);
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
// DTO => Data Transfer Object
