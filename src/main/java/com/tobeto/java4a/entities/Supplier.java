package com.tobeto.java4a.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="suppliers")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    private String companyName;
    private String taxNo;

    @ManyToMany(mappedBy = "suppliers")
    private List<Product> products;
}
