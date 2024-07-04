package com.patika.oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student02.class)
                .addAnnotatedClass(Book.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

       /*Student02 stdu= session.get(Student02.class,1);
        System.out.println(stdu);*/

        Book b = session.get(Book.class,2);
        System.out.println(b);

        session.getTransaction().commit();
        session.close();

    }
}
