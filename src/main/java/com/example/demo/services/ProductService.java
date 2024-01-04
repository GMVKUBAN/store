package com.example.demo.services;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Page<Product> getProductWithPagingAndFiltering (Specification<Product> specification, Pageable pageable) {
        return productRepository.findAll (specification, pageable);
    }


    public Product getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }


    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public void saveOrUpdate(Product product) {
        productRepository.save(product);
    }
}


