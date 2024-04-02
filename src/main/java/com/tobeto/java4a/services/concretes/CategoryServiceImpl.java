package com.tobeto.java4a.services.concretes;

import com.tobeto.java4a.core.utils.exceptions.types.BusinessException;
import com.tobeto.java4a.entities.Category;
import com.tobeto.java4a.repositories.CategoryRepository;
import com.tobeto.java4a.services.abstracts.CategoryService;
import com.tobeto.java4a.services.dtos.requests.AddCategoryRequest;
import com.tobeto.java4a.services.dtos.responses.AddCategoryResponse;
import com.tobeto.java4a.services.dtos.responses.ListCategoryResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService
{
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public AddCategoryResponse add(AddCategoryRequest request) {
        // Algoritma
        categoryWithSameNameShouldNotExist(request.getName());
        Category category = new Category();
        category.setName(request.getName());
        Category savedCategory = categoryRepository.save(category);
        AddCategoryResponse response = new AddCategoryResponse(savedCategory.getId(), savedCategory.getName());
        return response;
    }

    @Override
    public void update(Category category) {
        categoryWithSameNameShouldNotExist(category.getName());
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


    // 1. => Anlaşılabilirlik
    // 2. => Uzunluk
    private void categoryWithSameNameShouldNotExist(String categoryName)
    {
        Optional<Category> categoryWithSameName = categoryRepository.findByNameIgnoreCase(categoryName);

        if(categoryWithSameName.isPresent())
            throw new BusinessException("Aynı isimde bir kategori zaten var.");
    }
}
