package com.patika.oneToMany_cift;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "house__")
public class House {

    @Id
    private int id;

    private int alan;

    @OneToMany(mappedBy = "house")
    private List<Room> rooms = new ArrayList<>();

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", alan=" + alan +
                ", rooms=" + rooms +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlan() {
        return alan;
    }

    public void setAlan(int alan) {
        this.alan = alan;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
