package com.patika.oneToMany_cift;

import com.patika.oneToMany.Book;
import com.patika.oneToMany.Student02;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave {
    public static void main(String[] args) {
        House h1 = new House();
        h1.setId(1);
        h1.setAlan(44);

        Room r1 =new Room();
        r1.setId(1);
        r1.setColor("blue");
        r1.setHouse(h1);

        Room r2 =new Room();
        r2.setId(2);
        r2.setColor("red");
        r2.setHouse(h1);

        Room r3 =new Room();
        r3.setId(3);
        r3.setColor("yellow");
        r3.setHouse(h1);






        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(House.class)
                .addAnnotatedClass(Room.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        session.persist(h1);
        session.persist(r1);
        session.persist(r2);
        session.persist(r3);




        session.getTransaction().commit();
        session.close();
    }
}
