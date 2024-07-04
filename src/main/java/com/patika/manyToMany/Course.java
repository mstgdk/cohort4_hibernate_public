package com.patika.manyToMany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    private int id;

    @Column(name = "crs_name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "course_ogrenci_tablosu",
            joinColumns = {@JoinColumn(name ="course_id" )},
            inverseJoinColumns = {@JoinColumn(name = "ogr_id")}
    )
    private List<Ogrenci> students = new ArrayList<>();

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
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

    public List<Ogrenci> getStudents() {
        return students;
    }

    public void setStudents(List<Ogrenci> students) {
        this.students = students;
    }
}
