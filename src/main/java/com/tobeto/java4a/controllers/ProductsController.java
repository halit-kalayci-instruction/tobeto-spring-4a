package com.tobeto.java4a.controllers;

import com.tobeto.java4a.services.abstracts.ProductService;
import com.tobeto.java4a.services.dtos.requests.AddProductRequest;
import com.tobeto.java4a.services.dtos.responses.AddProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductsController
{
    private ProductService productService;

    @PostMapping
    public AddProductResponse add(@RequestBody AddProductRequest request)
    {
        return productService.add(request);
    }
}
// O => Open/Closed Principle