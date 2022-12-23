package com.masai.utility;

import jdk.jfr.Percentage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProvideConnection {
    public static EntityManager getConnection(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BankUnit");
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
