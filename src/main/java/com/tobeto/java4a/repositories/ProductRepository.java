package com.tobeto.java4a.repositories;

import com.tobeto.java4a.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> { }
