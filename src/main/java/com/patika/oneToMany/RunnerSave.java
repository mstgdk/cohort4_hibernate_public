package com.patika.oneToMany;

import com.patika.oneToOne.Computer;
import com.patika.oneToOne.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave {
    public static void main(String[] args) {
        Student02 st1 = new Student02();
        st1.setId(2);
        st1.setName("mesut");
        st1.setSchoolNumber(123);




        Book b1 = new Book();
        b1.setId(1);
        b1.setBookName("ince memed");
        b1.setStudent(st1);

        Book b2 = new Book();
        b2.setId(2);
        b2.setBookName("1984");
        b2.setStudent(st1);

        Book b3 = new Book();
        b3.setId(3);
        b3.setBookName("empati");
        b3.setStudent(st1);





        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student02.class)
                .addAnnotatedClass(Book.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        session.persist(st1);

        session.persist(b1);
        session.persist(b2);
        session.persist(b3);




        session.getTransaction().commit();
        session.close();
    }
}
