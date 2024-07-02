package com.patika.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave {
    public static void main(String[] args) {
        Computer com1 = new Computer();
        com1.setId(1);
        com1.setBrand("LG");
        com1.setModel("l100");


        Computer com2 = new Computer();
        com2.setId(2);
        com2.setBrand("sony");
        com2.setModel("s200");



        Student st1 = new Student();
        st1.setId(1);
        st1.setName("mesut");
        st1.setSchoolNumber(123);
        st1.setComputer(com1);

        Student st2 = new Student();
        st2.setId(2);
        st2.setName("emre");
        st2.setSchoolNumber(124);
        st2.setComputer(com2);


        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Computer.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        session.persist(st1);
        session.persist(st2);
        session.persist(com1);
        session.persist(com2);




        session.getTransaction().commit();
        session.close();

    }
}
