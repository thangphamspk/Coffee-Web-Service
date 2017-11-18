package com.thangphamspk.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Integer id;

    private Date orderTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Staff staff;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "table_id")
    private CoffeeTable coffeeTable;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;


    private boolean isPaid;

    private Double grandTotal;

    public Order() {

    }

    public Order(Date orderTime, Staff staff, CoffeeTable coffeeTable, boolean isPaid, Double grandTotal) {
        this.orderTime = orderTime;
        this.staff = staff;
        this.coffeeTable = coffeeTable;
        this.isPaid = isPaid;
        this.grandTotal = grandTotal;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public CoffeeTable getCoffeeTable() {
        return coffeeTable;
    }

    public void setCoffeeTable(CoffeeTable coffeeTable) {
        this.coffeeTable = coffeeTable;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

}
