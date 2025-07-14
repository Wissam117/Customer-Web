package com.CustomerWeb.repository;

import com.CustomerWeb.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findByProductId(Long productId);
    List<Inventory> findBySupplierId(Long supplierId);
    Optional<Inventory> findByProductIdAndSupplierId(Long productId, Long supplierId);
}