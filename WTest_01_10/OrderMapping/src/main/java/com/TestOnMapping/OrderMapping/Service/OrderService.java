package com.TestOnMapping.OrderMapping.Service;

import com.TestOnMapping.OrderMapping.Model.Order;
import com.TestOnMapping.OrderMapping.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;

    public String saveOrder(Order order){
        orderRepo.save(order);
        return "Order saved";
    }

    public Order getOrderId(Integer id){
        return orderRepo.findById(id).get();
    }
}
