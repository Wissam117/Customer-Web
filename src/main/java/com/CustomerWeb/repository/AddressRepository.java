package com.CustomerWeb.repository;

import com.CustomerWeb.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>
{
    List<Address> findByCustomerId(Long customerId);
    List<Address> findByCustomerIdAndIsDefaultTrue(Long customerId);
}