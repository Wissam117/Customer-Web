package com.CustomerWeb.entity;

import java.util.List;

public class Category {
    private Long id;
    private String name;

    private String description;
    private boolean active;

    private List<Product> products;

    public Long getId()
    {

        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active) {

        this.active = active;
    }
    public List<Product> getProducts()
    {
        return products;
    }
    public void setProducts(List<Product> products)
    {
        this.products = products;

    }
}