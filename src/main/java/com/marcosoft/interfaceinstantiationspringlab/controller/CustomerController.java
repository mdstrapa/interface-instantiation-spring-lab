package com.marcosoft.interfaceinstantiationspringlab.controller;

import com.marcosoft.interfaceinstantiationspringlab.model.Customer;
import com.marcosoft.interfaceinstantiationspringlab.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping()
    public ResponseEntity<String> apiStatus(){
        return ResponseEntity.ok().build();
    }

    @GetMapping("{customerId}")
    public ResponseEntity<Customer> findById(@PathVariable Integer customerId){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.findById(customerId));
    }

    @GetMapping("all")
    public ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.findAll());
    }

}
