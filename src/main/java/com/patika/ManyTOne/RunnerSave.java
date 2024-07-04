package com.patika.ManyTOne;

import com.patika.oneToOne.Computer;
import com.patika.oneToOne.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student03.class)
                .addAnnotatedClass(University.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();






        session.getTransaction().commit();
        session.close();

    }
    }

