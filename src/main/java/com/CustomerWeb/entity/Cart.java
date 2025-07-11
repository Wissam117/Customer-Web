package com.CustomerWeb.entity;

import java.time.LocalDateTime;
import java.util.Set;

public class Cart {

    private Long id;
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
    private Customer customer;
    private Set<Product> products;

    protected void onCreate()
    {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }
    protected void onUpdate()
    {
        updatedAt = LocalDateTime.now();
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
    public LocalDateTime getCreatedAt()
    {

        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt)
    {
        this.createdAt = createdAt;
    }
    public LocalDateTime getUpdatedAt()
    {
        return updatedAt;

    }
    public void setUpdatedAt(LocalDateTime updatedAt)
    {
        this.updatedAt = updatedAt;

    }

    public Customer getCustomer()
    { return customer; }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public Set<Product> getProducts()
    {
        return products;
    }
    public void setProducts(Set<Product> products)
    {
        this.products = products;
    }
}