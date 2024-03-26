package com.tobeto.java4a.services.concretes;

import com.tobeto.java4a.entities.Category;
import com.tobeto.java4a.repositories.CategoryRepository;
import com.tobeto.java4a.services.abstracts.CategoryService;
import com.tobeto.java4a.services.dtos.CategoryForAddDto;
import com.tobeto.java4a.services.dtos.CategoryForListingDto;
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
    public void add(CategoryForAddDto dto) {
        if(dto.getName().length() < 3)
            throw new RuntimeException("Kategori ismi en az 3 haneli olmalıdır.");

        // Manual Mapping
        Category category = new Category();
        category.setName(dto.getName());
        categoryRepository.save(category);
    }

    @Override
    public void update(Category category) {

    }
    @Override
    public void delete(int id) {

    }
    @Override
    public List<CategoryForListingDto> getAll() {
        List<Category> categories = categoryRepository.findAll();

        List<CategoryForListingDto> result = new ArrayList<>();
        // Listeyi Manual Mapleme - Amatör
        // TODO: Refactor
        for (Category c:
             categories) {
            CategoryForListingDto dto = new CategoryForListingDto(c.getName());
            result.add(dto);
        }
        return result;
    }
    @Override
    public Category getById(int id) {
        return categoryRepository.findById(id).orElseThrow();
    }
}
