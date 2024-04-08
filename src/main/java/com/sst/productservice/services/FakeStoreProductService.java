package com.sst.productservice.services;

import com.sst.productservice.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{
    public Product getProductById(Long id) {
        return null;
    }

    public List<Product> getAllProducts() {
        return null;
    }
}
