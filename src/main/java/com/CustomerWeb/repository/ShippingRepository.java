package com.CustomerWeb.repository;

import com.CustomerWeb.entity.Shipping;
import com.CustomerWeb.entity.ShippingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ShippingRepository extends JpaRepository<Shipping, Long>
{
    Optional<Shipping> findByOrderId(Long orderId);
    Optional<Shipping> findByTrackingNumber(String trackingNumber);
    List<Shipping> findByStatus(ShippingStatus status);
}