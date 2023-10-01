package com.TestOnMapping.OrderMapping.Controller;

import com.TestOnMapping.OrderMapping.Model.Order;
import com.TestOnMapping.OrderMapping.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String saveOrder(@RequestBody Order order){
        return  orderService.saveOrder(order);
    }

    @GetMapping("order/id/{id}")
    public Order getOrderId(@PathVariable Integer id){
        return orderService.getOrderId(id);
    }
}
