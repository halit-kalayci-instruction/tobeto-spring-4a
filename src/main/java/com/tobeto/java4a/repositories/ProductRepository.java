package com.tobeto.java4a.repositories;

import com.tobeto.java4a.entities.Product;
import com.tobeto.java4a.services.dtos.responses.ListProductResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
    //@Query(value="Select id,name,unit_price as \"unitPrice\" from products Where name LIKE '%a%'", nativeQuery = true)
    @Query(value="Select new com.tobeto.java4a.services.dtos.responses.ListProductResponse(p.id, p.name, p.unitPrice) " +
            "from Product p Where p.unitPrice <= ?2 and LOWER(p.name) LIKE CONCAT('%', LOWER(?1), '%')", nativeQuery = false)
    // Select * from products => Select p from Product p
    List<ListProductResponse> search(String query, double unitPrice);
}
// :query, :unitPrice
// ?1 => 1.param, ?2 => 2.parametre