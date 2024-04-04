package com.tobeto.java4a.services.mappers;

import com.tobeto.java4a.entities.Product;
import com.tobeto.java4a.services.dtos.requests.AddProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "unitPrice", source = "price") // isim aynı değil özel konfigürasyon istiyor.
    @Mapping(target="category.id", source = "categoryId")
    Product productFromAddRequest(AddProductRequest request);
}
