package com.CustomerWeb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_seq")
    @SequenceGenerator(name = "payment_seq", sequenceName = "payment_seq", allocationSize = 1)
    private Long id;

    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    @Column(name = "payment_method")
    private PaymentMethod paymentMethod;
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
    @Column(name = "transaction_id")
    private String transactionId;
    @Column(name = "payment_date")
    private LocalDateTime paymentDate;

    @OneToOne(optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
    @PrePersist
    protected void onCreate()
    {
        paymentDate = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;

    }
    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public PaymentMethod getPaymentMethod()
    {

        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod)
    {
        this.paymentMethod = paymentMethod;

    }
    public PaymentStatus getStatus()
    {
        return status;
    }

    public void setStatus(PaymentStatus status)
    {
        this.status = status;
    }
    public String getTransactionId()
    {
        return transactionId;
    }
    public void setTransactionId(String transactionId)
    {
        this.transactionId = transactionId;
    }

    public LocalDateTime getPaymentDate()
    {
        return paymentDate;
    }
    public void setPaymentDate(LocalDateTime paymentDate)
    {
        this.paymentDate = paymentDate;
    }
    public Order getOrder()
    {
        return order;
    }

    public void setOrder(Order order)
    {
        this.order = order;
    }
}