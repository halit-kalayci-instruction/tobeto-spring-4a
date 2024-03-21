package com.tobeto.java4a;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController
{
    @GetMapping
    public String sayHello(@RequestParam String name)
    {
        // DB'e bağlanıp
        // veri ekle. veri sorgula. veri güncelle
        return "Merhaba " + name;
    }

    @PostMapping
    public Product sayGoodBye(@RequestBody Product product)
    {
        return product;
    }
    // Web, HTTP, HTTP Anatomy
    // Medium
    // 3:20

    @PutMapping
    public String saySomething()
    {
        return "Bla bla..";
    }
}
