package com.tobeto.java4a.controllers;

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

    @PutMapping
    public String saySomething()
    {
        return "Bla bla..";
    }
}
