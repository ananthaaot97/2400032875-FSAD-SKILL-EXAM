package com.klef.fsad.exam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String date;
    private String status;

    // Default constructor
    public Booking()
    {
        
    }

    // Parameterized constructor
    public Booking(String name, String date, String status)
    {
        this.name = name;
        this.date = date;
        this.status = status;
    }

    // Getters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDate()
    {
        return date;
    }

    public String getStatus()
    {
        return status;
    }
}