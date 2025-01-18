package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDetails {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

//        Student st1 = (Student) session.get(Student.class, 3);
//        Student st2 = (Student) session.get(Student.class, 3);
        Address add = (Address) session.load(Address.class, 1);

//        System.out.println(st1);
//        System.out.println(st2);
//        System.out.println(add.getCity());

        session.close();
        factory.close();
    }

}
