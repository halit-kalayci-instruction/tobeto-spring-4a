package com.tobeto.java4a.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    public static void hello()
    {

    }
    // İLİŞKİ
    // FK OLARAK TANIMLANMAZ!
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @ManyToMany
    @JoinTable(name="product_supplier",
            joinColumns = @JoinColumn(name="product_id"),
            inverseJoinColumns = @JoinColumn(name="supplier_id"))
    private List<Supplier> suppliers;

    @OneToMany(mappedBy = "product")
    private List<OrderProduct> orderProducts;
}
