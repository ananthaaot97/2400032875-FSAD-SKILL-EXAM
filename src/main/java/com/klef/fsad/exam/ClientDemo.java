package com.klef.fsad.exam;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ClientDemo 
{
    public static void main(String[] args) 
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Booking b1 = new Booking("Anantha","2026-03-12","Confirmed");
        Booking b2 = new Booking("Eren","2026-03-15","Pending");

        session.save(b1);
        session.save(b2);

        tx.commit();

        Query q = session.createQuery("from Booking");

        List<Booking> list = q.list();

        System.out.println("Booking Records");

        for(Booking b : list)
        {
            System.out.println(b.getId()+" "
            +b.getName()+" "
            +b.getDate()+" "
            +b.getStatus());
        }

        session.close();
        sf.close();
    }
}