package com.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //Creating Answers
        Answer a1 = new Answer(201, "It's a programming language.");
        Answer a2 = new Answer(202, "It's a ORM tool which implement JPA framework of Java.");
        Answer a3 = new Answer(203, "It's a scripting language.");

        //creating Questions
        Question q1 = new Question(101, "What is Java?", a1);
        Question q2 = new Question(102, "What is Hiberate?", a2);
        Question q3 = new Question(103, "What is JavaScript?", a3);

        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();

        session.save(a1);
        session.save(a2);
        session.save(a3);
        System.out.println("Answer table created");
        session.save(q1);
        session.save(q2);
        session.save(q3);
        txn.commit();

        session.close();
        factory.close();
    }
}
