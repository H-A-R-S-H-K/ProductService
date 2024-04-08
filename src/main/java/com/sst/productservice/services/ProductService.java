package com.sst.productservice.services;

import com.sst.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
}
