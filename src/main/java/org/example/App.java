package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome To Hibernate Tutorial");

        Configuration cfg = new Configuration();
        cfg.configure("cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //Creating Student
        Student st1 = new Student(1, "Yogesh", "Bhayander");
        Student st2 = new Student(2, "Arun", "Thane");
        Student st3 = new Student(3, "Rock", "Miami");

        //Creating Address
        Address add = new Address();
        add.setStreet("Kashi Nagar");
        add.setCity("Bhayander");
        add.setPostalAddress(true);
        add.setDateAdded(new Date());
        add.setSalary(1500.27);

        //Reading Image
        FileInputStream fis = new FileInputStream("src/main/resources/photo.jpg");
        byte[] image = new byte[fis.available()];
        add.setImage(image);

        //System.out.println(st);

        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        session.save(st1);
        session.save(st2);
        session.save(st3);
        session.save(add);
        txn.commit();
        session.close();
        System.out.println("Done!!");

    }
}
