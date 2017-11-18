package com.thangphamspk.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "prices")
public class PriceList implements Serializable{

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private Drink drink;

    @Id
    private Date date;

    private Double priceIn;

    private Double priceOut;

    private int amount;

    public PriceList() {
    }

    public PriceList(Date date, Double priceIn, Double priceOut, int amount) {
        this.date = date;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Double getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(Double priceIn) {
        this.priceIn = priceIn;
    }

    public Double getPriceOut() {
        return priceOut;
    }

    public void setPriceOut(Double priceOut) {
        this.priceOut = priceOut;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
