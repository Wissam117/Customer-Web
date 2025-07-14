package com.CustomerWeb.repository;

import com.CustomerWeb.entity.Order;
import com.CustomerWeb.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerId(Long customerId);
    Optional<Order> findByOrderNumber(String orderNumber);
    List<Order> findByStatus(OrderStatus status);
    List<Order> findByCustomerIdAndStatus(Long customerId, OrderStatus status);
}