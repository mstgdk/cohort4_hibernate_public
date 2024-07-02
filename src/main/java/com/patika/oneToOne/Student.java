package com.patika.oneToOne;

import jakarta.persistence.*;

@Entity
@Table(name = "student01")
public class Student {

    @Id
    private int id;

    @Column(name = "std_name")
    private String name;

    @Column(name = "scl_number")
    private int schoolNumber;

    @OneToOne
    @JoinColumn(name = "comp_id")
    private Computer computer;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", computer=" + computer +
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

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
