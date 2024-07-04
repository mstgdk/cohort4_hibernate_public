package com.patika.manyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Ogrenci.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

       Course course = session.get(Course.class,3);
        System.out.println(course);


        session.getTransaction().commit();
        session.close();
    }
}
