package com.tobeto.java4a.services.dtos.requests;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {
    private int categoryId;
    private String name;
    private double price;
    private int stock;
    private String imageUrl;
    private double salePercentage;
    private String color;
}
