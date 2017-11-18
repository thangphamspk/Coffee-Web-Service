package com.thangphamspk.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "order_details")
public class OrderDetail implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "drink_id")
    private Drink drink;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Order order;

    //Số lượng bán
    private int amount;

    //Giá bán thật sự
    private Double price;

    private Date createDate;

    public OrderDetail() {
    }

    public OrderDetail(Drink drink, Order order, int amount, Double price, Date createDate) {
        this.drink = drink;
        this.order = order;
        this.amount = amount;
        this.price = price;
        this.createDate = createDate;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}



