package com.tobeto.java4a.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="products")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product
{
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="unit_price")
    private double unitPrice;

    @Column(name="stock")
    private int stock;

    @Column(name="image_url")
    private String imageUrl;

    @Column(name="sale_percentage")
    private double salePercentage;

    @Column(name="color")
    private String color;

    // İLİŞKİ
    // FK OLARAK TANIMLANMAZ!
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
}
