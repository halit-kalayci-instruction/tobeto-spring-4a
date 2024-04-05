package com.tobeto.java4a.services.abstracts;

import com.tobeto.java4a.entities.Product;
import com.tobeto.java4a.services.dtos.requests.AddProductRequest;
import com.tobeto.java4a.services.dtos.responses.AddProductResponse;
import com.tobeto.java4a.services.dtos.responses.ListProductResponse;

import java.util.List;

public interface ProductService {
    AddProductResponse add(AddProductRequest request);
    List<ListProductResponse> search(String query, double unitPrice);
}
