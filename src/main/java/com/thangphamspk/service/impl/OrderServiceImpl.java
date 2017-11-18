package com.thangphamspk.service.impl;

import com.thangphamspk.entity.Order;
import com.thangphamspk.repository.OrderRepository;
import com.thangphamspk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderServiceImpl() {
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrder(Integer id) {
        return orderRepository.findOne(id);
    }

    @Override
    public List<Order> getAllByCoffeeTableIdAndOrderDate(int id, Date date) {
        return orderRepository.getAllByCoffeeTableIdAndOrderTime(id, date);
    }
}
