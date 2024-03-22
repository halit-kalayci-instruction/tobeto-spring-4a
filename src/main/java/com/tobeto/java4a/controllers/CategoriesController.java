package com.tobeto.java4a.controllers;

import com.tobeto.java4a.entities.Category;
import com.tobeto.java4a.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
    // CRUD => Create,Read,Update,Delete
    private CategoryRepository categoryRepository;
    // Ctor Injection
    // Dependency Injection
    public CategoriesController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    // Spring IoC -> Araştırma ödevi (PERŞEMBE)

    @GetMapping
    public List<Category> getAll() {
        // İşlevi yerine getirebilmek için başka bir nesneye (CategoryRepository) ihtiyaç duyuyor ise
        // Dependency denir.
        return categoryRepository.findAll();
    }

    @PostMapping
    public String add(@RequestBody Category category)
    {
        // TODO: Doğru noktaya taşı.
        if(category.getName().length() < 3)
            throw new RuntimeException("EN az 3 haneli bir isim girin.");

        categoryRepository.save(category);
        return "Başarıyla Eklendi.";
    }

    @PutMapping
    public String update(@RequestBody Category category)
    {
        categoryRepository.save(category);
        return "Başarıyla Güncellendi";
    }

    @DeleteMapping
    public String delete(@RequestParam int id)
    {
        Category category = categoryRepository
                .findById(id)
                .orElseThrow(()-> new RuntimeException("Böyle bir kategori bulunamadı."));
        // ex fırladığında bu satıra geçilmez.
        categoryRepository.delete(category);

        return "Başarıyla Silindi";
    }
}
// Dün verilen workshop devam
// Sadece 1 entity için controller ve 4 CRUD operasyonu örneği kodlanacak.