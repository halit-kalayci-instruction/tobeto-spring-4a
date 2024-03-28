package com.tobeto.java4a.services.concretes;

import com.tobeto.java4a.entities.Category;
import com.tobeto.java4a.repositories.CategoryRepository;
import com.tobeto.java4a.services.abstracts.CategoryService;
import com.tobeto.java4a.services.dtos.requests.AddCategoryRequest;
import com.tobeto.java4a.services.dtos.responses.AddCategoryResponse;
import com.tobeto.java4a.services.dtos.responses.ListCategoryResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService
{
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public AddCategoryResponse add(AddCategoryRequest request) {
        Category category = new Category();
        category.setName(request.getName());
        Category savedCategory = categoryRepository.save(category);
        AddCategoryResponse response = new AddCategoryResponse(savedCategory.getId(), savedCategory.getName());
        return response;
    }

    @Override
    public void update(Category category) {

    }
    @Override
    public void delete(int id) {

    }
    @Override
    public List<ListCategoryResponse> getAll() {
        List<Category> categories = categoryRepository.findAll();

        List<ListCategoryResponse> result = new ArrayList<>();
        // Listeyi Manual Mapleme - Amatör
        // TODO: Refactor
        for (Category c:
             categories) {
            ListCategoryResponse dto = new ListCategoryResponse(c.getId(), c.getName());
            result.add(dto);
        }
        return result;
    }
    @Override
    public Category getById(int id) {
        return categoryRepository.findById(id).orElseThrow();
    }
}
