package com.tobeto.java4a.services.abstracts;


import com.tobeto.java4a.entities.Category;
import com.tobeto.java4a.services.dtos.CategoryForAddDto;
import com.tobeto.java4a.services.dtos.CategoryForListingDto;

import java.util.List;

public interface CategoryService
{
    void add(CategoryForAddDto dto);
    void update(Category category);
    void delete(int id);
    List<CategoryForListingDto> getAll();
    Category getById(int id);
}
