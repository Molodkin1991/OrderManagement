package com.kuhnenagel.OrderManagementApplication.repo;

import com.kuhnenagel.OrderManagementApplication.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepo extends JpaRepository<Customer,Long> {

}