package com.CustomerWeb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
    @SequenceGenerator(name = "order_seq", sequenceName = "order_seq", allocationSize = 1)
    private Long id;

    @Column(name = "order_number", unique = true, nullable = false)
    private String orderNumber;

    @NotNull
    @Column(name = "total_amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne(optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Shipping shipping;
    @ManyToOne
    @JoinColumn(name = "delivery_address_id")
    private Address deliveryAddress;

    @PrePersist
    protected void onCreate()
    {
        orderDate = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
        if (orderNumber == null) {
            orderNumber = "ORD" + System.currentTimeMillis();
        }
    }
    @PreUpdate
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