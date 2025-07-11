package com.CustomerWeb.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
public class Order {

    private Long id;
    private String orderNumber;

    private BigDecimal totalAmount;

    private OrderStatus status;
    private LocalDateTime orderDate;
    private LocalDateTime updatedAt;

    private Customer customer;
    private List<OrderItem> orderItems;

    private Payment payment;

    private Shipping shipping;
    private Address deliveryAddress;

    protected void onCreate()
    {
        orderDate = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
        if (orderNumber == null) {
            orderNumber = "ORD" + System.currentTimeMillis();
        }
    }

    protected void onUpdate() {
        updatedAt = LocalDateTime.now();

    }

    public Long getId()
    {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getOrderNumber()
    {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {

        this.orderNumber = orderNumber;
    }
    public BigDecimal getTotalAmount()
    {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount)
    {
        this.totalAmount = totalAmount;
    }
    public OrderStatus getStatus()
    {
        return status;
    }
    public void setStatus(OrderStatus status)
    {
        this.status = status;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDateTime orderDate)
    {
        this.orderDate = orderDate;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;

    }
    public void setUpdatedAt(LocalDateTime updatedAt)
    {
        this.updatedAt = updatedAt;

    }
    public Customer getCustomer()
    {
        return customer;

    }
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    public List<OrderItem> getOrderItems()
    {

        return orderItems;
    }
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    public Payment getPayment()
    {
        return payment;
    }
    public void setPayment(Payment payment)
    {
        this.payment = payment;
    }
    public Shipping getShipping()
    {

        return shipping;
    }

    public void setShipping(Shipping shipping)
    {
        this.shipping = shipping;
    }
    public Address getDeliveryAddress()
    {
        return deliveryAddress;
    }
    public void setDeliveryAddress(Address deliveryAddress)
    {
        this.deliveryAddress = deliveryAddress;

    }
}