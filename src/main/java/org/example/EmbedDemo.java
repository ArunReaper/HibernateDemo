package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student st1 = new Student(10, "Rey Mysterio", "San Diego");
        Certificate certificate1 = new Certificate("Hibernate Course", 10);
        st1.setCertificate(certificate1);

        Student st2 = new Student(20, "CM Punk", "Chicago");
        Certificate certificate2 = new Certificate("Java Course", 36);
        st2.setCertificate(certificate2);

        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();

        session.save(st1);
        session.save(st2);

        txn.commit();
        session.close();
        factory.close();

    }
}
