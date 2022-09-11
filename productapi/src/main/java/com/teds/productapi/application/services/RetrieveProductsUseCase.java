package com.teds.productapi.application.services;

import com.teds.productapi.application.domain.Product;
import com.teds.productapi.application.ports.in.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
@AllArgsConstructor
public class RetrieveProductsUseCase implements ProductService {

    private RestTemplate restTemplate;

    @Value("{external.api.existing-products}")
    private String existingProductsUrl;

    @Override
    public List<Product> getAllProductsById(String productId) {
        return null;
    }
//TODO Complete request
    public List<Product> getDataFromExistingProductsApi(String productId){
        ResponseEntity<List<Integer>> response
                = restTemplate.getForEntity(existingProductsUrl+"/" +productId, );

        return null;
    }
}
