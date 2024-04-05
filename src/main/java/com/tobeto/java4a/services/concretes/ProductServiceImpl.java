package com.tobeto.java4a.services.concretes;

import com.tobeto.java4a.entities.Product;
import com.tobeto.java4a.repositories.ProductRepository;
import com.tobeto.java4a.services.abstracts.ProductService;
import com.tobeto.java4a.services.dtos.requests.AddProductRequest;
import com.tobeto.java4a.services.dtos.responses.AddProductResponse;
import com.tobeto.java4a.services.dtos.responses.ListProductResponse;
import com.tobeto.java4a.services.mappers.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// Factory Pattern

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public AddProductResponse add(AddProductRequest request) {
        Product product = ProductMapper.INSTANCE.productFromAddRequest(request);
        product = productRepository.save(product);

        AddProductResponse addProductResponse = ProductMapper.INSTANCE.addResponseFromProduct(product);

        return addProductResponse;
    }

    @Override
    public List<ListProductResponse> search(String query,double unitPrice) {
        return productRepository.search(query, unitPrice);
    }
}

