package com.thangphamspk.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "staffs")
public class Staff {
    @Id
    @GeneratedValue
    @JsonProperty
    private Integer id;

    private String name;

    @NotNull
    @Size(min=10,max=10)
    @Pattern(regexp="(^$|[0-9]{10})")
    private String phone;

    private String password;

    private boolean active;


    @JsonIgnore
    @OneToMany(mappedBy = "staff")
    private List<Order> orders;

    public Staff() {
    }

    public Staff(String name, String phone, String password, boolean active) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
