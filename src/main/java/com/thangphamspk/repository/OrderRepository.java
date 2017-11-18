package com.thangphamspk.repository;


import com.thangphamspk.entity.Order;
import com.thangphamspk.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<OrderDetail> getAllById(int id);

    List<Order> getAllByCoffeeTableIdAndOrderTime(int id,Date date);

}
