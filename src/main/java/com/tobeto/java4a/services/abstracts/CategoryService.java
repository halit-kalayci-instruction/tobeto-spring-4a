package com.tobeto.java4a.services.abstracts;


import com.tobeto.java4a.entities.Category;

import java.util.List;

public interface CategoryService
{
    void add(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> getAll();
    Category getById(int id);
}
