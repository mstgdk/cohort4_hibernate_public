package com.patika.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Computer.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

       Student student = session.get(Student.class,1);
        System.out.println(student);

        /*Computer computer = session.get(Computer.class,1);
        System.out.println(computer);*/


        session.getTransaction().commit();
        session.close();
    }
}
