package com.thangphamspk.controller;

import com.thangphamspk.entity.Order;
import com.thangphamspk.exception.ObjectNotFoundException;
import com.thangphamspk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @GetMapping("/orders/{id}")
    public Order getOrder(@PathVariable int id) {
        Order order = orderService.getOrder(id);
        if (order == null) {
            throw new ObjectNotFoundException("Could not find Order with id: " + id);
        }
        return order;
    }

    @GetMapping("/orders/{id}/{date}")
    public List<Order> getAllByCoffeeTableIdAndOrderDate(@PathVariable int id, @PathVariable Date date) {
        List<Order> orders = orderService.getAllByCoffeeTableIdAndOrderDate(id,date);
        if (orders.isEmpty()) {
            throw new ObjectNotFoundException("Could not find Order with id: " + id);
        }
        return orders;
    }

    @PostMapping("/orders")
    public Order createOrder(@Valid @RequestBody Order order) {
        return orderService.addOrder(order);
    }

}
