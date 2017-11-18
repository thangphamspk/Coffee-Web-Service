package com.thangphamspk.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "drink_types")
public class DrinkType {
    @Id
    @GeneratedValue
    @JsonProperty
    private Integer id;

    private String image;

    private String name;


    @OneToMany(mappedBy = "drinkType")
    @JsonIgnore
    private List<Drink> drinks;

    public DrinkType() {
    }

    public DrinkType(String image, String name) {
        this.image = image;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }
}
