package com.CustomerWeb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventory_seq")
    @SequenceGenerator(name = "inventory_seq", sequenceName = "inventory_seq", allocationSize = 1)
    private Long id;

    @NotNull
    @Min(0)
    @Column(nullable = false)
    private Integer quantity;

    @Min(0)
    @Column(name = "reserved_quantity")
    private Integer reservedQuantity;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @PrePersist
    @PreUpdate
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
