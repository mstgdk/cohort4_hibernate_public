package com.patika.manyToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Ogrenci {

    @Id
    private int id;

    @Column(name = "std_name")
    private String name;

    @Column(name = "scl_number")
    private int schoolNumber;

    @ManyToMany(mappedBy = "students")
    private List<Course> courseeList = new ArrayList<>();

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", schoolNumber=" + schoolNumber +
               // ", courseeList=" + courseeList +
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

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public List<Course> getCourseeList() {
        return courseeList;
    }

    public void setCourseeList(List<Course> courseeList) {
        this.courseeList = courseeList;
    }
}
