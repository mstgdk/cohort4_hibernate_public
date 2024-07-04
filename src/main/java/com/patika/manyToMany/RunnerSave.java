package com.patika.manyToMany;

import com.patika.oneToOne.Computer;
import com.patika.oneToOne.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class RunnerSave {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.setId(1);
        c1.setName("math");

        Course c2 = new Course();
        c2.setId(2);
        c2.setName("eng");

        Course c3 = new Course();
        c3.setId(3);
        c3.setName("java");

        Course c4 = new Course();
        c4.setId(4);
        c4.setName("gym");

        Ogrenci og1 = new Ogrenci();
        og1.setId(1);
        og1.setName("mesut");
        og1.setSchoolNumber(123);

        Ogrenci og2 = new Ogrenci();
        og2.setId(2);
        og2.setName("kaan");
        og2.setSchoolNumber(153);

        Ogrenci og3 = new Ogrenci();
        og3.setId(3);
        og3.setName("onur");
        og3.setSchoolNumber(163);

        Ogrenci og4 = new Ogrenci();
        og4.setId(4);
        og4.setName("ebru");
        og4.setSchoolNumber(173);

        List<Ogrenci> ogrList = new ArrayList<>();
        ogrList.add(og1);
        ogrList.add(og2);

        List<Ogrenci> ogrList2 = new ArrayList<>();
        ogrList2.add(og3);
        ogrList2.add(og4);

        List<Ogrenci> ogrList3 = new ArrayList<>();
        ogrList3.add(og1);
        ogrList3.add(og2);

        c1.setStudents(ogrList);
        c2.setStudents(ogrList3);
        c3.setStudents(ogrList2);

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Ogrenci.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

      session.persist(c1);
      session.persist(c2);
      session.persist(c3);
      session.persist(c4);
      session.persist(og1);
      session.persist(og2);
      session.persist(og3);
      session.persist(og4);




        session.getTransaction().commit();
        session.close();

    }
    }

