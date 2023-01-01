package com.masai.Dao;

import com.masai.models.Address;
import com.masai.models.Customer;
import com.masai.utility.ProvideConnection;

import javax.persistence.EntityManager;
import java.util.Set;

public class CustomerAddressDaoImpl implements CustomerAddressDao {
    @Override
    public String saveCustomerAddress(Customer c1, Customer c2) {
        EntityManager em = ProvideConnection.getEntityManager();
        em.getTransaction().begin();
        em.persist(c1);
        em.persist(c2);
        em.getTransaction().commit();
        em.close();
        return "Customer saved successfully...";
    }

    @Override
    public Set<Address> getCustomerAddressByCid(int cId) {
        EntityManager em = ProvideConnection.getEntityManager();
        Customer customer = em.find(Customer.class,cId);
        if(customer!=null){
            Set<Address> customerList = customer.getAddressSet();
            return customerList;
        }else System.out.println("No Customer found with Id: "+cId);
        return null;
    }
}
