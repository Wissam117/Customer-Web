package com.CustomerWeb.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplier_seq")
    @SequenceGenerator(name = "supplier_seq", sequenceName = "supplier_seq", allocationSize = 1)
    private Long id;
    @NotBlank
    @Column(nullable = false)
    private String name;
    @Email
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;

    private String address;
    private boolean active;
    @ManyToMany(mappedBy = "suppliers")
    private Set<Product> products;
    @OneToMany(mappedBy = "supplier")
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
