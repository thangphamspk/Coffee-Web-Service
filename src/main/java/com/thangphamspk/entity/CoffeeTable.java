package com.thangphamspk.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tables")
public class CoffeeTable {
    @Id
    @GeneratedValue
    private Integer id;

    //Tên bàn
    private String name;

    //Sức chứa
    private Integer capacity;

    //Trạng thái hoạt động
    private boolean status;


    @OneToMany(mappedBy = "coffeeTable")
    private List<Order> orderList;

    public CoffeeTable() {
    }

    public CoffeeTable(String name, Integer capacity, boolean status) {
        this.name = name;
        this.capacity = capacity;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "CoffeeTable{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", status=" + status +
                '}';
    }
}
