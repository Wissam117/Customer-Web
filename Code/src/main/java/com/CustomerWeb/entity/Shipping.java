package com.CustomerWeb.entity;
import java.time.LocalDateTime;

public class Shipping {

    private Long id;
    private String trackingNumber;

    private String carrier;

    private ShippingStatus status;
    private LocalDateTime shippedDate;

    private LocalDateTime estimatedDeliveryDate;
    private LocalDateTime actualDeliveryDate;

    private Order order;

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