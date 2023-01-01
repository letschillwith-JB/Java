package com.masai.usecases;

import com.masai.Dao.CustomerAddressDaoImpl;
import com.masai.models.Address;

import java.util.Set;

public class GetCustomerAddressesById {
    public static void main(String[] args) {
        CustomerAddressDaoImpl customerAddressDao = new CustomerAddressDaoImpl();
        Set<Address> addressSet =  customerAddressDao.getCustomerAddressByCid(1);
        addressSet.forEach(I -> System.out.println(I));
    }
}
