package com.tobeto.java4a.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="users")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    private String email; // eğer kolon ismi ile değişken ismi aynı olsun istiyosanız @Column gerek yok.
    private String firstName;
    private String lastName;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Address> addreses;
}

// Bir kullanıcı çok adres
// Bir adres bir kullanıcı