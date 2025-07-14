package com.CustomerWeb.service;

import com.CustomerWeb.entity.Product;
import com.CustomerWeb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }
    public List<Product> getActiveProducts() {
        return productRepository.findByActiveTrue();
    }
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
    public List<Product> getProductsByCategory(Long categoryId) {
        return productRepository.findByCategoryIdAndActiveTrue(categoryId);
    }
    public List<Product> searchProducts(String keyword)
    {
        return productRepository.findByKeyword(keyword);
    }
    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
