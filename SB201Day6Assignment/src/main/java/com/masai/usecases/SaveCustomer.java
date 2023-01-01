package com.masai.usecases;

import com.masai.Dao.CustomerAddressDaoImpl;
import com.masai.models.Address;
import com.masai.models.Customer;

import java.util.List;

public class SaveCustomer {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("Customer1");
        customer1.setEmail("C1@gmail.com");
        customer1.getAddressSet().add(new Address("MP","Bhopal","12345","Home"));
        customer1.getAddressSet().add(new Address("MP","Indore","54321","Office"));

        Customer customer2 = new Customer();
        customer2.setName("Customer2");
        customer2.setEmail("C2@gmail.com");
        Address a1 = new Address("MH","Nagpur","22415","Home");
        Address a2 = new Address("MH","Mumbai","54267","Office");

        customer2.getAddressSet().add(a1);
        customer2.getAddressSet().add(a2);

        CustomerAddressDaoImpl customerAddressDao = new CustomerAddressDaoImpl();
        System.out.println(customerAddressDao.saveCustomerAddress(customer1,customer2));
    }
}
