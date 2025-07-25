package com.CustomerWeb.service;

import com.CustomerWeb.entity.Category;
import com.CustomerWeb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService
{
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> getAllCategories()
    {
        return categoryRepository.findAll();
    }


    public List<Category> getActiveCategories()
    {
        return categoryRepository.findByActiveTrue();
    }
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }
    public Optional<Category> getCategoryByName(String name) {
        return categoryRepository.findByName(name);
    }
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}