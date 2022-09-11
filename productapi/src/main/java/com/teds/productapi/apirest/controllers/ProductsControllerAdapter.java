package com.teds.productapi.apirest.controllers;

import com.teds.apis.ProductApi;
import com.teds.apis.model.ProductDTO;
import com.teds.productapi.apirest.mappers.ProductDTOMapper;
import com.teds.productapi.application.ports.in.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Objects;

@Controller
@Slf4j
@AllArgsConstructor
public class ProductsControllerAdapter implements ProductApi {

    ProductDTOMapper productDTOMapper;
    ProductService productService;
    @Override
    public ResponseEntity<List<ProductDTO>> getProductSimilar(String productId) {

        List<ProductDTO> productDTOS = productDTOMapper.toList(productService.getAllProductsById(productId));

        if (Objects.isNull(productDTOS)){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok(productDTOS);
    }
}
