package com.tobeto.java4a.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="categories")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category
{
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    // mappedBy => Bu ilişki diğer classta
    // hangi değişken ile tanımlı?
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
// OneToOne
// ManyToMany

// Cumartesi => Tüm tabloların
// ORM karşılıkları kodlanmalı.