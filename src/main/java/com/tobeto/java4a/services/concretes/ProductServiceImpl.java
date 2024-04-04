package com.tobeto.java4a.services.concretes;

import com.tobeto.java4a.entities.Product;
import com.tobeto.java4a.repositories.ProductRepository;
import com.tobeto.java4a.services.abstracts.ProductService;
import com.tobeto.java4a.services.dtos.requests.AddProductRequest;
import com.tobeto.java4a.services.mappers.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public void add(AddProductRequest request) {
        // Manual Mapping
        /*Product product = new Product();
        product.setName(request.getName());
        product.setUnitPrice(request.getPrice());
        product.setSalePercentage(request.getSalePercentage());
        product.setColor(request.getColor());
        product.setStock(request.getStock());
        product.setImageUrl(request.getImageUrl());
        Category category = new Category();
        category.setId(request.getCategoryId());
        product.setCategory(category);*/

        // Auto Mapping
        // Business Rule

        Product product = ProductMapper.INSTANCE.productFromAddRequest(request);
        productRepository.save(product);
    }
}
// ModelMapper, MapStruct ..
