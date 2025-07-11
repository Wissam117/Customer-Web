package com.CustomerWeb.entity;

import java.util.List;
import java.util.Set;
public class Supplier {
    private Long id;
    private String name;
    private String email;

    private String phoneNumber;

    private String address;
    private boolean active;

    private Set<Product> products;

    private List<Inventory> inventories;

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
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {

        this.email = email;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress()
    {
        return address;

    }

    public void setAddress(String address) {
        this.address = address;
    }
    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }
    public Set<Product> getProducts()
    {
        return products;
    }

    public void setProducts(Set<Product> products)
    {
        this.products = products;
    }
    public List<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(List<Inventory> inventories)
    {
        this.inventories = inventories;
    }
}
