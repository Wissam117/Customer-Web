package com.CustomerWeb.entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {
    private Long id;

    private BigDecimal amount;
    private PaymentMethod paymentMethod;
    private PaymentStatus status;
    private String transactionId;

    private LocalDateTime paymentDate;

    private Order order;
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