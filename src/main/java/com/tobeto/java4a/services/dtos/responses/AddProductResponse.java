package com.tobeto.java4a.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductResponse {
    private int id;
    private String categoryName;
    private double unitPrice;
    private int stock;
    private String name;
}
