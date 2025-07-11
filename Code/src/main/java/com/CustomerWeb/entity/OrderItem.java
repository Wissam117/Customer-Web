package com.CustomerWeb.entity;
import java.math.BigDecimal;

public class OrderItem {

    private Long id;
    private Integer quantity;
    private BigDecimal price;

    private BigDecimal totalPrice;
    private Order order;

    private Product product;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
    public Integer getQuantity()
    {
        return quantity;

    }

    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price)
    {

        this.price = price;
    }
    public BigDecimal getTotalPrice()
    {
        return totalPrice;
    }
    public void setTotalPrice(BigDecimal totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order)
    {
        this.order = order;
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
