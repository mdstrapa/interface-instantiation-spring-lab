package com.marcosoft.interfaceinstantiationspringlab.repository;

import com.marcosoft.interfaceinstantiationspringlab.model.Customer;

import java.util.List;

public interface CustomerRepository {
    Customer findById(Integer customerId);

    List<Customer> findAll();

    Customer create(Customer newCustomer);

    void deleteCustomer(Integer customerId);

}
