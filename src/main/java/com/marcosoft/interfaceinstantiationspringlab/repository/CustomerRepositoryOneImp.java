package com.marcosoft.interfaceinstantiationspringlab.repository;

import com.marcosoft.interfaceinstantiationspringlab.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerRepositoryOneImp implements CustomerRepository{
    @Override
    public Customer findById(Integer customerId) {
        return new Customer(customerId,"Carlos",45);
    }

    @Override
    public List<Customer> findAll() {

        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer(1,"Daniela",19));
        customerList.add(new Customer(2,"Afonso",21));
        customerList.add(new Customer(3,"Jennifer",16));
        customerList.add(new Customer(3,"Paula",16));
        customerList.add(new Customer(3,"Mauro",16));
        customerList.add(new Customer(3,"Nicolas",16));

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
