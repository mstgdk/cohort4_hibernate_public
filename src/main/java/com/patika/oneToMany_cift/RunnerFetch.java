package com.patika.oneToMany_cift;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(House.class)
                .addAnnotatedClass(Room.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        House house = session.get(House.class, 1);
        System.out.println(house.getAlan());


        session.getTransaction().commit();
        session.close();
    }
}
