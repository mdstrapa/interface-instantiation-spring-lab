package com.marcosoft.interfaceinstantiationspringlab.service;

import com.marcosoft.interfaceinstantiationspringlab.model.Customer;
import com.marcosoft.interfaceinstantiationspringlab.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer findById(Integer customerId){
        return customerRepository.findById(customerId);
    }

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public Customer create(Customer newCustomer){
        return customerRepository.create(newCustomer);
    }

    public void delete(Integer customerId){
        customerRepository.deleteCustomer(customerId);
    }

}
