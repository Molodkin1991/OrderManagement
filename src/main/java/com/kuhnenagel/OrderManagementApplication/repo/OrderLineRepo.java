package com.kuhnenagel.OrderManagementApplication.repo;

import com.kuhnenagel.OrderManagementApplication.model.Order;
import com.kuhnenagel.OrderManagementApplication.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderLineRepo extends JpaRepository<OrderLine, Long> {;
    List<OrderLine> findByOrder(Order order);
}

