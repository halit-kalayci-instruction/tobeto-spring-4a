package com.tobeto.java4a.services.concretes;

import com.tobeto.java4a.repositories.ProductRepository;
import com.tobeto.java4a.services.abstracts.ProductService;
import com.tobeto.java4a.services.dtos.requests.AddProductRequest;
import com.tobeto.java4a.services.dtos.responses.AddProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
public class ProductManager implements ProductService {

    private ProductRepository productRepository;

    @Override
    public AddProductResponse add(AddProductRequest request) {
        return null;
    }
}
