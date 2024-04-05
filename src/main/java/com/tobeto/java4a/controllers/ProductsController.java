package com.tobeto.java4a.controllers;

import com.tobeto.java4a.entities.Product;
import com.tobeto.java4a.services.abstracts.ProductService;
import com.tobeto.java4a.services.dtos.requests.AddProductRequest;
import com.tobeto.java4a.services.dtos.responses.AddProductResponse;

import com.tobeto.java4a.services.dtos.responses.ListProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    // Full Qualify Variable
    @GetMapping
    public List<ListProductResponse> search(@RequestParam String query, @RequestParam double unitPrice)
    {
        return productService.search(query,unitPrice);
    }
}
// O => Open/Closed Principle
