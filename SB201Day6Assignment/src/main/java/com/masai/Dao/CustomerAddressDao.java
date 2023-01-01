package com.masai.Dao;

import com.masai.models.Address;
import com.masai.models.Customer;

import java.util.List;
import java.util.Set;

public interface CustomerAddressDao {
    String saveCustomerAddress(Customer c1,Customer c2);

    Set<Address> getCustomerAddressByCid(int cId);


}
