package com.CustomerWeb.entity;
import java.time.LocalDateTime;

public class Review {

    private Long id;
    private Integer rating;
    private String comment;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Customer customer;
    private Product product;

    protected void onCreate()
    {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
    public Integer getRating()
    {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public String getComment()
    {
        return comment;
    }
    public void setComment(String comment)
    { this.comment = comment; }
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
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    public Product getProduct()
    {

        return product;

    }
    public void setProduct(Product product)
    {
        this.product = product;
    }
}