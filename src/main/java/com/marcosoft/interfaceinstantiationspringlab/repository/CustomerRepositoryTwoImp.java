package com.marcosoft.interfaceinstantiationspringlab.repository;

import com.marcosoft.interfaceinstantiationspringlab.model.Customer;


import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryTwoImp implements CustomerRepository{
    @Override
    public Customer findById(Integer customerId) {
        return new Customer(customerId,"Bruno",76);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer(1,"Joana",19));
        customerList.add(new Customer(2,"Marcia",21));
        customerList.add(new Customer(3,"Renato",16));

        return customerList;
    }

    @Override
    public Customer create(Customer newCustomer) {
        return new Customer(newCustomer.id(), newCustomer.name(), newCustomer.age());
    }

    @Override
    public void deleteCustomer(Integer customerId) {

    }
}
