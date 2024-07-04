package com.patika.ManyTOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class University {
    @Id
    private int id;
    @Column(name = "uni_name")
    private String name;

    @OneToMany(mappedBy = "university")
    private List<Student03> list = new ArrayList<>();

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student03> getList() {
        return list;
    }

    public void setList(List<Student03> list) {
        this.list = list;
    }
}
