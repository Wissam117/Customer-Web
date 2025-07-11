package com.CustomerWeb.entity;
import java.util.List;

public class Address {
    private Long id;
    private String street;
    private String city;

    private String state;
    private String zipCode;

    private String country;
    private boolean isDefault;
    private Customer customer;

    private List<Order> orders;
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