package com.tobeto.java4a.services.abstracts;


import com.tobeto.java4a.entities.Category;
import com.tobeto.java4a.services.dtos.requests.AddCategoryRequest;
import com.tobeto.java4a.services.dtos.responses.AddCategoryResponse;
import com.tobeto.java4a.services.dtos.responses.ListCategoryResponse;

import java.util.List;

public interface CategoryService
{
    AddCategoryResponse add(AddCategoryRequest request);
    void update(Category category);
    void delete(int id);
    List<ListCategoryResponse> getAll();
    Category getById(int id);
}
// İster

// Sisteme kategori eklenmelidir ama şu kurallar uygulanmalıdır =>