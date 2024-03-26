package com.tobeto.java4a.services.concretes;

import com.tobeto.java4a.entities.Category;
import com.tobeto.java4a.repositories.CategoryRepository;
import com.tobeto.java4a.services.abstracts.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService
{
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void add(Category category) {
        if(category.getName().length() < 3)
            throw new RuntimeException("Kategori ismi en az 3 haneli olmalıdır.");

        categoryRepository.save(category);
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(int id) {
        return categoryRepository.findById(id).orElseThrow();
    }
}
