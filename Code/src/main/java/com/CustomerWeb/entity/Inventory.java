package com.CustomerWeb.entity;
import java.time.LocalDateTime;

public class Inventory {

    private Long id;

    private Integer quantity;
    private Integer reservedQuantity;
    private LocalDateTime lastUpdated;

    private Product product;
    private Supplier supplier;

    protected void onUpdate()
    {
        lastUpdated = LocalDateTime.now();
    }
    public Long getId()
    {
        return id;

    }

    public void setId(Long id) {

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
    public Integer getReservedQuantity()
    {
        return reservedQuantity;
    }

    public void setReservedQuantity(Integer reservedQuantity)
    {
        this.reservedQuantity = reservedQuantity;

    }
    public LocalDateTime getLastUpdated() {

        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated)
    {

        this.lastUpdated = lastUpdated;
    }
    public Product getProduct()
    {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public Supplier getSupplier()
    {
        return supplier;
    }
    public void setSupplier(Supplier supplier)
    {

        this.supplier = supplier;
    }
}
