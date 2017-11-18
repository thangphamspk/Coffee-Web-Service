package com.thangphamspk.service;

import com.thangphamspk.entity.Order;

import java.util.Date;
import java.util.List;

public interface OrderService {

    Order addOrder(Order order);

    List<Order> getOrders();

    Order getOrder(Integer id);

    List<Order> getAllByCoffeeTableIdAndOrderDate(int id, Date date);
}
