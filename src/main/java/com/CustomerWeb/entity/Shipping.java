package com.CustomerWeb.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "shipping")
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shipping_seq")
    @SequenceGenerator(name = "shipping_seq", sequenceName = "shipping_seq", allocationSize = 1)
    private Long id;
    @Column(name = "tracking_number")
    private String trackingNumber;

    private String carrier;
    @Enumerated(EnumType.STRING)
    private ShippingStatus status;
    @Column(name = "shipped_date")
    private LocalDateTime shippedDate;
    @Column(name = "estimated_delivery_date")
    private LocalDateTime estimatedDeliveryDate;
    @Column(name = "actual_delivery_date")
    private LocalDateTime actualDeliveryDate;
    @OneToOne(optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
    @ManyToOne
    @JoinColumn(name = "delivery_address_id")
    private Address deliveryAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTrackingNumber()
    {
        return trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber)
    {

        this.trackingNumber = trackingNumber;
    }
    public String getCarrier()
    {
        return carrier;
    }
    public void setCarrier(String carrier)
    {
        this.carrier = carrier;
    }
    public ShippingStatus getStatus()
    {
        return status;
    }

    public void setStatus(ShippingStatus status)
    {

        this.status = status;
    }
    public LocalDateTime getShippedDate()
    {
        return shippedDate;

    }

    public void setShippedDate(LocalDateTime shippedDate)
    {
        this.shippedDate = shippedDate;
    }
    public LocalDateTime getEstimatedDeliveryDate()
    {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate)
    {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public LocalDateTime getActualDeliveryDate()
    {
        return actualDeliveryDate;

    }

    public void setActualDeliveryDate(LocalDateTime actualDeliveryDate)
    {

        this.actualDeliveryDate = actualDeliveryDate;
    }
    public Order getOrder()
    {
        return order;
    }
    public void setOrder(Order order)
    {
        this.order = order;
    }

    public Address getDeliveryAddress()
    {
        return deliveryAddress;
    }
    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}