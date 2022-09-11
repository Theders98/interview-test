package com.teds.productapi.apirest.mappers;

import com.teds.apis.model.ProductDTO;
import com.teds.productapi.application.domain.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductDTOMapper {

    Product from(ProductDTO productDTO0);
    ProductDTO to(Product product);

    List<ProductDTO> toList(List<Product> products);
    List<Product> fromList(List<ProductDTO> productDTOS);
}
