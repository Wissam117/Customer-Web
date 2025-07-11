package com.CustomerWeb.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Customer {

    private Long id;
    private String firstName;
    private String lastName;

    private String email;
    private String password;
    private String phoneNumber;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
    private List<Address> addresses;
    private List<Order> orders;

    private Cart cart;
    private List<Review> reviews;

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

    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName; }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName)
    {

        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;

    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;

    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getCreatedAt() {
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
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public List<Address> getAddresses()
    {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    public List<Order> getOrders()
    {
        return orders;
    }
    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }

    public Cart getCart()
    {
        return cart;

    }
    public void setCart(Cart cart)
    {

        this.cart = cart;
    }
    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews)
    {
        this.reviews = reviews;
    }
}