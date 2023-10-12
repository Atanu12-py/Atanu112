package com.TestOnMapping.OrderMapping.Repo;

import com.TestOnMapping.OrderMapping.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
