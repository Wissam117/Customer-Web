package com.CustomerWeb.service;

import com.CustomerWeb.entity.Order;
import com.CustomerWeb.entity.OrderStatus;
import com.CustomerWeb.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService
{

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }
    public Optional<Order> getOrderByOrderNumber(String orderNumber)
    {
        return orderRepository.findByOrderNumber(orderNumber);
    }

    public List<Order> getOrdersByCustomer(Long customerId)
    {
        return orderRepository.findByCustomerId(customerId);
    }

    public List<Order> getOrdersByStatus(OrderStatus status)
    {
        return orderRepository.findByStatus(status);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}