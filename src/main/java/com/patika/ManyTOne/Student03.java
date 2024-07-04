package com.patika.ManyTOne;

import jakarta.persistence.*;

@Entity
public class Student03 {

    @Id
    private int id;

    @Column(name = "std_name")
    private String name;

    @Column(name = "scl_number")
    private int schoolNumber;

    @ManyToOne
    @JoinColumn
    private University university;

    @Override
    public String toString() {
        return "Student03{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", university=" + university +
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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
