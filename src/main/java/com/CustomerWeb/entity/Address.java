package com.CustomerWeb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @SequenceGenerator(name = "address_seq", sequenceName = "address_seq", allocationSize = 1)
    private Long id;
    @NotBlank
    @Column(nullable = false)
    private String street;
    @NotBlank
    @Column(nullable = false)
    private String city;
    @NotBlank
    @Column(nullable = false)
    private String state;
    @NotBlank
    @Column(name = "zip_code", nullable = false)
    private String zipCode;
    @NotBlank
    @Column(nullable = false)
    private String country;
    @Column(name = "is_default")
    private boolean isDefault;
    @ManyToOne(optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @OneToMany(mappedBy = "deliveryAddress")
    private List<Order> orders;
    @OneToMany(mappedBy = "deliveryAddress")
    private List<Shipping> shipments;

    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getState()
    {
        return state;

    }

    public void setState(String state) {
        this.state = state;
    }
    public String getZipCode()
    {

        return zipCode;
    }
    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }
    public String getCountry()
    {
        return country;
    }


    public void setCountry(String country)
    {
        this.country = country;
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public void setDefault(boolean aDefault)
    {
        isDefault = aDefault;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    public List<Order> getOrders()
    {
        return orders;
    }

    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }

    public List<Shipping> getShipments()
    { return shipments; }

    public void setShipments(List<Shipping> shipments) {
        this.shipments = shipments;
    }
}