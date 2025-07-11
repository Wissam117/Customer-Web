package com.CustomerWeb.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class Product {

    private Long id;
    private String name;

    private String description;

    private BigDecimal price;
    private String imageUrl;

    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Category category;
    private List<Review> reviews;

    private List<Inventory> inventories;

    private Set<Supplier> suppliers;
    private Set<Cart> carts;

    private List<OrderItem> orderItems;
    protected void onCreate()
    {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    protected void onUpdate() {
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

    public BigDecimal getPrice()
    {
        return price;

    }
    public void setPrice(BigDecimal price)
    {

        this.price = price;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;

    }
    public boolean isActive()
    {
        return active;

    }
    public void setActive(boolean active)
    {

        this.active = active;
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
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category)
    {
        this.category = category;
    }

    public List<Review> getReviews()
    {
        return reviews;
    }
    public void setReviews(List<Review> reviews)
    {
        this.reviews = reviews;
    }

    public List<Inventory> getInventories() {
        return inventories;

    }

    public void setInventories(List<Inventory> inventories)
    {
        this.inventories = inventories;
    }
    public Set<Supplier> getSuppliers()
    {

        return suppliers;
    }
    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;

    }

    public Set<Cart> getCarts()
    {

        return carts;
    }
    public void setCarts(Set<Cart> carts)
    {
        this.carts = carts;
    }
    public List<OrderItem> getOrderItems()
    {
        return orderItems;

    }
    public void setOrderItems(List<OrderItem> orderItems)
    {

        this.orderItems = orderItems;
    }
}