package com.masai.Usecases;

import com.masai.Utility.ProvideConnection;
import com.masai.models.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class RetrieveUsers {
    public static void main(String[] args) {
        EntityManager em = ProvideConnection.getConnection();
        Query q = em.createQuery("from User");
        List<User> list =  q.getResultList();
        list.forEach(I -> System.out.println(I) );
    }
}
