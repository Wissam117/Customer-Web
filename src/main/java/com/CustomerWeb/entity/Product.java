package com.CustomerWeb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @SequenceGenerator(name = "product_seq", sequenceName = "product_seq", allocationSize = 1)
    private Long id;
    @NotBlank
    @Column(nullable = false)
    private String name;
    @Column(length = 2000)
    private String description;

    @NotNull
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "image_url")
    private String imageUrl;

    private boolean active;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Review> reviews;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Inventory> inventories;

    @ManyToMany
    @JoinTable(
            name = "product_suppliers",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "supplier_id")
    )
    private Set<Supplier> suppliers;
    @ManyToMany(mappedBy = "products")
    private Set<Cart> carts;
    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;

    @PrePersist
    protected void onCreate()
    {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
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