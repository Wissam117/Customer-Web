package com.CustomerWeb.repository;

import com.CustomerWeb.entity.Payment;
import com.CustomerWeb.entity.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByOrderId(Long orderId);
    Optional<Payment> findByTransactionId(String transactionId);
    List<Payment> findByStatus(PaymentStatus status);
}