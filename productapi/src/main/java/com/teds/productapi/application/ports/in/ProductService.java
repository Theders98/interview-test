package com.teds.productapi.application.ports.in;

import com.teds.productapi.application.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProductsById(String productId);
}
