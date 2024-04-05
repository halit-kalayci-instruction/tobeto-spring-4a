package com.tobeto.java4a.services.abstracts;

import com.tobeto.java4a.services.dtos.requests.AddProductRequest;
import com.tobeto.java4a.services.dtos.responses.AddProductResponse;

public interface ProductService {
    AddProductResponse add(AddProductRequest request);
}
