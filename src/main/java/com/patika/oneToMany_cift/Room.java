package com.patika.oneToMany_cift;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Room {
    @Id
    private int id;

    private String color;

    @ManyToOne
     @JoinColumn(name = "house_idddd")
    private House house;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", color='" + color + '\'' +
               // ", house=" + house +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
