package com.tobeto.java4a.repositories;

import com.tobeto.java4a.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer>
{
    // Global Exception Handling --
    // Derived Query Methods
    // Custom Queries
    Optional<Category> findByNameIgnoreCase(String name);
}
// 2:55